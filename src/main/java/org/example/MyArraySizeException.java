package org.example;

class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String msg) {

       super("Размер массива не соответствует.\n" + " " + msg);
    }

}