package com.sagamiyun.musicapi.vo;

import com.sagamiyun.musicapi.enums.FileStatus;
import com.sagamiyun.musicapi.enums.FileType;
import lombok.Data;

@Data
public class FileVo extends BaseVo {
    private String name;

    private String key;

    private String ext;

    private Long size;

    private FileType type;

    private FileStatus status;
}