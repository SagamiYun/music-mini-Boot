package com.sagamiyun.musicapi.entity;

import com.sagamiyun.musicapi.enums.MusicStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
@Data
public class Music extends BaseEntity {
    private String name;

    @Enumerated(EnumType.STRING)
    private MusicStatus status;

    private String description;

    @OneToOne
    private File file;
}
