package org.example;

import java.util.ArrayList;
import java.util.List;

public class FileData{
    private String fileName;
    private List<String> dataFile;
    private List<String> errors;

    public FileData(String fileName) {
        this.fileName = fileName;
        this.dataFile = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public FileData(String fileName, List<String> dataFile) {
        this.fileName = fileName;
        this.dataFile = dataFile;
        this.errors = new ArrayList<>();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void putError(String error){
        this.errors.add(error);
    }

    public List<String> getDataFile() {
        return dataFile;
    }

    public void setDataFile(List<String> dataFile) {
        this.dataFile = dataFile;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
