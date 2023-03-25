package com.sh.numble.mybox.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="folder")
public class Folder {
    @Id
    @Column(name = "folder_idx", nullable = false)
    private Long idx;
    @ManyToOne
    @JoinColumn(name = "user_idx")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parents_folder_id")
    private Folder parentsFolder;
    @OneToMany(mappedBy = "parentsFolder", cascade = CascadeType.ALL)
    private List<Folder> subFolder = new ArrayList<>();
    private String folderName;
    private Integer folderDepth;
}