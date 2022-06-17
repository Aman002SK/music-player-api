package com.music.musicplayer.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.music.musicplayer.entitites.Music;
import com.music.musicplayer.service.MusicService;
@RestController
public class MyController {
	private MusicService musicService;
	@GetMapping("/musics")
	public List<Music> getMusics(){
		return this.musicService.getMusics();
	}
	@GetMapping("/musics/{musicId}")
	public Music getMusic(@PathVariable String musicId)
	{
		return this.musicService.getMusic(Long.parseLong(musicId));
	}
	
	@PostMapping("/musics/{musicId}")
	public Music addMusic(@RequestBody Music music)
	{
		return this.musicService.addMusic(music);
	}
	
	@DeleteMapping("/musics/{musicId}")
	public ResponseEntity<HttpStatus> deleteMusic(@PathVariable String music)
	{
		try {
			this.musicService.deleteMusic(Long.parseLong(music));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
