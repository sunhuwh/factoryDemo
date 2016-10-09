package com.sh.singleton.eage;

public class Test {
    
    public static void main(String[] args) {
        TaskManager tm = TaskManager.getInstance();
        tm.showProcesses();
    }
    
}
