package sub;

import java.util.Scanner;

public class Number {
	public static String[] sc() {
		// スキャナーオブジェクトの生成
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("半角 0 ～ 10　の数字「,」区切りで、入力をお願いします。");
	    String inputNumber;
	    boolean valid = false;
		do {
	    	// 入力を受け取る
	    	inputNumber = scanner.nextLine();
	    	
	    	if(inputNumber.matches("[0-9,]+")) {
	    		//入力された数字を「,」で分割して配列に格納
	    		String[] numbersArray = inputNumber.split(",");
	    		
	    		//各数字を処理して範囲内かどうかチェック
	    		valid = true;
	    		for(String number : numbersArray) {
	    			int num = Integer.parseInt(number.trim());//文字列を数値に変換
	    			if(num < 0 || num > 10) {
	    				valid = false;
	    				break;
	    			}
	    		}
	    	}
	    	
	    	if(!valid) {
	    		System.out.println("入力された数字が 0 ～ 10 の範囲ではありません。再度半角入力をお願いします。");
	    	}
	    } while(!valid);
		
		//scanner.close();
		
		return inputNumber.split(",");
	}
	

}
