package org.example;

import com.google.common.io.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/*
* -i - data file is integer
* -s - data file is string
* -a - up sorting
* -d - down sorting
* */

/*
* Краткое описание:
* Это консольное приложение, пользователь пишет названием приложения и
* передает туда флаги и файлы
* флаги -i || -s обязательны, но могут быть либо первыми либо вторыми
* флаги -a || -d не обязательны, но по умолчанию идет -a
* надо написать свой алгортим для сортировки чисел и слов
* */
public class Main {
    public static void main(String[] args) {
       InterfaceApp app = new InterfaceApp();

       if (!app.checkFlags(Arrays.stream(args).toList())){
           System.out.println("Input one flags for type files\n-s - String data\n-i - Integer data");
           return;
       }

       var listFilename = app.extractFiles(Arrays.stream(args).toList());
       if (listFilename.isEmpty()){
           System.out.println("File no input");
           return;
       }
       List<FileData> readFiles = listFilename.stream()
                       .map(Utils::readFile).toList();


        System.out.println();

    }
}