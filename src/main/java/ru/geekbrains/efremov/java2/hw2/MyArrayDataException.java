package ru.geekbrains.efremov.java2.hw2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException (String message){
        System.out.println(" В ячейке массива неверные данные " + message );
    }
}
