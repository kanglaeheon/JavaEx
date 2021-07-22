package com.javaex.oop.song.v1;

public class Song {
		
	//	필드 선언
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//	생성자 (버전업시 작성 예정)
		
	//	getters/setters
	
	public String getTitle() {
		return title;
		}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getTrack() {
		return track;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	//	메소드
	public void showInfo() {
		String formatShowInfo = String.format("%s, %s ( %s, %d, %d번 track, %s 작곡)",
				artist, title, album, year, track, composer);
		System.out.println(formatShowInfo);
	}
}
