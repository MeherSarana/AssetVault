package com.jfs.training.exceptions;

public class InvalidAssetIdException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidAssetIdException(String message) {
        super(message);
    }
}
