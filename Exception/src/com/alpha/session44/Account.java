package com.alpha.session44;

public class Account {
double balance=5000;
int pwd=123;
public double withdraw(double amt){
	if(amt>balance)
	{
		throw new Balance();
	}
	else
	{
		balance=balance-amt;
	}
	return balance;
}
public boolean verifypwd(int pwd){
	if(pwd==this.pwd)
	{
		return true;
	}
	else
	{
		throw new Wrongpwd(); 
	}
}
}
