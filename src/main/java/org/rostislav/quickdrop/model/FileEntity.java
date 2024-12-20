package org.rostislav.quickdrop.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String uuid;
    public String description;
    public long size;
    public boolean keepIndefinitely;
    public LocalDate uploadDate;
    public String passwordHash;

    @PrePersist
    public void prePersist() {
        uploadDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "FileEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", keepIndefinitely=" + keepIndefinitely +
                ", uploadDate=" + uploadDate +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
