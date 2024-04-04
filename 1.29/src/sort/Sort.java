package sort;

import java.util.Arrays;

public class Sort {
	// データの定義
    private final String[] data = {
        "北海道:札幌市:83424",
        "青森県:青森市:9646",
        "岩手県:盛岡市:15275",
        "宮城県:仙台市:7282",
        "秋田県:秋田市:11638",
        "山形県:山形市:9323",
        "福島県:福島市:13784",
        "茨城県:水戸市:6097",
        "栃木県:宇都宮市:6408",
        "群馬県:前橋市:6362",
        "埼玉県:さいたま市:3798"
    };
    
 // ソートして出力するメソッド
    public void sortAndPrint(String input) {
        // 入力をカンマで分割して配列に格納
        String[] indices = input.split(",");
        // 配列を昇順にソート
        Arrays.sort(indices);

        // 各インデックスのデータにアクセス
        for (String index : indices) {
            // 文字列から整数への変換
            int i = Integer.parseInt(index.trim());
            // 範囲内の場合
            if (i >= 0 && i < data.length) {
                // データをコロンで分割して部品に格納
                String[] parts = data[i].split(":");
                // 都道府県名の出力
                System.out.println("都道府県名：" + parts[0]);
                // 県庁所在地の出力
                System.out.println("県庁所在地：" + parts[1]);
                // 面積の出力
                System.out.println("面積：" + parts[2] + "km2\n");
            } else { // 範囲外の場合
                // 範囲外の数字を表示
                System.out.println("入力された数字が範囲外です: " + i);
            }
        }
    }
}
