package com.music.musicplayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.music.musicplayer.DAO.MusicDao;
import com.music.musicplayer.entitites.Music;
@Service
public class MusicServiceimpl implements MusicService {
	@Autowired
	private MusicDao musicDao;
	//List<Music> list;
	@Override
	
	
	public
	List<Music> getMusics() {
		// TODO Auto-generated method stub
		return musicDao.findAll();
	}
	@Override
	public Music getMusic(long musicId)
	{
		return musicDao.getOne(musicId);
		
	}
	@Override
	public Music addMusic(Music music)
	{
		musicDao.save(music);
		return music;
	}
	@Override
	public void deleteMusic(long parseLong)
	{
		Music entity= musicDao.getOne(parseLong);
		musicDao.delete(entity);
		
	}
	
	
	
}
