package CardFamilies.src;

import java.awt.Image;
import java.util.ArrayList;

public class AuthorCard extends Card {

	
	private ArrayList<String> works;
	private String author;
	private String title;
	
	
	
	public AuthorCard(String newSuit, int newRank) {
		super(newSuit, newRank);
		
		
		// TODO Auto-generated constructor stub
	}
	
	//Overloaded Constructor
	public AuthorCard(String newSuit, int newRank, String newAuthor, String newTitle) {
		super(newSuit, newRank);
		author = newAuthor;
		title = newTitle;
		
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected ArrayList<String> getWorks()
	{
		return works;
	}

	protected String getAuthor()
	{
		return author;
	}
	
	protected String getTitle()
	{
		return title;
	}
	
	@Override
	public Image getBackImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getFrontImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
