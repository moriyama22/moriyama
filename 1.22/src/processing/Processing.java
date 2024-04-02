package processing;
import java.time.LocalDateTime; // 日付と時刻を扱うためのクラスをインポート
import java.time.format.DateTimeFormatter;//日付と時刻のフォーマットを扱うためのクラスをインポート

public class Processing {
    public void printMessages() {
        // メッセージを出力
        System.out.println("こんにちは！ここは日本です！");
        System.out.println("この寿司はうまい");
        System.out.println("寿司は和食です");
        System.out.println("今の現在日時は" + this.getCurrentDateTime() + "です");
    }

    private String getCurrentDateTime() {
        // 現在の日時を取得
        LocalDateTime currentDateTime = LocalDateTime.now(); 
        
        //日時を指定された形式でフォーマットする
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        
        return formattedDateTime; // フォーマットされた日時を返す
    }
}
