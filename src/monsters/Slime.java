package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	public Slime(String name, String weapon) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
		
		this.setHp(Dice.get(70, 130));
		this.setOffensive(Dice.get(5, 11));
	}

}
