package com.peyo.AmazonViewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable {
	private int id;
	private String isbn;
	private boolean read;
	private int timeRead;
	

	public Book(String title, String editorial, int timeRead) {
		super(title, editorial);
		this.timeRead = timeRead;
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}


	public boolean isRead() {
		return read;
	}

	public int getTimeRead() {
		return timeRead;
	}


	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}

	@Override
	public String toString() {
		return "\nTitle: " + getTitle() +
				"\nEditorial: " + getEditorial() +
				"\nTime: " + getTimeRead();
	}
	
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimeRead(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeRead(0);
		}
	}
	
	
}
