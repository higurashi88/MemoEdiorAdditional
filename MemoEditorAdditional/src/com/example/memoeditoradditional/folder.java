package com.example.memoeditoradditional;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class folder {
	
	
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
