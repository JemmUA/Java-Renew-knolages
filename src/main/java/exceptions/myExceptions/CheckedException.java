package main.java.exceptions.myExceptions;

import java.io.IOException;

public class CheckedException extends IOException {
//    String exceptionStr;

    public CheckedException(String message) {
        super(message);
    }
}
