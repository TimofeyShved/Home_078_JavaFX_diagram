package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class PieChartSample {

   public static void start() {
        Stage stage = new Stage(); // новое окно
        Scene scene = new Scene(new Group()); // новая сцена
        stage.setTitle("Imported Fruits"); // название
        stage.setWidth(500); // размеры
        stage.setHeight(500);

        ObservableList<PieChart.Data> pieChartData = // сздание данных графика
                FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30));
        final PieChart chart = new PieChart(pieChartData); // создание кругового графика
        chart.setTitle("Imported Fruits"); // название

        ((Group) scene.getRoot()).getChildren().add(chart); //объединение в группу данных, на сцене
        stage.setScene(scene); // всё это на форму
        stage.show(); // отобразить форму
    }
}
