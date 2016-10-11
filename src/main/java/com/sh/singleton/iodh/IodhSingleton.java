package com.sh.singleton.iodh;

public class IodhSingleton {
	
	private IodhSingleton(){
		
	}
	
	private static class Interior{
		private static final IodhSingleton instance = new IodhSingleton();
	}
	
	public static IodhSingleton getInstance(){
		return Interior.instance;
	}

	
}
