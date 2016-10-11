package com.sh.singleton.iodh;

public class Test {

	public static void main(String[] args) {
		IodhSingleton instance = IodhSingleton.getInstance();
		IodhSingleton instance2 = IodhSingleton.getInstance();
		System.out.println(instance==instance2);
		//true
	}

}
