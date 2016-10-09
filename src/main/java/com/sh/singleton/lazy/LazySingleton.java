package com.sh.singleton.lazy;

public class LazySingleton {
	
	private volatile static LazySingleton instance = null;
	
	private LazySingleton(){
		
	}
	
	public static LazySingleton getInstance(){
		if(instance == null){
			//锁定代码块
			synchronized (LazySingleton.class) {
				if(instance == null){
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
	public String getName(){
		return "this is a lazy singleton instance";
	}
	
	
}
