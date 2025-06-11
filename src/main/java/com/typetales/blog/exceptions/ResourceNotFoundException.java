package com.typetales.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String FieldName;
    long FieldValue;

    public ResourceNotFoundException(String resourceName, String FieldName, long FieldValue) {
        super(String.format("%s not found with %s : %s", resourceName, FieldName, FieldValue));
        this.resourceName = resourceName;
        this.FieldName = FieldName;
        this.FieldValue = FieldValue;
    }
}
