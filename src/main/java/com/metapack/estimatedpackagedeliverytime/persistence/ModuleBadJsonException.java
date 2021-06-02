package com.metapack.estimatedpackagedeliverytime.persistence;

public class ModuleBadJsonException extends RuntimeException {
    public ModuleBadJsonException() {
        super("Json format in body is not valid");
    }
}
