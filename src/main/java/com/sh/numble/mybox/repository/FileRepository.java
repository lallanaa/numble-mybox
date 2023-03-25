package com.sh.numble.mybox.repository;

import com.sh.numble.mybox.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
