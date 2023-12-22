package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon, int hp, int offensive) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
		
		hp = Dice.get(170, 230);
		offensive = Dice.get(9, 15);
	}

}
