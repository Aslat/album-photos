package com.example.PhotoAlbum.application.usecase;

import com.example.PhotoAlbum.domain.entity.Album;

public interface GetAlbumUseCase {

    Album getAlbum(Long albumId);
}
