package org.rostislav.quickdrop.model;

public class FileUploadRequest {
    public String description;
    public boolean keepIndefinitely;

    public FileUploadRequest() {
    }

    public FileUploadRequest(String description, boolean keepIndefinitely) {
        this.description = description;
        this.keepIndefinitely = keepIndefinitely;
    }
}
