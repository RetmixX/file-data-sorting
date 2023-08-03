package org.example;

import java.util.ArrayList;
import java.util.List;

public class InterfaceApp {
    private static final List<String> FLAGS = List.of("-i", "-s", "-a", "-d");

    private List<FileData> inputFiles;

    public InterfaceApp() {}

    public boolean checkFlags(List<String> args){
        return args.contains(FLAGS.get(0)) || args.contains(FLAGS.get(1));
    }

    public List<String> extractFiles(List<String> args){
        return args.stream().filter(file->!FLAGS.contains(file)).toList();
    }

    private void printErrors(List<String> errors){
        System.out.println("<===Errors===>");
        errors.forEach(System.out::println);
        System.out.println("<===Errors===>");
    }





}
