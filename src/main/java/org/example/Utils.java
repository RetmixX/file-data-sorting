package org.example;

import com.google.common.io.Files;
import com.google.common.primitives.Ints;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static FileData readFile(String filename){
        FileData fileFromUserInput = new FileData(filename);

        try{
            fileFromUserInput.setDataFile(Files.readLines(new File(filename), Charset.defaultCharset()));
        } catch (IOException e) {
            fileFromUserInput.putError(e.getMessage());
        }
        var test = "1";
        return fileFromUserInput;
    }
}
