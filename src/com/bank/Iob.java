package com.bank;


public class Iob implements Sbi {

	@Override
	public void savings() {
		System.out.println("SBI SAVINGS");
	}

	@Override
	public void deposit() {
		System.out.println("SBI DEPOSIT");
	}
	public static void main(String[] args) {
		Iob i = new Iob();
		i.savings();
		i.deposit();
	}

}
