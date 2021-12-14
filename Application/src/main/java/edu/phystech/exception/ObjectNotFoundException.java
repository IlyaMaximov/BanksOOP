package edu.phystech.exception;

public class ObjectNotFoundException extends ApiException {
    public ObjectNotFoundException(long id) {
        super(String.format("Object with id %d not found", id));
    }
}
