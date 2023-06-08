package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/*
		 *	問１
		 *	ローカル変数を宣言
		 */
			byte n ;
			int i;
			short s ;
			long l ;
			float f ;
			double d ;
			char c ;
			String str;
			boolean b;
		
		/*
		 * 問２
		 * 問1のローカル変数初期値を代入
		 */
			n = 0;
			i = 0;
			s = 0;
			l = 0L;
			f = 0.0f;
			d = 0.0d;
			c = '\u0000';
			str = "null";
			b = false;
		
		/*
		 * 問３
		 * 問2の初期化に変数代入
		 */
			n = 10;
			i = 100;
			s = 1000;
			l = 10000;
			f = 9.5f;
			d = 10.5;
			c = 'a';
			str = "ハロー";
			b = true;
		
		/*
		 * 問４
		 * 問3の出力
		 */
			System.out.println(n + i + s + l);
			System.out.println(Math.round(f + d));
			System.out.print(c);
			System.out.print(str);
			System.out.println(b);
			System.out.println(n + i + s + l + Math.round(f + d));
			System.out.println(n * i * s * l);
			System.out.println(d / i);
			System.out.println(n - i);
			
		//空白改行
			System.out.println();
		
		/*
		 * 問５
		 * ハローJAVA43と出力修正
		 */
			int num =20;
			int num1=23;
				System.out.println("ハローJAVA"+(num+num1));
			
		//空白改行
			System.out.println();
		
		/*
		 * 問６
		 * 自己紹介文を代入、出力
		 */
			String a1 = "山田太郎";
			int i1 = 18;
			double d1 = 170.5;
			double d2 = 62.2;
			String a2 = "寿司";
		
			//自己紹介文を出力
			System.out.println("初めまして" + a1 + "です");
			System.out.println("年齢は" + i1 + "歳です");
			System.out.println("身長は" + d1 + "cmです");
			System.out.println("体重は" + d2 + "kgです");
			System.out.println("好きな食べ物は" + a2 + "です");
		
		/*
		 * 問７
		 * 問6のBMIを出力
		 */
			double heightBmi = d1 / 100;
				System.out.println("BMIは" + Math.floor(( d2/(heightBmi * heightBmi))*10)/10 + "です");
			
		//空白改行
			System.out.println();
		
		/*
		 * 問８
		 * 問6に再代入
		 */
			a1 = "鈴木一郎";
			i1 = 24;
			d1 = 168.5;
			d2 = 64.2;
			a2 = "オムライス";
		
			//自己紹介文を出力
			System.out.println("初めまして" + a1 + "です");
			System.out.println("年齢は" + i1 + "歳です");
			System.out.println("身長は" + d1 + "cmです");
			System.out.println("体重は" + d2 + "kgです");
			System.out.println("好きな食べ物は" + a2 + "です");
		
			//鈴木一郎のBMI
			double heightBmi2 = d1 / 100;
				System.out.println("BMIは" + Math.floor(( d2/(heightBmi2 * heightBmi2))*10)/10 + "です");
			
		//空白改行
			System.out.println();
		
		/*
		 * 問９
		 * 問8に自己代入
		 */
			i1+=24;
			d1+=168.5;
			d2+=64.2;
		
			//自己紹介文を出力
			System.out.println("初めまして" + a1 + "です");
			System.out.println("年齢は" + i1 + "歳です");
			System.out.println("身長は" + d1 + "cmです");
			System.out.println("体重は" + d2 + "kgです");
			System.out.println("好きな食べ物は" + a2 + "です");
		
			//問9の鈴木一郎BMI
			double heightBmi3 = d1 / 100;
				System.out.println("BMIは" + Math.ceil(( d2/(heightBmi3 * heightBmi3))*100)/100 + "です");
		
		//空白改行
			System.out.println();
			
		/*
		 * 問１０
		 * 問8の年齢が25歳以上ならtrue出力
		 */
			boolean isOver25 = i1 >= 25 ? true : false;
			System.out.println(isOver25);
		
		//空白改行
			System.out.println();
		
		/*
		 * 問１１
		 * 8で使用した【年齢・身長・体重】を文字列型に型変換
		 */
			//文字列型に変換
			String ii1 = String.valueOf(i1);
			String dd1 = String.valueOf(d1);
			String dd2 = String.valueOf(d2);
			
			//変換したのを出力
			System.out.println("年齢は" + ii1 + "歳です");
			System.out.println("身長は" + dd1 + "cmです");
			System.out.println("体重は" + dd2 + "kgです");
			
		//空白改行
			System.out.println();
			
		/*
		 * 問１２
		 * 問11で変換した【年齢・身長】を整数型に変換して出力
		 */
			//【年齢・身長】を整数型に変換
			int ii11 = Integer.parseInt(ii1);
			double dd11 = Double.parseDouble(dd1);
			double dd22 = Double.parseDouble(dd2);
			
			//出力
			System.out.println("年齢は" + ii11 + "歳です");
			System.out.println("身長は" + dd11 + "cmです");
			System.out.println("体重は" + dd22 + "kgです");
			
		//空白改行
			System.out.println();
			
		/*
		 * 問１３
		 * 問12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
		 */
			//変換
			boolean isOver25orTall = (i1 >= 25) || (d1 >= 160);
			
			//出力
			System.out.println(isOver25orTall);
	}	
	

}
