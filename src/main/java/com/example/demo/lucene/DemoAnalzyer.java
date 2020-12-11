package com.example.demo.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.LowerCaseFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.util.CharTokenizer;

/**
 * 仅以逗号作分隔符进行分词
 *
 * @author HWliao
 */
public class DemoAnalzyer extends Analyzer {
    @Override
    protected TokenStreamComponents createComponents(String fieldName) {
        CharTokenizer charTokenizer = CharTokenizer.fromSeparatorCharPredicate(c -> c == ',');
        return new TokenStreamComponents(charTokenizer, new LowerCaseFilter(charTokenizer));
    }

    @Override
    protected TokenStream normalize(String fieldName, TokenStream in) {
        return new LowerCaseFilter(in);
    }
}
