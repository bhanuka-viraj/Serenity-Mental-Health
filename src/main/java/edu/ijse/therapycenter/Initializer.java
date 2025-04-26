package edu.ijse.therapycenter;

import edu.ijse.therapycenter.config.FactoryConfiguration;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.ijse.therapycenter.entity.*;

import java.io.IOException;
import java.time.LocalDate;

public class Initializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent load = FXMLLoader.load((getClass().getResource("/view/LogIn.fxml")));
        stage.setScene(new Scene(load));
        stage.setTitle("Serenity Therapy Center");
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}