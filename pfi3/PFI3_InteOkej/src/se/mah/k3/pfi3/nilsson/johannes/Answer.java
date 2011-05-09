package se.mah.k3.pfi3.nilsson.johannes;

import java.util.Date;

public class Answer {
	
	private String content;
	private String userName;
	private int likes;
	private Date date;
	
	public Answer(String content, String userName) {
		this.content = content;
		this.userName = userName;
	}
	
	
	public String getContent()
	{
		return content;
	}
	
	public String getUserName()
	{
		return userName;
	}
}
