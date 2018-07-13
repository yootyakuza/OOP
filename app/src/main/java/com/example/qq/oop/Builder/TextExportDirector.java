package com.example.qq.oop.Builder;

import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sarayut on 6/7/2561.
 */
public class TextExportDirector {

    private List<TextBuilder> builders = new ArrayList<TextBuilder>();

    public void registerBuilder(TextBuilder builder) {
        builders.add(builder);
    }

    public void exportTextToUpper(String filename, TextView tv1) throws IOException {
        String s = "";
        //BufferedReader in = new BufferedReader(new FileReader(filename));
        //while ((s = in.readLine()) != null){}
        for (TextBuilder b : builders) {
            b.buildTextLineUpper(filename);
        }

        for (TextBuilder b : builders) {
            s = b.getResultUpper();
        }
        tv1.setText(s);
    }

    public void exportTextToLower(String filename, TextView tv1) throws IOException {
        String s = "";
        for (TextBuilder b : builders) {
            b.builderTextLineLower(filename);
        }

        for (TextBuilder b : builders) {
            s = b.getResultLower();
        }
        tv1.setText(s);
    }
}
