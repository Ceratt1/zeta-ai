package com.zeta.ai.zeta_ai.application.exceptions;

import java.time.OffsetDateTime;

public class ErrorResponse {

    private String message;
    private String contactEmail;
    private OffsetDateTime timestamp;

    public ErrorResponse(String message, String contactEmail) {
        this.message = message;
        this.contactEmail = contactEmail;
        this.timestamp = OffsetDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
