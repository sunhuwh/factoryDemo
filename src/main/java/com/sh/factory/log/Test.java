package com.sh.factory.log;

public class Test {
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String factoryName = "com.sh.factory.log.DataBaseLogFactory";
        String logStr = "this is a log";
        LogFactory logFactory = (LogFactory) Class.forName(factoryName).newInstance();
        Log log = logFactory.getLogInstance();
        log.writeLog(logStr);
    }
}
