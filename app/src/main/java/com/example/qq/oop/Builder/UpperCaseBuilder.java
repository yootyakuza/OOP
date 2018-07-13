package com.example.qq.oop.Builder;

/**
 * Created by Sarayut on 6/7/2561.
 */
public class UpperCaseBuilder extends TextBuilder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void buildTextLineUpper(String str) {
        sb.append(str.toUpperCase());
    }

    @Override
    public String getResultUpper() {
        return sb.toString();
    }
}
