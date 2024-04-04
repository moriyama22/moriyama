/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください：");
        String input = scanner.nextLine();
        scanner.close();
        
     // 入力された文字列をコンマ（,）で分割し、各動物の情報を取得する
        String[] animals = input.split(",");
     // 各動物の情報を処理するためにループを実行する
        for (String animalInfo : animals) {
        	// 各動物の情報をコロン（:）で分割し、個々の情報を取得する
            String[] animalData = animalInfo.split(":");
            // 動物の名前を取得する
            String animalName = animalData[0];
            // 動物の身長を文字列から浮動小数点数に変換する
            double height = Double.parseDouble(animalData[1]);
            // 動物の速度を文字列から整数に変換する
            int speed = Integer.parseInt(animalData[2]);
            // 学名の一時的な変数を初期化する
            String sname = "";
            
            // 動物の名前に基づいて学名を設定する
            switch (animalName) {
                case "ライオン":
                    sname = "パンテラ レオ";
                    break;
                case "ゾウ":
                    sname = "ロキソドンタ・サイクロティス";
                    break;
                case "パンダ":
                    sname = "アイルロポダ・メラノレウカ";
                    break;
                case "チンパンジー":
                    sname = "パン・トゥログロディテス";
                    break;
                case "シマウマ":
                    sname = "チャップマンシマウマ";
                    break;
                case "インコ":
                    sname = "不明";
                    break;
                default:
                    sname = "不明";
            }
            
         // 各動物の情報をコンソールに出力する
            System.out.println("動物名：" + animalName);
            System.out.println("体長：" + height + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + sname);
            System.out.println();
        }
    }
}