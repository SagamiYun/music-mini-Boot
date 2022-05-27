package com.sagamiyun.musicapi.mapper;

import com.sagamiyun.musicapi.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MusicRepository extends JpaRepository<Music, String> {
    Optional<Music> findById(String id);
}
