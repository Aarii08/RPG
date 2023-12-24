package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {

	public Dragon(String name, String weapon) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
		
		this.setHp(Dice.get(270, 330));
		this.setHp(Dice.get(12, 18));
	}

}
