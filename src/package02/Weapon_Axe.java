package package02;

public class Weapon_Axe extends SuperWeapon
{
	public Weapon_Axe()
	{
		name = "Axe";
		damage = 23;
	}

	//Method changing due to the polymorphism
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "You've survived the Yacuruna, which runs away to hide and rest.\n\nHe drops one of the weapons he was carrying.\n\n(You've obtained an Axe)";
	}
}
