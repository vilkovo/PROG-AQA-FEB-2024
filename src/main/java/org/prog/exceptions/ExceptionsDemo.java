package org.prog.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


//TODO: Catch parent exceptions (Exception / Throwable)
//TODO: Catch specific exception
//TODO: Convert FileNotFoundException into Throwable in readFile3
//TODO: Process Throwable in readFile1
public class ExceptionsDemo {

    public static void main(String[] args) {
            readFile1();
            System.out.println("Тест пройден.");
    }

    public static void readFile1() {
        try {
            readFile2();
        } catch (Throwable throwable){
            System.out.println("Указать правильный путь к файлу.");
        }
    }

    public static void readFile2() throws Throwable {
            readFile3();
    }

    public static void readFile3() throws Throwable {
        try {
            readFile4();
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Файл не найден.");
            throw new Throwable();
        }
    }

    public static void readFile4() throws FileNotFoundException {
        readFile5();
    }

    public static void readFile5() throws FileNotFoundException {
        File f = new File("abc.txt");
        FileReader fileReader = new FileReader(f);
        f.setReadable(true);
    }
}
