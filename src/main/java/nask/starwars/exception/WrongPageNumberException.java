package nask.starwars.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongPageNumberException extends RuntimeException {


    public WrongPageNumberException(String message) {
        this(message, null);
    }

    public WrongPageNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
