package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{

	public Fighter(String name, String weapon) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
		
		this.setHp(Dice.get(240, 300));
		this.setOffensive(Dice.get(17, 23));
	}

}
