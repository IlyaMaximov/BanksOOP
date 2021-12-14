package edu.phystech.exception;

public class ApiException extends RuntimeException {
    private String description;

    public ApiException(String description) {
        super(description);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
