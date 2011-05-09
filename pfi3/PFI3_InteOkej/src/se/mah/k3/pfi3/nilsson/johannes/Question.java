package se.mah.k3.pfi3.nilsson.johannes;
import java.util.ArrayList;
import java.util.Date;


public class Question {
	
	private String title;
	private String content;
	private String userName;
	private String tag;
	private int supporters;
	private Date date;
	
	private ArrayList<Answer> answers;
	
	public Question(String title, String content, String userName, String tag) 
	{
		this.title = title;
		this.content = content;
		this.userName = userName;
		this.tag = tag;
		
		answers = new ArrayList<Answer>();
	}
	
	
	
	public String getTitle()
	{
		return title;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getTag()
	{
		return tag;
	}
	
	public ArrayList<Answer> getAnswers()
	{
		return answers;
	}
	
	public void support()
	{
		supporters ++;
	}
	
	public String toString()
	{
		return title;
	}

}
