package views;

import javax.swing.*;
import javax.swing.border.Border;

import cards.Card;
import game.GameView;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import piles.*;

public abstract class GamePieceViews extends JPanel {

	private Pile instance;
	  

	public GamePieceViews() {
		addMouseListener(new PieceListener(this));
		//setBounds(100, 100, 800, 600);
		setBackground(new Color(102, 255, 204));
	

	}

	public Pile getPile() {
		return instance;
	}



	private class PieceListener extends MouseAdapter {
		GamePieceViews views;

		private PieceListener(GamePieceViews v) {
			views = v;
		}

		public void mousePressed(MouseEvent e) {
			// view.panelPressed(panel);
		}
	}

	public boolean isEmpty() {

		return instance.isEmpty();
	}
	
	protected Card topCard()
	{
		return instance.get(0);
	}

}
