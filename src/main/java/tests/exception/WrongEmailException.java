package tests.exception;

import lombok.Getter;

import java.io.IOException;
@Getter
public class WrongEmailException extends IOException {
    public WrongEmailException(String message) {
        super(message);
    }
}
