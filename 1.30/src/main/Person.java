package main;

class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public double bmi;
	public int count;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age,double height,double weight){
		setName(name);
		setAge(age);
		setHeight(height);
		setWeight(weight);
		colculateBmi();
		plusCount();
	}
	
	public String getName() {
        return name;
    }
	public void setName(String name) {
        this.name = name;
    }
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void colculateBmi(){
        double height2 = Math.pow(height, 2);
        bmi = weight/height2;
	}
	
	public void plusCount() {
		count++;
	}
	
	
	public void printMessages() {
		// メッセージを出力
		System.out.println();
		System.out.println("名前は" + getName() + "です");
		System.out.println("年は" + getAge() + "です");
		System.out.println("BMIは" + Math.floor((getBmi()*10)/10) + "です");
		System.out.println();
		System.out.println("合計 " + getCount() + "人です");
	}

	}