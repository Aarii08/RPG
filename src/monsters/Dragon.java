package monsters;

import utils.Dice;
import bases.Monster;

public class Dragon extends Monster {

	public Dragon(String name, String weapon, int hp, int offensive) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
		
		hp = Dice.get(270, 330);
		offensive = Dice.get(12, 18);
	}

}
