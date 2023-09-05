package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		// 入力読み取り
		Scanner scanner = new Scanner(System.in);

		// ユーザー名を入力してください：と表示
		System.out.print("ユーザー名を入力してください: ");

		// name初期値
		String name ="";

		// flag変数にfalse
		boolean flag = false;
		do {

			// 入力をname変数に変換
			name = scanner.nextLine();

			// nameが空白か確認
			if (name == null || name.trim().isEmpty()) {

				// nameが空白の場合、名前を入力してくださいと表示
				System.out.println("名前を入力してください");

				// nameが10文字以内か判断
			} else if (name.length() > 10) {

				// nameが10文字以上の場合、名前を10文字以内にしてくださいと表示
				System.out.println("名前を10文字以内にしてください");

				// 半角英数字の判断
			} else if (!name.matches("[a-zA-Z0-9]+")) {

				// 半角英数字ではない場合、半角英数字のみで名前を入力してくださいと表示
				System.out.println("半角英数字のみで名前を入力してください");

				// nameが条件を満たした場合、ユーザー名「name」を登録しましたと表示
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました");
				flag = true;
			}

		// 名前入力の条件にならない場合繰り返し
		} while ( flag == false );

		// じゃんけんグーチョキパーを用意
		String[] hands = {"グー","チョキ","パー"};

		// 自分の出すじゃんけん
		String nameHand;

		// 相手のだすじゃんけん
		String enemyHand;

		// じゃんけんのカウント
		int roundCount = 0;



		do {
			// Random作成し代入
			Random random = new Random();

			// (hands.length)内のランダム取得
			int intRandom = random.nextInt(hands.length);

			// 自分の手をランダムで代入
			nameHand = hands[intRandom];

			// 相手と自分の手を出す為に再度ランダムを代入
			intRandom = random.nextInt(hands.length);

			// 相手の手をじゃんけんをランダムで代入
			enemyHand = hands[intRandom];

			// 自分の手を出力
			System.out.println(name + "の手は「" + nameHand + "」");

			// 相手の手を出力
			System.out.println("相手の手は「" + enemyHand + "」");

			// 自分が勝った場合条件と出力
			if (nameHand == "グー" &&  enemyHand == "チョキ" || nameHand == "チョキ" &&  enemyHand == "パー" || nameHand == "グー" &&  enemyHand == "チョキ") {
				System.out.println("""
						やるやん。
						次は俺にリベンジさせて
						""");

				// グーに負けた場合の条件と出力
			} else if ( nameHand == "チョキ" && enemyHand == "グー" ) {
				System.out.println("""
						俺の勝ち！
						負けは次につながるチャンスです！
						ネバーギブアップ！
						""");

				// チョキに負けた場合の条件と出力
			} else if (nameHand == "パー" && enemyHand == "チョキ" ) {
				System.out.println("""
						俺の勝ち！
						たかがじゃんけん、そう思ってないですか？
						それやったら次も、俺が勝ちますよ
						""");

				// パーに負けた場合の条件と出力
			} else if (nameHand == "グー" && enemyHand == "パー" ) {
				System.out.println("""
						俺の勝ち！
						なんで負けたか、明日までに考えといてください。
						そしたら何かが見えてくるはずです
						""");

				// あいこの条件と出力
			} else if(nameHand == enemyHand){
				System.out.println("""
						DRAW　あいこ　もう一回しましょう！
						""");
			} 
			// じゃんけんを行った回数を+１する
			roundCount++;

			// じゃんけんで負けた場合とあいこの場合、もう一度行う処理
		}while ( nameHand == "チョキ" && enemyHand == "グー" || nameHand == "パー" && enemyHand == "チョキ" || nameHand == "グー" && enemyHand == "パー" || nameHand == enemyHand);

		// じゃんけんに勝った時、「勝つまでにかかった合計回数は〇回です」と表示
		System.out.println("勝つまでにかかった合計回数は" + roundCount + "回です");

		scanner.close();
	}






}



