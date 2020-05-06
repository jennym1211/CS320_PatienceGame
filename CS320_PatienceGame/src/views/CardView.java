package views;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import cards.*;
import javafx.scene.layout.Pane;

public class CardView extends Pane {

	private static Icon back;
	private Icon front;
	private Card instance;
	private Icon image;

	public CardView(Card c) {

		image = getImageFile(instance.getRank(), instance.getSuit());
		if (back == null) {
			back = getBackImage();
		}
	}
	/*
	 * =====================================================
	 * 
	 * Functions to get Image Files for GUI functionality.
	 * ====================================================
	 * 
	 */

	/**
	 * Returns the card's image. It will return the face up image depending on its
	 * rank and suit to the corresponding card, or the back image of the card if it
	 * is not face up. otherwise.
	 * 
	 * @return - the card's face image or the back side image.
	 */
	public Icon getImage() {
		if (isVisible() == true)
			return image;
		else
			return back;
	}

	/**
	 * It will return the back image of the card.
	 * 
	 * @return - the back side Image of a card.
	 */
	public static Icon getBack() {
		if (back == null)
			new PokerCard(1, Suit.SPADES);
		return back;
	}

	/*
	 * This method helps get the image from the deck folder.
	 * 
	 * 
	 */
	private Icon getImageFile(int rank, Suit suit) {

		String fileName = "/CS320_PatienceGame/deck/";

		fileName += rank;

		fileName += Character.toUpperCase(suit.toString().charAt(0));

		fileName += ".png";

		return new ImageIcon(fileName);

	}

	/*
	 * Obtains image of back of a card from deck folder.
	 * 
	 * 
	 */
	private Icon getBackImage() {
		String fileName = "deck/back.png";
		return new ImageIcon(fileName);
	}

}
