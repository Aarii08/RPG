package demo;

import bases.Human;
import humans.Brave;
import humans.Fighter;s

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("★★ ==== 戦いの開始だ！！ ==== ★★");
		
		Human brave = new Brave("沖田総司", "剣");
		Human fighter = new Fighter("金太郎", "斧");
		Human wizard = new Wizard("安倍晴明", "魔法");
		
		Monster slime = new Slime("キングスライム", "体当たり");
		Monster oak = new Oak("オークキング", "槍");
		Monster dragon = new Dragon("紅龍", "炎");

	}

}
