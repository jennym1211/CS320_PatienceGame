package game;
import cards.*;
import piles.*;
import decks.*;
import java.util.ArrayList;
public class GameController {
	
	
	private ArrayList<Foundation> foundations;
	private ArrayList<TableauColumn> tableaux;
	private StockPile stockPile;
	private WastePile wastePile;
	private boolean isWon;
	
	
	
	
	public void CreateGame()
	{
		createFoundations();
		createTableaux();
		createStockPile();
		createWastePile();
	}
	
	public void reset()
	{
		
	}
	
	public void play()
	{
		
	}
	
	
	private ArrayList<Foundation> createFoundations()
	{
		return foundations;
	}
	
	private ArrayList<TableauColumn> createTableaux()
	{
		return tableaux;
	}
	

	private StockPile createStockPile()
	{
		return stockPile;
	}
	
	private WastePile createWastePile()
	{
		return wastePile;
	}
	
	public boolean GameWon()
	{
		return isWon;
	}
	
	public boolean GameLost()
	{
		return false;
	}
	
}


