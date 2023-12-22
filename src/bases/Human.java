package bases;

public abstract class Human extends Living {

	public Human(String name, String weapon) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, weapon);
	}
	
	@Override
	public void attack(Living target) {
		int damage = human.(get(1, 10)) * offensive;
		target = hp - damage;
		human = offensive - 1;
		System.out.println("「" + human.getName() + "」が「" + human.getWeapon() + "」で攻撃！「" + target.getName() + "」に" + damage + "のダメージを与えた。");
	}

}
