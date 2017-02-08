package com.wip.training;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 385;
int sum = 0;

while (n!=0){
sum = sum + (n%10);
n=n/10;
//System.out.println(sum);
//System.out.println(n);
}

System.out.println(sum);

	}

}
