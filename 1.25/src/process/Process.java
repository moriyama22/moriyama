package process;

import java.util.Random;

public class Process {
	private String name;//名前
	private int hp;//HP
	private int mp;//MP
	private int atk;//攻撃力
	private int sp;//素早さ
	private int df;//防御力
	
	//コンストラクタ（オブジェクトの初期化）
	public Process(String name) {
        this.name = name;
    }
	
	Process(String name,int hp,int mp,int atk,int sp,int df){
		setName(name);
		setHp(hp);
		setMp(mp);
		setAtk(atk);
		setSp(sp);
		setDf(df);
	}
	
	public String getName() {
        return name;
    }
	public void setName(String name) {
        this.name = name;
    }
	
	public int getHp() {
        return hp;
    }
	public void setHp(int hp) {
        this.hp = hp;
    }
    
	public int getMp() {
        return mp;
    }
	public void setMp(int mp) {
        this.mp = mp;
    }
    
	public int getAtk() {
        return atk;
    }
	public void setAtk(int atk) {
        this.atk = atk;
    }
    
	public int getSp() {
        return sp;
    }
	public void setSp(int sp) {
        this.sp = sp;
    }
    
	public int getDf() {
        return df;
    }
	public void setDf(int df) {
        this.df = df;
    }
	
	public void setRandomValues() {
    	Random rand = new Random();
    	setHp(rand.nextInt(1000)); // 0から999までのランダムな整数をHPにセット
        setMp(rand.nextInt(1000)); // 0から999までのランダムな整数をMPにセット
        setAtk(rand.nextInt(1000)); // 0から999までのランダムな整数を攻撃力にセット
        setSp(rand.nextInt(1000)); // 0から999までのランダムな整数を素早さにセット
        setDf(rand.nextInt(1000)); // 0から999までのランダムな整数を防御力にセット
    }
	   
    public void printMessages() {
        // メッセージを出力
        System.out.println("こんにちは 「" + getName() + "」　さん");
        System.out.println("ステータス");
        System.out.println("HP　：" + getHp());
        System.out.println("MP　：" + getMp());
        System.out.println("攻撃力　：" + getAtk());
        System.out.println("素早さ　：" + getSp());
        System.out.println("防御力　：" + getDf());
        System.out.println("　");
        System.out.println("さあ冒険に出かけよう！");
    }
    
}
