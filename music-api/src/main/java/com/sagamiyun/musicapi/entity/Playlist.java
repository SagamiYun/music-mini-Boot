package com.sagamiyun.musicapi.entity;

import com.sagamiyun.musicapi.enums.PlayListStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Playlist extends BaseEntity {
    private String name;

    private String description;

    @OneToOne
    private File cover;

    @Enumerated(EnumType.STRING)
    private PlayListStatus status;

    @OneToOne
    private User creator;

    @ManyToMany
    @JoinTable(name = "playlist_music", joinColumns = @JoinColumn(name = "playlist_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "music_id", referencedColumnName = "id"))
    private List<Music> musicList;
}
