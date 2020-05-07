/**
 * 
 */
package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cards.PokerCard;
import cards.Suit;
import decks.PokerDeck;

/**
 * @author Jennifer
 *
 */
class TableTest {

	
	PokerCard p1 = new PokerCard(1, Suit.DIAMONDS);
	PokerDeck deck = new PokerDeck();
	Table table = new Table();

	
	
	//Card Tests
	@Test
	public void TestCardRank() {
		assertEquals(1, p1.getRank());

	}

	@Test
	public void TestCardSuit() {

		assertEquals(Suit.DIAMONDS, p1.getSuit());
	}

	@Test
	public void GetNameTest() {
		assertEquals("||1 of " + Suit.DIAMONDS, p1.toString());
	}

	@Test
	public void VisibleTest() {
		assertEquals(true, p1.isVisible());
	}
	
	
	@Test
	public void HideCardTest()
	{
		p1.hide();
		
		assertEquals(false, p1.isVisible());
	}
	
	
	//Deck Tests
	@Test
	public void AssertDeckSize()
	{
		assertEquals(52, deck.size());
	}
	
	@Test
	public void SizeAfterDeal()
	{
		deck.deal();
		assertEquals(51, deck.size());
	}
	
	
	//Table piece tests
	@Test
	public void AssertTableauxSize()
	{
		assertEquals(7, table.getTableaux().size());
	}
	
	@Test
	public void assertFoundationSize()
	{
		assertEquals(4, table.getFoundations().size());
	}
	
	@Test
	public void AssertWastePileIsZero()
	{
		assertEquals(0, table.wastePile.size());
	}
	
	public void AssertStockPileSize()
	{
		assertEquals(24, table.stockPile.size());
	}
	
	
	
	
}