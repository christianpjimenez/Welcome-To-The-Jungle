package package01;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import package01.Game.ChoiceHandler;

public class UI 
{
	//These are the buttons, panels and labels that we will use in the Interface.
	//I've also created a default font 
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel; 
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);
	
	public void createUI(ChoiceHandler cHandler) 
	{
		
		//WINDOW
		//These are the codes to set up the size, background and close function of the window
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		//TITLE SCREEN
		//These are the codes for the main screen, containing the parameters for the title and start button
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(18, 25, 750, 500);
		titleNamePanel.setBackground(Color.green);
		titleNameLabel = new JLabel("Memories of a Tree");
		titleNameLabel.setForeground(Color.black);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(250, 300, 300, 200);
		startButtonPanel.setBackground(Color.green);
		startButton = new JButton("Start the adventure");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(cHandler);
		startButton.setActionCommand("start");
		startButton.setFocusPainted(false);
		startButtonPanel.add(startButton);
		
		window.add(startButtonPanel);
		window.add(titleNamePanel);
		
		// GAME SCREEN
		//These are the codes for the game screen, so each screen of the main game, since they are the same
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(50, 100, 700, 250);
		mainTextPanel.setBackground(Color.black);
		window.add(mainTextPanel);

		mainTextArea = new JTextArea("This is the main text area");
		mainTextArea.setBounds(50,100,700,250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(200, 350, 400, 150);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		window.add(choiceButtonPanel);

		choice1 = new JButton("choice1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.orange);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(cHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("choice1");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.cyan);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(cHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("choice1");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.magenta);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(cHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);

		choice4 = new JButton("choice1");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.red);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(cHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);

		playerPanel = new JPanel();
		playerPanel.setBounds(50, 15, 700, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1, 4));
		window.add(playerPanel);

		hpLabel = new JLabel("HP:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		hpNumberLabel = new JLabel();
		hpNumberLabel.setForeground(Color.white);
		hpNumberLabel.setFont(normalFont);
		playerPanel.add(hpNumberLabel);
		weaponLabel = new JLabel("Weapon:");
		weaponLabel.setForeground(Color.white);
		weaponLabel.setFont(normalFont);
		playerPanel.add(weaponLabel);
		weaponNameLabel = new JLabel();
		weaponNameLabel.setForeground(Color.white);
		weaponNameLabel.setFont(normalFont);
		playerPanel.add(weaponNameLabel);
		
		//This is used for the window to actually appear
		window.setVisible(true);
	}
	
}
