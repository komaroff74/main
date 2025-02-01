package org.example;

    class MyArrayDataException extends RuntimeException {
        MyArrayDataException(String msg) {

            super("Индекс не может быть изменен.\n" + " " + msg);
        }

    }

