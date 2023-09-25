package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		// 入力読み取り
		Scanner scanner = new Scanner(System.in);

		// 入力されたものを代入
		String input = scanner.nextLine();

		// 入力された後に「、」で区切り代入
		String[] products = input.split("、");

		// ランダム作成
		Random random = new Random();
		int remaining = 0;

		// 0～11のランダム代入
		remaining = random.nextInt(12);


		for (String product : products) {

			// 条件を指定
			switch (product) {

			case "パソコン":

			case "冷蔵庫":

			case "扇風機":

			case "洗濯機":

			case "加湿器":

				// 残りの台数を出力
				System.out.println(product + "の残りの台数は" + random.nextInt(12) + "台です");
				break;

			case "テレビ":


			case "ディスプレイ":

				// テレビが入力された場合１～11ランダム、ディスプレイの場合11-ランダム
				int result = product.equals ("テレビ") ? remaining : 11 - remaining;

				// テレビ、ディスプレイは合わせて11になるように表示
				System.out.println(product + "の残りの台数は" + result + "台です");
				break;

				// 条件以外場合、指定の商品ではありませんと表示
			default:
				System.out.println("『" + product + "』は指定の商品ではありません");

			}
		}

		scanner.close();

	}

}
