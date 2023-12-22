package bases;

public abstract class Monster extends Living {

	public Monster(String name, String weapon) {
		// TODO 自動生成されたコンストラクター・スタブs
		super(name, weapon);
	}
	
	@Override
	public void attack(Living target) {
		int damage = target.(get(1, 10)) * offensive;
		target = hp - damage;
		System.out.println("「" + monster.getName() + "」が「" + monster.getWeapon() + "」で攻撃！「" + human.getName() + "」に" + damage + "のダメージを与えた。");
	}

}
