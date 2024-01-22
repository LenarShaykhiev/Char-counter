package ru.hmw.aspects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.hmw.exceptions.LineTooLong;

/**
 * The type Rest exception handler.
 */
@ControllerAdvice
public class RestExceptionHandler {

    /**
     * Handle not valid input lines.
     *
     * @param ex the exception
     * @return the exception message with code = 400
     */
    @ExceptionHandler({LineTooLong.class, NullPointerException.class})
    public ResponseEntity<Object> handleNotValid(Exception ex) {
        return ResponseEntity.badRequest().body("exception: " + ex.getMessage());
    }

}
