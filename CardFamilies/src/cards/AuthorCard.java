package cards;
import java.util.ArrayList;

public class AuthorCard extends Card {

	
	private ArrayList<String> works;
	private String author;
	private String title;
	
	
	
	public AuthorCard(int newRank,String newSuit) {
		super(newRank, newSuit);
		
		
		// TODO Auto-generated constructor stub
	}
	
	//Overloaded Constructor
	public AuthorCard(int newRank,String newSuit, String newAuthor, String newTitle) {
		super(newRank, newSuit);
		author = newAuthor;
		title = newTitle;
		
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
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
	


}
