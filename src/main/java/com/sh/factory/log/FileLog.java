package com.sh.factory.log;

public class FileLog implements Log {

    @Override
    public void writeLog(String log) {
        System.out.println("file log:"+log);
    }

}
