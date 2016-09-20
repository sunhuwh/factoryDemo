package com.sh.factory.chart;

public class LineChartFactory implements ChartFactoryInterface{
    
    @Override
    public ChartInterface createChart(){
        return new LineChart();
    }
    
}
