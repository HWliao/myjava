package com.example.demo.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.junit.jupiter.api.Test;

public class AnalyzerTests {

    @Test
    public void test() {
        Analyzer analyzer = new DemoAnalzyer();
        AnalzyerUtils.testAnalzyer(analyzer, "Apple,厉害Wong,廖红卫,充电器,刀,ASDW,etew ete,啊啊啊 sfsf");
    }
}
