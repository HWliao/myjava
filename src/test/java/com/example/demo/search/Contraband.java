package com.example.demo.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Contraband {

    private long id;
    private String destinationCountry;
    private String keyword;
    private int upload;


    public static List<Contraband> testData() {
        String[] countries = new String[]{"KSA", "UAE"};
        String[] keywords = new String[]{
            "枪", "弹药", "keyword", "key药", "red word",
            "枪支", "火药", "电池", "化学品", "毒药",
            "poison", "test key 违禁", "124 sd 违禁", "牛奶", "奶牛"
        };
        Random random = new Random();
        List<Contraband> datas = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            Contraband contraband = new Contraband();
            contraband.setId(i);
            contraband.setDestinationCountry(countries[i % 2]);
            contraband.setUpload(i % 2);
            int max = random.nextInt(keywords.length);
            String[] strings = new String[max];
            for (int j = 0; j < max; j++) {
                strings[j] = keywords[random.nextInt(keywords.length)];
            }
            contraband.setKeyword(String.join(",", strings));
            datas.add(contraband);
        }
        return datas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getUpload() {
        return upload;
    }

    public void setUpload(int upload) {
        this.upload = upload;
    }
}
