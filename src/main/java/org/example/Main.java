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
* ������� ��������:
* ��� ���������� ����������, ������������ ����� ��������� ���������� �
* �������� ���� ����� � �����
* ����� -i || -s �����������, �� ����� ���� ���� ������� ���� �������
* ����� -a || -d �� �����������, �� �� ��������� ���� -a
* ���� �������� ���� �������� ��� ���������� ����� � ����
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