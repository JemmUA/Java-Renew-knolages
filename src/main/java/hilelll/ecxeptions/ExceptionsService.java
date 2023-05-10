package hilelll.ecxeptions;

import java.io.IOException;
import java.net.BindException;
import java.nio.file.AccessDeniedException;
import java.util.Random;

public class ExceptionsService {
    public void throwCheckedException() throws IOException {
        throw new IOException();
    }
    public void throwUncheckedException() {
        throw new RuntimeException();
//        throw new OutOfMemoryError();

    }
    public void throwTwoCheckedExceptions() throws AccessDeniedException, BindException {
        Random random = new Random();
//        System.out.println(random.nextInt(2));
        switch (random.nextInt(2)) {
            case 0:
                throw new AccessDeniedException("restricted zone");
//                break;
            case 1:
                throw new BindException("bind exception");
//                break;
            default:
                break;

        }

    }
}
