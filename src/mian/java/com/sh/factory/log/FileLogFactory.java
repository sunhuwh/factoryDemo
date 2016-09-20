package com.sh.factory.log;


public class FileLogFactory implements LogFactory {

    @Override
    public Log getLogInstance() {
        return new FileLog();
    }

}
