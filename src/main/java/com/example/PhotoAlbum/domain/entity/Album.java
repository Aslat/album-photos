package com.example.PhotoAlbum.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Album {
    Long userId;
    Long id;
    String title;
    Set<Photo> photos;
}
