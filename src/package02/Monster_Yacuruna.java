package package02;

//Extends command indicates that Monster_Yacuruna is a child class of SuperMonster
public class Monster_Yacuruna extends SuperMonster
{
	public Monster_Yacuruna()
	{
		//As we can see, all the parameters from SuperMonster are met here.
		mname = "Yacuruna";
		hp = 35;
		power = 15;
		attackPhrase = "'I am the yacuruna. I don't know you but " + super.attackPhrase;
	
	}
}
