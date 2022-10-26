package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game 
{
	//All this classes are being used to execute the game directly, so we have to call them
	//since we are using them later
	ChoiceHandler cHandler = new ChoiceHandler();
	UI ui = new UI();
	VisibilityManager vm = new VisibilityManager(ui);
	Story story = new Story(this, vm, ui);

	String nextPlace1, nextPlace2, nextPlace3, nextPlace4;
	
	public static void main(String[] args) 
	{
		new Game();
	}

	//Calling the classes
	public Game() 
	{
		ui.createUI(cHandler);
		story.defaultSetUp();
		vm.showTitleScreen();
	}	
	
	//Here we link the buttons with the actual choices we make in the game, so they can work and
	//allow you to change screens after choosing one or another.
	public class ChoiceHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String yourChoice = event.getActionCommand();
			
			switch (yourChoice)
			{
			case "start": vm.titleWakeUp(); story.wakeUp(); break;
			case "c1": story.selectPlace(nextPlace1); break;
			case "c2": story.selectPlace(nextPlace2); break;
			case "c3": story.selectPlace(nextPlace3); break;
			case "c4": story.selectPlace(nextPlace4); break;
			}
		}
	}
}