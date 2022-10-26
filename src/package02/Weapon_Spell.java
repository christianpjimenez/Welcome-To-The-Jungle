package package02;

public class Weapon_Spell extends SuperWeapon
{
	public Weapon_Spell()
	{
		name = "Magic spell";
		damage = 100;
	}

	//Class using the method with polymorphism
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "The bufeo tries to attack, but she gets confused and falls. Her hat falls as well, and she transforms into a pink dolphin. She is dying, so you help her get into the river again. Thankful, she apologizes for her behaviour and teaches you a spell to keep you safe from any danger, besides curing you from your wounds.\n(You've obtained a magic spell)\n(You've recovered 30 HP)";
	}
}
