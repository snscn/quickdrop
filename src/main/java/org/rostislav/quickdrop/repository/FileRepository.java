package org.rostislav.quickdrop.repository;

import org.rostislav.quickdrop.model.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {

}
