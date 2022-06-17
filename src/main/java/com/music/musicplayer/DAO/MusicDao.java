package com.music.musicplayer.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.musicplayer.entitites.Music;

public interface MusicDao extends JpaRepository<Music, Long> {

}
