package com.sh.factory.chart;

public class PieChartFactoryInterface implements ChartFactoryInterface {

    @Override
    public ChartInterface createChart() {
        return new PieChart();
    }

}
