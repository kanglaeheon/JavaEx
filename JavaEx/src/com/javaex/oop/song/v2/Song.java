package com.javaex.oop.song.v2;


// v2. 클래스의 기본 생성자와
// 모든 필드를 초기화 할 수 있는 생성자 작성 및 테스트
public class Song {
		
	//	필드 선언
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//	기본 생성자
	public Song() {}
	
	//	모든 필드를 초기화하는 생성자
	public Song(String artist, String title, String album, int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
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
