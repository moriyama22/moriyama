package main;

class Person{
	public String name;
	public int age;
	public double height;
    public double weight;
    public static int count = 0;// 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）


Person(String name, int age, double height, double weight){
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	count++;// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
}

//名前を取得するメソッド
public String getName() {
    return this.name;
}

// 年齢を取得するメソッド
public int getAge() {
    return this.age;
}

public double bmi(){
	return this.weight / this.height / this.height;
}

public void print(){
	System.out.println("名前は" + this.name + "です");
	System.out.println("年は" + this.age + "です");
}

public static void printCount() { // 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	System.out.println("合計" + count + "人です");// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
}
}