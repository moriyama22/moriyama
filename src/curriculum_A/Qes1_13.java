package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		/*
		 *	問１
		 *	ローカル変数を宣言
		 */
		// バイト型の変数宣言
		byte byte1;

		// 短整数型の変数宣言
		int int1;

		// 整数型の変数宣言
		short short1;

		// 長整数型の変数宣言
		long long1;

		// 単精度浮動小数点数型の変数宣言
		float float1;

		// 倍精度浮動小数点数型の変数宣言
		double double1;

		// 文字型の変数宣言
		char char1;

		// 文字列型の変数宣言
		String string1;

		// ブーリアン型の変数宣言
		boolean boolean1;

		/*
		 * 問２
		 * それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化
		 */
		// 変数初期値代入
		byte1 = 0;
		int1 = 0;
		short1 = 0;
		long1 = 0L;
		float1 = 0.0f;
		double1 = 0.0d;
		char1 = '\u0000';
		string1 = null;
		boolean1 = false;

		/*
		 * 問３
		 * 問2の初期化に変数代入
		 */
		// 変数代入
		byte1 = 10;
		int1 = 100;
		short1 = 1000;
		long1 = 10000L;
		float1 = 9.5f;
		double1 = 10.5d;
		char1 = 'a';
		string1 = "ハロー";
		boolean1 = true;

		/*
		 * 問４
		 * 問3の出力
		 */
		// 「11110」と出力
		System.out.print(byte1 + int1 + short1 + long1 +
				
				// 「20」と出力
				"\r\n" + Math.round(float1 + double1) +
				
				// 「a ハロー true」と出力
				"\r\n" + char1 + " " + string1 + " " + boolean1 +
				
				// 「11130」と出力
				"\r\n" + byte1 + int1 + short1 + long1 + Math.round(float1 + double1) +
				
				// 「0.105」と出力
				"\r\n" + (byte1 * int1 * short1 * long1) +
				
				// 「10000000000」と出力
				"\r\n" + (double1 / int1) +
				
				// 「-90」と出力
				"\r\n" + (byte1 - int1));

		// 空白改行
		System.out.print( "\r\n" );

		/*
		 * 問５
		 * 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 * String num="20";
		 * int num1=23;
		 * System.out.println("ハローJAVA"+(num+num1));
		 */
		
		int num = 20;
		int num1 = 23;
		
		// 「ハローJAVA43」と出力
		System.out.println("ハローJAVA" + (num + num1));

		// 空白改行
		System.out.print( "\r\n" );

		/*
		 * 問６
		 * 自己紹介文を代入、出力
		 */
		// 名前を代入
		String name = "山田太郎";

		// 年齢を代入
		int age = 18;

		// 身長を代入
		double height = 170.5;

		// 体重を代入
		double weight = 62.2;

		// 好きな食べ物を代入
		String like = "寿司";

		// 「初めまして山田太郎です」と出力
		System.out.println("初めまして" + name + "です "
				
				// 「年齢は18歳です」と出力
				+ "\r\n年齢は" + age + "歳です "
				
				// 「身長は170.5cmです」と出力
				+ "\r\n身長は"  + height + "cmです "
				
				// 「体重は62.2kgです」と出力
				+ "\r\n体重は" + weight + "kgです "
				
				// 「好きな食べ物は寿司です」と出力
				+ "\r\n好きな食べ物は" + like + "です");

		/*
		 * 問７
		 * 問6のBMIを出力
		 */
		// 身長をｍにするための変数を用意
		short bmi = 100;

		// 身長をｍにした時の変数
		double heightBmi = height / bmi;

		// 「ＢＭＩは21.3です」と出力
		System.out.println("BMIは" + Math.floor((weight / (heightBmi * heightBmi)) * 10) / 10 + "です");

		// 空白改行
		System.out.print( "\r\n" );

		/*
		 * 問８
		 * 問6に再代入
		 */
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		like = "オムライス";

		// 「初めまして鈴木一郎です」と出力
		System.out.println("初めまして" + name + "です "
				
				// 「年齢は24歳です」と出力
				+ "\r\n年齢は" + age + "歳です "
				
				// 「身長は168.5cmです」と出力
				+ "\r\n身長は" + height + "cmです "
				
				// 「体重は62.2kgです」と出力
				+ "\r\n体重は" + weight + "kgです "
				
				// 「好きな食べ物はオムライスです」と出力
				+ "\r\n好きな食べ物は" + like + "です");

		// 鈴木一郎のBMI
		double heightBmi2 = height / bmi;
		System.out.println("BMIは" + Math.floor((weight / (heightBmi2 * heightBmi2)) * 10) / 10 + "です");

		// 空白改行
		System.out.print( "\r\n" );
		
		/*
		 * 問９
		 * 問8に自己代入
		 */
		age += 24;
		height += 168.5;
		weight += 64.2;

		// 「初めまして鈴木一郎です」と出力
System.out.println("初めまして" + name + "です "
				
				// 「年齢は48歳です」と出力
				+ "\r\n年齢は" + age + "歳です "
				
				// 「身長は337.0cmです」と出力
				+ "\r\n身長は" + height + "cmです "
				
				// 「体重は128.4kgです」と出力
				+ "\r\n体重は" + weight + "kgです "
				
				// 「好きな食べ物はオムライスです」と出力
				+ "\r\n好きな食べ物は" + like + "です");

		// 問9の鈴木一郎BMI
		double heightBmi3 = height / bmi;
		System.out.println("BMIは" + Math.ceil((weight / (heightBmi3 * heightBmi3)) * 100) / 100 + "です");

		// 空白改行
		System.out.print( "\r\n" );

		/*
		 * 問１０
		 * 問8の年齢が25歳以上ならtrue出力
		 */
		age = 24;
		boolean isOver25 = age >= 25;
		System.out.println(isOver25);

		// 空白改行
		System.out.print( "\r\n" );

		/*
		 * 問１１
		 * 8で使用した【年齢・身長・体重】を文字列型に型変換
		 */
		// 文字列型に変換
		String strAge = String.valueOf(age);
		String strHeight = String.valueOf(height);
		String strWeight = String.valueOf(weight);

		// 「年齢は48歳です」と出力
		System.out.println("年齢は" + strAge + "歳です"
				
				// 「身長は337.0cmです」と出力
				+ "\r\n身長は" + strHeight + "cmです"
				
				// 「体重は128.4kgです」と出力
				+ "\r\n体重は" + strWeight + "kgです");

		// 空白改行
		System.out.print( "\r\n" );

		/*
		 * 問１２
		 * 問11で変換した【年齢・身長】を整数型に変換して出力
		 */
		// 【年齢・身長】を整数型に変換
		int intAge = Integer.parseInt(strAge);
		double height2 = Double.parseDouble(strHeight);

		// 「年齢は48歳です」と出力
		System.out.println("年齢は" + intAge + "歳です"
				
				// 「身長は337.0cmです」と出力
				+ "\r\n身長は" + height2 + "cmです");

		// 空白改行
		System.out.print( "\r\n" );

		/*
		 * 問１３
		 * 問12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
		 */
		// 変換
		boolean isOver25OrTall = (age >= 25) || (height >= 160);

		// 出力
		System.out.println(isOver25OrTall);
	}

}
