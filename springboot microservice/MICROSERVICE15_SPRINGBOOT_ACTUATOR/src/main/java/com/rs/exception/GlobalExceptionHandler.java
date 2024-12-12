package com.rs.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(RatingNotFoundxception.class)
    public ResponseEntity<ApiResponse> handleRatingNotFoundException(RatingNotFoundxception ex){
        log.info("The given id not present to exception handled by controller advice");
        ApiResponse ap=ApiResponse.builder().info(ex.getMessage()).status(false).statuscode(HttpStatus.NOT_FOUND.value()).build();
        return new ResponseEntity<ApiResponse>(ap,HttpStatus.NOT_FOUND);
    }

}
