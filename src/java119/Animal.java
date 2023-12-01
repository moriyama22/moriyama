package java119;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog name = new Dog();
		
		//出力
		System.out.println(name.animalName1);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog num =new Dog(3);
		
		//出力
		System.out.println("動物の数は" + num.animalName + "匹です");
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date nowDate = new Date();
		
		//インスタンス生成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		
		//指定した形式の日時を代入
		String formatNowDate = sdf.format(nowDate);
		
		//出力
		System.out.println(formatNowDate);
	
	}
}
