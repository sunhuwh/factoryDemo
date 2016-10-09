package com.sh.singleton;

public class TaskManager {
    
    private static TaskManager tm = null;
    
    private TaskManager(){
        
    }
    
    public void showProcesses(){
        System.out.println("显示进程");
    }
    
    public void showServices(){
        System.out.println("显示服务");
    }
    
    public static TaskManager getInstance(){
        if(tm == null){
            return new TaskManager();
        }
        return tm;
    }
    
}
