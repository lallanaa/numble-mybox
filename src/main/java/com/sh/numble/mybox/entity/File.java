package com.sh.numble.mybox.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="file")
public class File {
    @Id
    @Column(name = "file_idx", nullable = false)
    private Long idx;
    private String originalFileName;
    private String storedFileName;
    private double fileSize;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folder_idx")
    private Folder folder;
}
