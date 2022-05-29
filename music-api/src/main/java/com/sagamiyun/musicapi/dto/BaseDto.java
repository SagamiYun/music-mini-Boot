package com.sagamiyun.musicapi.dto;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseDto {
    private String id;

    private Date createdTime;

    private Date updatedTime;
}