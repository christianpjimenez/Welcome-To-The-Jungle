package package02;

public class Monster_Chullachaqui extends SuperMonster
{
	public Monster_Chullachaqui()
	{
		mname = "Chullachaqui";
		hp = 90;
		power = 20;
		attackPhrase = "'" + super.attackPhrase;
	}
}