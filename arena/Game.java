package arena;

public class Game {
	public static void main(String[] args) {

		Warrior warrior = new Warrior("Leonid",100,20);
		Mage mage = new Mage("Vasiliy", 100, 40);

		//Воин атакует Мага
		mage.damage(15);
		boolean castSpellResult = mage.castSpell(20);
		if (castSpellResult == true) {
			warrior.damage(40);
		} else{
			System.out.println("Cast is falls!");
		}

		System.out.println("Warrior " + warrior.getName() + " hath "+ warrior.getHealth() +" health");
		System.out.println("Mage " + mage.getName() + " hath "+ mage.getHealth() + " health & " + mage.getMana() + " mana");
	
	}
}

	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health");
	// 	player.damage(50);

	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health");
	// 	player.damage(60);

	// 	if (player.getIsAlive() == false) {
	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health. He is dead!");
	// } else{
	// 	System.out.println("Character " + player.getName() + " hath "+ player.getHealth() +"health. He is live!");}