package arena;

public class Mage extends Character{
	
	private int mana; // Новое, уникальное поле

	// Конструктор Mage
	public Mage(String name, int health, int mana) {
		// 1. Вызов конструктора родителя (Character)
		super(name, health); // Передаем name и health в Character
		// 2. Инициализация своего собственного поля
		this.mana = mana;
	}

	public int getMana(){
		return this.mana;
	}

	public boolean castSpell(int manaCost) {

		if (this.mana >= manaCost) {
			this.mana = this.mana - manaCost;
			return true;
		} else {
			return false;
		}


		// Логика работы с полями объекта (например, this.health)
	}
}