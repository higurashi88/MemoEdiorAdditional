package com.example.memoeditoradditional;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class folder {
	 public static void main(){
			FileName();
		}
	
	 public static void FileName(){
		 String title = null;
		 if(title == null){
		    System.out.println("タイトルを入力してください。");
		    	Scanner scan = new Scanner(System.in);
		    	title =  scan.next();
		    	CreateFile(title);
		 }
	 }

	
	
	 public static void CreateFile(String test){
		 String temp;
		 temp = test;
		 File newfile = new File(temp+".txt");

		 try{
			 if (newfile.createNewFile()){
		        System.out.println("ファイルの作成に成功しました");		        
			 }else{
		        System.out.println("ファイルの作成に失敗しました");
		     }    
		 }catch(IOException e){
			 System.out.println(e);			 
			 }
		 }
	
}
