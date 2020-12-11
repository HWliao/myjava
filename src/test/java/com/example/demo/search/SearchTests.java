package com.example.demo.search;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.store.MMapDirectory;
import org.junit.jupiter.api.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SearchTests {

    @Test
    public void searchTest() {
        //实例化IKAnalyzer分词器
        Analyzer analyzer = new IKAnalyzer(true);

        Directory directory = null;
        IndexWriter iwriter = null;
        IndexReader ireader = null;
        IndexSearcher isearcher = null;
        try {
            //建立内存索引对象
            Path path = Paths.get("./bin/index");
            directory = new MMapDirectory(path);

            //配置IndexWriterConfig
            IndexWriterConfig iwConfig = new IndexWriterConfig(analyzer);
            iwConfig.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);
            iwriter = new IndexWriter(directory, iwConfig);
            iwriter.deleteAll();
            //写入索引
            iwriter.addDocuments(getContrabands());
            iwriter.flush();
            iwriter.commit();
            iwriter.forceMerge(1);
            iwriter.close();

            //搜索过程**********************************
            //实例化搜索器
            ireader = DirectoryReader.open(directory);
            isearcher = new IndexSearcher(ireader);

            // country
            Query countryQuery = new TermQuery(new Term("destinationCountry", "UAE"));
            // keyword
            QueryParser keyword = new QueryParser("keyword", analyzer);
            keyword.setDefaultOperator(QueryParser.OR_OPERATOR);
            Query keywordQuery = keyword.parse("枪");

            BooleanQuery bquery = new BooleanQuery.Builder()
                .add(countryQuery, BooleanClause.Occur.MUST)
                .add(keywordQuery, BooleanClause.Occur.MUST)
                .build();
            System.out.println("Query = " + bquery);

            //搜索相似度最高的5条记录
            TopDocs topDocs = isearcher.search(bquery, 5);
            System.out.println("命中：" + topDocs.totalHits);
            //输出结果
            ScoreDoc[] scoreDocs = topDocs.scoreDocs;
            for (int i = 0; i < scoreDocs.length; i++) {
                Document targetDoc = isearcher.doc(scoreDocs[i].doc);
                System.out.println("内容：" + targetDoc.toString());
            }

        } catch (CorruptIndexException e) {
            e.printStackTrace();
        } catch (LockObtainFailedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            if (ireader != null) {
                try {
                    ireader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (directory != null) {
                try {
                    directory.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private List<Document> getContrabands() {
        return Contraband.testData()
            .stream()
            .map(contraband -> {
                Document doc = new Document();
                doc.add(new LongPoint("id", contraband.getId()));
                doc.add(new StoredField("id", contraband.getId()));
                doc.add(new StringField("destinationCountry", contraband.getDestinationCountry(), Field.Store.YES));
                doc.add(new TextField("keyword", contraband.getKeyword(), Field.Store.YES));
                doc.add(new IntPoint("upload", contraband.getUpload()));
                doc.add(new StoredField("upload", contraband.getUpload()));
                return doc;
            })
            .collect(Collectors.toList());
    }


}
