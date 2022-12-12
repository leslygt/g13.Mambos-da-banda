package com.mambosdabanda.mambos_da_banda.dto;

import java.util.Date;
import java.sql.Timestamp;

public class ErrorResponse extends ResponseStatus {
    private Timestamp timestamp;

    public ErrorResponse(int status, String message) {
        super(status, message);
        this.timestamp = new Timestamp(new Date().getTime());
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
