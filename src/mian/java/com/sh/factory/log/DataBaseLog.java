package com.sh.factory.log;

public class DataBaseLog implements Log{

    @Override
    public void writeLog(String log) {
        System.out.println("database log:"+log);
    }

}
