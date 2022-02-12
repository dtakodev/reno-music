/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
package code.name.monkey.retromusic.model

import kotlinx.android.parcel.Parcelize

/**
 * Created by hemanths on 3/4/19
 */
@Parcelize
class PlaylistSong(
    id: Int,
    title: String,
    trackNumber: Int,
    year: Int,
    duration: Long,
    data: String,
    dateModified: Long,
    albumId: Int,
    albumName: String,
    artistId: Int,
    artistName: String,
    val playlistId: Int,
    val idInPlayList: Int,
    composer: String
) : Song(
    id,
    title,
    trackNumber,
    year,
    duration,
    data,
    dateModified,
    albumId,
    albumName,
    artistId,
    artistName,
    composer
)