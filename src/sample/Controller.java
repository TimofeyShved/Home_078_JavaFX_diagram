package sample;

public class Controller {

    public void openPieChartSample(){ // открытие диаграмм, на нажате кнопок:
        PieChartSample.start(); // кругавая
    }

    public void openLineChartSample(){
        LineChartSample.start(); // График
    }

    public void openAreaChartSample(){
        AreaChartSample.start(); // Многослойный
    }
}
