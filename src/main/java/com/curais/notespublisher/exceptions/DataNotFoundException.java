package com.curais.notespublisher.exceptions;

public class DataNotFoundException extends GenericException  {
    private String reason;

    public DataNotFoundException(){
        super();
    }

    public DataNotFoundException(String reason) {
        super("Requested item not found");
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
