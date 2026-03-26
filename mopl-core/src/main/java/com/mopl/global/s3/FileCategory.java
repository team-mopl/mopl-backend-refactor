package com.mopl.global.s3;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FileCategory {
    CONTENT_THUMBNAIL("images/contents/thumbnails"),
    PROFILE_IMAGE("images/profiles"),
    BATCH_LOG("logs/batch");

    private final String path;
}