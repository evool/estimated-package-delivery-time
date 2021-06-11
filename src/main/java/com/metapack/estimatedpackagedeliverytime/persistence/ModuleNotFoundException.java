package com.metapack.estimatedpackagedeliverytime.persistence;

public class ModuleNotFoundException extends RuntimeException {
    public ModuleNotFoundException(long id) {
        super("Could not find module " + id);
    }
}
