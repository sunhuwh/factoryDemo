package com.sh.factory.chart;

import com.sh.util.XMLUtil;

public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String cofigUrl = "src/mian/java/com/sh/factory/chart/config.xml";
        String type = XMLUtil.getType(cofigUrl);
        ChartInterface chart;
        ChartFactoryInterface factory = (ChartFactoryInterface) Class.forName(type).newInstance();
        chart = factory.createChart();
        chart.display();
    }

}
