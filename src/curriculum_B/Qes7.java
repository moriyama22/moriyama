package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// 入力を読み取り
		Scanner scanner = new Scanner(System.in);

		// 生徒の人数を入力してください（２以上）と表示
		System.out.print("生徒の人数を入力してください（２以上）：");

		// 入力を代入
		int a = scanner.nextInt();

		// a行に４列に配列
		int table[][] = new int [a][4];

		// a列の配列
		double sum[] = new double[a];

		// 英語変数初期化
		double english = 0;

		// 数学変数初期化
		double math = 0;

		// 理科変数初期化
		double science = 0;

		// 社会変数初期化
		double society = 0;

		// 平均点変数初期化
		double average;

		// 入力された値が2以上の場合の処理
		if (a >= 2) {

			// 人数分の処理
			for (int i = 0; i < a; i++) {

				// 英語の点数入力してもらう表示
				System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");

				// 入力された値を代入
				table[i][0] = scanner.nextInt();

				// 数学の点数入力してもらう表示
				System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");

				// 入力された値を代入
				table[i][1] = scanner.nextInt();

				// 理科の点数入力してもらう表示
				System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");

				// 入力された値を代入
				table[i][2] = scanner.nextInt();

				// 社会の点数入力してもらう表示
				System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");

				// 入力された値を代入
				table[i][3] = scanner.nextInt();

				// 教科分繰り返し
				for(int j = 0; j < 4; j++) {

					// ４教科の合計を代入
					sum[i] += table[i][j];
				}

				// 全員の英語の合計点を代入
				english += table[i][0];

				// 全員の数学の合計点を代入
				math += table[i][1];

				// 全員の理科の合計点を代入
				science += table[i][2];

				// 全員の社会の合計点を代入
				society += table[i][3];
			}

			// 人数分の処理
			for(int k = 0; k < a; k++) {

				// 一人分の平均点を代入
				average = sum[k] / 4;

				// 平均点を表示
				System.out.println((k + 1) + "人目の平均点は" + String.format("%.2f", average) + "点です。");
			}

			// 全員の英語の平均点を表示
			System.out.println("英語の平均点は" + String.format("%.2f", english / a) + "点です。");

			// 全員の数学の平均点を表示
			System.out.println("数学の平均点は" + String.format("%.2f", math / a) + "点です。");

			// 全員の理科の平均点を表示
			System.out.println("理科の平均点は" + String.format("%.2f", science / a) + "点です。");

			// 全員の社会の平均点を表示
			System.out.println("社会の平均点は" + String.format("%.2f", society / a) + "点です。");

			// 全員の全教科の平均点を表示
			System.out.println("全体の平均点は" + String.format("%.2f", (english + math + science + society) / (a * 4)) + "点です。");

			scanner.close();
		}

	}



}
