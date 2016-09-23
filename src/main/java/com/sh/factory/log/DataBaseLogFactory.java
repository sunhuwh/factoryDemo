package com.sh.factory.log;

public class DataBaseLogFactory implements LogFactory {

    @Override
    public Log getLogInstance() {
        return new DataBaseLog();
    }

}
