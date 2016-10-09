package com.sh.singleton.eage;

/**
 * 饿汉模式实现
* @Title: TaskManager.java 
* @Package: com.sh.singleton.eage 
* @Description: 
* @author: hu.sun
* @date: 2016年9月26日 上午10:42:01 
* @version:
 */
public class TaskManager {
    
    public static TaskManager tm = new TaskManager();
    
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
