package com.peyo.AmazonViewer.model;

public class Chapter extends Movie {
	
	
	private int id;
	private int sessionNumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.setSessionNumber(sessionNumber);
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString( ) {
		return "Title: " + getTitle() + 
				"\n Genre: " + getGenre() +
				"\n Year: " + getYear() +
				"\n Duration: " + getDuration();
	}
	
}
