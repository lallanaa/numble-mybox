package com.sh.numble.mybox.repository;

import com.sh.numble.mybox.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
