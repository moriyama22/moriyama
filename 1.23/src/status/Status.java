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
    
    public Status(String name, double height, int speed) {
        setName(name); // setNameメソッドを使用して名前をセット
        setHeight(height); // setHeightメソッドを使用して体長をセット
        setSpeed(speed); // setSpeedメソッドを使用して速度をセット
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
        System.out.println("動物名：" + getName()); // getName()メソッドを呼び出して名前を取得
        System.out.println("体長：" + getHeight() + "m"); // getHeight()メソッドを呼び出して体長を取得
        System.out.println("速度：" + getSpeed() + "km/h"); // getSpeed()メソッドを呼び出して速度を取得
    }
    
    public static void main(String[] args) {
        // Statusオブジェクトを作成して、動物の情報を表示する
        Status lion = new Status("ライオン", 2.1, 80);
        lion.printStatus();
    }
}
