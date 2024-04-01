/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
*/

package status;

public class Status {
	private String name;//名前
	private double height;//体長
	private int speed;//速度
	
	//コンストラクタ（オブジェクトの初期化）
	public Status() {
    }
	public Status(String name,double height,int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// コンソールに出力するメソッド
    public void printStatus() {
        System.out.println("動物名：" + this.name);
        System.out.println("体長：" + this.height + "m");
        System.out.println("速度：" + this.speed + "km/h");
    }
    
    public static void main(String[] args) {
        // Statusオブジェクトを作成して、動物の情報を表示する
        Status lion = new Status("ライオン", 2.1, 80);
        lion.printStatus();
    }
}
