package com.javaex.oop.song.v3;


// v3. 노래 제목과 가수만 입력 받아 필드를 초기화하는 생성자를 오버로드
// 모든 필드 입력 생성자에서 이 생성자를 호출
public class Song {
		
	//	필드 선언
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//	제목, 가수 생성자
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	//	기본 생성자
	public Song() {}
	
	//	모든 필드를 초기화하는 생성자
	public Song(String artist, String title, String album, int year, int track, String composer) {
		this(title, artist);
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
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
