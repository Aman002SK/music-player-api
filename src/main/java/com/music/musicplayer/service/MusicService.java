package com.music.musicplayer.service;

import java.util.List;

import com.music.musicplayer.entitites.Music;

public interface MusicService {
	
	public List<Music> getMusics();
	public Music getMusic(long musicId);
	public Music addMusic(Music music);
	public void deleteMusic(long parseLong);
}
