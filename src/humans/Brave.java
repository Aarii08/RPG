package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {s

	public Brave(String name, String weapon, int hp, int offensive) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
		
		hp = Dice.get(170, 230);
		offensive = Dice.get(7, 13);
	}

}
