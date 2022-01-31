package com.alpha.session44;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a1=new Account();
try
{
	a1.withdraw(20);
}
catch(Balance e)
{
	System.out.println(e.getMessege());
}
	}

}
