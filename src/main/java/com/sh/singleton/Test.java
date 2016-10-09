package com.sh.singleton;

public class Test {
    
    public static void main(String[] args) {
        TaskManager tm = TaskManager.getInstance();
        tm.showProcesses();
    }
    
}
