package com.alpha.session46;

public class P1 {
	public void demo(int...a)
	{ 
		int res=a[0]+a[1]+a[2];
		System.out.println(res);
	}
public static void main(String[] args) {
	P1 p=new P1();
	p.demo(1,2,3);
}
}
