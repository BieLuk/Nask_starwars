package nask.starwars.config;

import nask.starwars.exception.ApiError;
import nask.starwars.exception.CharacterNotFoundException;
import nask.starwars.exception.WrongPageNumberException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = {CharacterNotFoundException.class})
    protected ResponseEntity<Object> handleEntityNotFoundException(
            RuntimeException ex) {

        ApiError apiError = new ApiError(NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(value
            = {WrongPageNumberException.class, IllegalArgumentException.class})
    protected ResponseEntity<Object> handleBadRequestException(
            RuntimeException ex) {

        ApiError apiError = new ApiError(BAD_REQUEST);
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError);
    }


    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}