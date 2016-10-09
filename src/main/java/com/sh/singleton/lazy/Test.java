package com.sh.singleton.lazy;

public class Test {

	public static void main(String[] args) {
		LazySingleton lSingleton = LazySingleton.getInstance();
		System.out.println(lSingleton.getName());
	}

}
