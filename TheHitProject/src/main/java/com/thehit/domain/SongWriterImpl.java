package com.thehit.domain;

import com.thehit.interfaces.Songwriter;

public class SongWriterImpl implements Songwriter{
	
	private String firstname;
	private String lastname;
	private int age;
	private Song song;		
	
	public SongWriterImpl(String firstname, String lastname, int age, Song song) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.song = song;
	}
			
	public SongWriterImpl()
	{
		
	}	
	
	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Override
	public void compose(Song song) {
		String name = getFirstname() + " " + getLastname();
		System.out.println("Composer " + name + " composed a song called " +song.getName() +". This song has the following lyrics "+ song.getLyrics());    
	}
}
