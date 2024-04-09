package sub;

import java.util.Scanner;

public class Scann {
	public static boolean sc() {	
			// 新しい Scanner インスタンスを生成
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("「昇順」か「降順」で、ソート入力をお願いします。");
	        String[] inputA = {"昇順","降順"};
	        String inputSort;
	        
	        do {
	            inputSort = scanner.nextLine();
	            //入力が昇順か降順か確認
	           if(inputSort.equalsIgnoreCase(inputA[0]) || inputSort.equalsIgnoreCase(inputA[1])) {
	        	   //一致すると終了
	        	   break;
	           }else {
	                // 一致しない場合、再度入力を促す
	                System.out.println("「昇順」か「降順」で入力してください。");
	           }
	        } while (true); // 正しい入力が行われるまで繰り返す
	       
	        scanner.close();
	        
	        return inputSort.equalsIgnoreCase(inputA[0]);
		
	}
}