package ru.geekbrains.efremov.java2.hw2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        System.out.println(" Размер массива не соответствует !");
    }
}
