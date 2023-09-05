package curriculum_B;


public class Qes4 {

	public static void main(String[] args) {
		
		// iが9以下の時ループ
		for (int i = 1; i <= 9; i++) {
			
			// jが９以下の時ループ
			for (int j = 1; j <= 9; j++) {
				
				// iとjを２桁の文字列にフォーマット
				String formattedI = String.format("%02d",i);
				String formattedJ = String.format("%02d",j);
				String formattedIj = String.format("%02d",(i * j));
				
				// 掛け算の式と答えを表示
				System.out.print(formattedI + "*" + formattedJ + "=" + formattedIj);
				
				// ｊが9未満の場合、区切り｜｜を表示
				if (j < 9) {
					System.out.print(" || ");
				}
			}
			
			// 改行
			System.out.println( );
		}
	}	

}
