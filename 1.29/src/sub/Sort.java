package sub;

public class Sort {
	
	public static void sortData(String[] indices,boolean ascending) {
        // Dateクラスのインスタンス化
        Date dateObject = new Date();
        // Dateクラスからdateフィールドを取得
        String[] date = dateObject.getDate();
        
        if(ascending) {
        	//昇順ソート
        	for(int i = 0; i < indices.length -1; i++) {
        		for (int j = i + 1; j < indices.length; j++) {
                    int index1 = Integer.parseInt(indices[i].trim());
                    int index2 = Integer.parseInt(indices[j].trim());
                    if (index1 > index2) {
                        // 要素の交換
                        String temp = indices[i];
                        indices[i] = indices[j];
                        indices[j] = temp;
                    }
                }
            }
        } else {
            // 降順ソート
            for (int i = 0; i < indices.length - 1; i++) {
                for (int j = i + 1; j < indices.length; j++) {
                    int index1 = Integer.parseInt(indices[i].trim());
                    int index2 = Integer.parseInt(indices[j].trim());
                    if (index1 < index2) {
                        // 要素の交換
                        String temp = indices[i];
                        indices[i] = indices[j];
                        indices[j] = temp;
                    }
                }
            }
        }

        // ソートされた要素に対して都道府県情報を出力
        
        for (String index : indices) {
            int i = Integer.parseInt(index.trim());
            if (i >= 0 && i < date.length) {
                String[] parts = date[i].split(":");
                System.out.println("都道府県名：" + parts[1]);
                System.out.println("県庁所在地：" + parts[2]);
                System.out.println("面積：" + parts[3] + "km2\n");
            } else {
                System.out.println("入力された数字が範囲外です: " + i);
            }
        }
	}
}
