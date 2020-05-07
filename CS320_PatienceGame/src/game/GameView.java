package game;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import views.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import piles.Foundation;
import piles.TableauColumn;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JPanel;

import cards.Card;
import decks.PokerDeck;

import java.awt.BorderLayout;

public class GameView extends JFrame implements ActionListener {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private GridBagLayout grid;
	private GridBagConstraints constraints;
	private Container gameWindow = getContentPane();
	private Container welcomeWindow = getContentPane();
	private JButton newGame;
	private GamePieceViews view;
	private ArrayList<GamePieceViews> fview = new ArrayList<GamePieceViews>();
	private ArrayList<TableauxView> tview = new ArrayList<TableauxView>();
	private WastePileView wview = new WastePileView();
	private StockPileView sview = new StockPileView();
	
	//private ArrayList<TableauColumn> tableaux = new ArrayList<TableauColumn>();
	private ArrayList<Foundation> foundations = new ArrayList<Foundation>();
	private ArrayList<Card> stockPile = new ArrayList<Card>();

	private ArrayList<Card> wastePile = new ArrayList<Card>();

	private JFrame frame;
	private GameController game = new GameController();
	private GamePieceViews source;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		final JFrame window = new GameView();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("");
		window.setSize(1024, 768);
		window.setResizable(false);

		window.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public GameView() {
		getContentPane().setBackground(new Color(102, 205, 170));
		setBackground(new Color(102, 205, 170));

		initialize();
	}

	private void createGameWindow() {
		
		
		gameWindow = getContentPane();
		gameWindow.setLayout(grid);

		gameWindow.setFont(new Font("Engravers MT", Font.PLAIN, 12));

		game = new GameController();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		view = new GameView.AppViewInformer();

		source = null;
		grid = new GridBagLayout();
		constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridheight = 2;
		constraints.gridwidth = 8;

		createGameWindow();

		createPanels();
		gameButtons();

	}

	private void createPanels() {

		//tableaux = game.table.getTableaux();
		foundations = game.table.getFoundations();
		
		tview = new ArrayList<TableauxView>();
		fview = new ArrayList<GamePieceViews>();
		
		System.out.println("Creating tableaux panels...");
		for (int j = 0; j <= 6; j++) {
			tview.add(new TableauxView());

			addToGrid(tview.get(j), j, 2, 500, 1, 1.0, 2.0);
		}

		System.out.println("Tableaux Panels created!");
		constraints.anchor = GridBagConstraints.PAGE_START;
		System.out.println("Creating foundations panels...");
		for (int j = 0; j <= 3; j++) {
			fview.add(new FoundationView());
			System.out.println("Foundation JPanel Created!");
			constraints.anchor = GridBagConstraints.PAGE_START;
			addToGrid(fview.get(j), 4 + j, 0, 125, 1, 0.5, 0.0);

		}
		System.out.println("Foundation panels created!");
		
		wview.add(new WastePileView());
		sview.add(new StockPileView());
		addToGrid(sview, 0, 0, 125, 1, 0.5, 0.0);
		addToGrid(wview, 2, 0, 125, 1, 0.5, 0.0);
		
		
	}

	/*
	 * Creates the game buttons.
	 */
	private void gameButtons() {
		newGame = new JButton("Reset Game");
		newGame.setSize(50, 50);
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.reset();
			}
		});
		constraints.anchor = GridBagConstraints.PAGE_END;

		menuBar = new JMenuBar();
		menu = new JMenu("Options");

		menuBar.add(menu);

		menuItem = new JMenuItem("Rules");

		menuItem.addActionListener(this);

		menuItem = new JMenuItem("Rules");

		menuItem.addActionListener(this);

		menu.add(newGame);

		this.setJMenuBar(menuBar);
	}

	/*
	 * Since the GUI uses a gridbaglayout, this method adds the panels to the grid.
	 *
	 */
	public void addToGrid(Component panel, int x, int y, int pady, int width, double wx, double wy) {
		constraints.ipady = pady;
		constraints.ipadx = 100;
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.weightx = wx;
		constraints.weighty = wy;
		constraints.gridwidth = width;
		grid.setConstraints(panel, constraints);
		gameWindow.setLayout(grid);
		gameWindow.add(panel);
	}

	private class AppViewInformer extends GamePieceViews {
		private AppViewInformer() {
		}

		public void panelPressed(GamePieceViews c) {
			// if (game.gameLost())
			// {
			// JOptionPane.showMessageDialog(FreeCell_GUI.this, "No more moves");
			if (game.GameWon()) {
				JOptionPane.showMessageDialog(GameView.this, "You win");
			} else if (source == null) {
				source = c;
				System.out.println("FromPanel is reset");
			} else if (c == source) {
				source = null;

				System.out.println("FromPanel was selected again");
			
			} else {
				source = null;

				JOptionPane.showMessageDialog(GameView.this, "Move Not Allowed!");
			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
