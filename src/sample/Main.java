package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); // загрузка формы
        primaryStage.setTitle("Hello World"); // название

        //Pane root = new Pane();
        // добавляем кнопку и событие на нажатие, для открытия статического метода из класса
        //Button button = new Button("New window");
        //button.setOnAction(event -> PieChartSample.start());

        // добавить на панель
        //root.getChildren().addAll(button);

        primaryStage.setScene(new Scene(root, 300, 275)); // сцена и размеры
        primaryStage.show(); // отобразить
    }


    public static void main(String[] args) {
        launch(args);
    }
}
