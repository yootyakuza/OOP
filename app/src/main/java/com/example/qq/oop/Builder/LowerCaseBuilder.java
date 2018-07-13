package com.example.qq.oop.Builder;

/**
 * Created by Sarayut on 6/7/2561.
 */
public class LowerCaseBuilder extends TextBuilder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void builderTextLineLower(String str) {
        sb.append(str.toLowerCase());
    }

    @Override
    public String getResultLower() {
        return sb.toString();
    }
}
