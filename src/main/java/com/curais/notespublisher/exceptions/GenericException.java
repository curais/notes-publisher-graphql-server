package com.curais.notespublisher.exceptions;

import java.time.LocalDateTime;

public class GenericException extends Exception{
    private final String timestamp;

    
    public GenericException(){
        super();
        this.timestamp = LocalDateTime.now().toString();
    }

    public GenericException(String message) {
        super(message);
        this.timestamp = LocalDateTime.now().toString();
    }
    
    public String getTimestamp() {
        return timestamp;
    }
}
