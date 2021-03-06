package com.sagamiyun.musicapi.dto;

import com.sagamiyun.musicapi.enums.MusicStatus;
import lombok.Data;

import java.util.Date;

@Data
public class MusicDto {
    private String id;

    private String name;

    private MusicStatus status;

    private String description;

    private FileDto file;

    private Date createdTime;

    private Date updatedTime;
}