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
		    System.out.println("�^�C�g������͂��Ă��������B");
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
		        System.out.println("�t�@�C���̍쐬�ɐ������܂���");		        
			 }else{
		        System.out.println("�t�@�C���̍쐬�Ɏ��s���܂���");
		     }    
		 }catch(IOException e){
			 System.out.println(e);			 
			 }
		 }
	
}
