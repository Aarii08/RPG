package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	public Slime(String name, String weapon, int hp, int offensive) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
		
		hp = Dice.get(70, 130);
		offensive = Dice.get(5, 11);
	}

}
