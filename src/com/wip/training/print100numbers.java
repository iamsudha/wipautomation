package com.wip.training;

public class print100numbers {
public static void main(String[] args) {
	//	 TODO Auto-generated method stub
	
	String str="";
	for(int i=1;i<=100;i++){
		if(i == 100) {
			str= str+Integer.toString(i);
		}
		else{
			str= str+Integer.toString(i) + ',';
		}	
			
	}
	
	System.out.print(str);
}
	}


