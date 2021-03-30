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

    public void openBarChartSample(){
        BarChartSample.start(); // Гистограмма
    }

    public void openBubbleChartSample(){
        BubbleChartSample.start(); // метки 1
    }

    public void openScatterChartSample(){
        ScatterChartSample.start(); // метки 2
    }
}
