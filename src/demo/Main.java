package demo;

import java.util.ArrayList;
import java.util.List;

import bases.Human;
import bases.Monster;
import humans.Brave;
import humans.Fighter;
import humans.Wizard;
import monsters.Dragon;
import monsters.Oak;
import monsters.Slime;
import utils.Dice;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("★★ ==== 戦いの開始だ！！ ==== ★★");
		
		Human brave = new Brave("沖田総司", "剣");
		Human fighter = new Fighter("金太郎", "斧");
		Human wizard = new Wizard("安倍晴明", "魔法");
		
		List<Human> humans = new ArrayList<>();
		
		humans.add(brave);
		humans.add(fighter);
		humans.add(wizard);
		
		Monster slime = new Slime("キングスライム", "体当たり");
		Monster oak = new Oak("オークキング", "槍");
		Monster dragon = new Dragon("紅龍", "炎");
		
		List<Monster> monsters = new ArrayList<>();
		
		monsters.add(slime);
		monsters.add(oak);
		monsters.add(dragon);
		
		showGroupInfos(humans, monsters);
		
		int count = 1;
		
		while(true) {
			System.out.printf("\n★ 第%d回戦 ==========\n", count);
			System.out.println("\n[人間のターン！]\n");
			
			Human selectedHuman = choiceHuman(humans);
			Monster selectedMonster = choiceMonster(monsters);
			
			selectedHuman.attack(selectedMonster);
			
			if(selectedMonster.getHp() <= 0) {
				monsters.remove(selectedMonster);
				System.out.printf("「%s」を討伐！\n", selectedMonster.getName());
			}
			
			if(monsters.isEmpty()) {
				System.out.println("\n★★ 人間グループの勝利！ ★★");
				break;
			}
			
			System.out.println("\n[モンスターのターン！]\n");
			
			selectedHuman = choiceHuman(humans);
			selectedMonster = choiceMonster(monsters);
			
			selectedMonster.attack(selectedHuman);
			
			if(selectedHuman.getHp() <= 0) {
				humans.remove(selectedHuman);
				System.out.printf("「%s」が倒れた...\n", selectedHuman.getName());
			}
			
			if(humans.isEmpty()) {
				System.out.println("\n★★ モンスターグループの勝利！ ★★");
				break;
			}
			
			showGroupInfos(humans, monsters);
			
			count++;
		}
			
			showGroupInfos(humans, monsters);
			
	}
		
	// 引数でもらった人間グループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Human choiceHuman(List<Human> humans) {
		Human human = humans.get(Dice.get(0, humans.size() - 1));
		System.out.printf("人間グループから 「%s」 のお出ましだ！\n", human.getName());
		return human;
	}

	// 引数でもらったモンスターグループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Monster choiceMonster(List<Monster> monsters) {
		Monster monster = monsters.get(Dice.get(0, monsters.size() - 1));
		System.out.printf("モンスターグループから 「%s」 のお出ましだ！\n", monster.getName());
		return monster;
	}

	// 引数でもらった人間グループリストとモンスターグループリストのそれぞれの情報一覧を表示するメソッド
	public static void showGroupInfos(List<Human> humans, List<Monster> monsters) {

		System.out.println("\n## === グループ情報 === ##");
		System.out.printf("# [人間グループ]: %d人\n", humans.size());
			
		for (Human human : humans) {
			System.out.println(human);
		}

		System.out.printf("\n# [モンスターグループ]: %d人\n", monsters.size());
			
		for (Monster monster : monsters) {
			System.out.println(monster);
		}
	}
}
