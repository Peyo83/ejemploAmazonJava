package com.peyo.AmazonViewer.model;

import java.util.Date;

public class Magazine extends Publication{
	private int id;


	public Magazine(String title, String editorial) {
		super(title, editorial);
	}


	public int getId() {
		return id;
	}
	
}
