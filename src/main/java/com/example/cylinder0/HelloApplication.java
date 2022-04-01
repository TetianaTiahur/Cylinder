package com.example.cylinder0;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

import java.util.Scanner;

public class HelloApplication extends Application {
    public void start(Stage stage)
    {
        stage.setTitle(" Cylinder ");

        Cylinder cylinder = new Cylinder(20.0f, 120.0f);

        Group group = new Group(cylinder);

        cylinder.setTranslateX(100);
        cylinder.setTranslateY(100);

        Scene scene = new Scene(group, 500, 300);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double pi = Math.PI;
        float r;
        float h;

        System.out.println("Radius :  ");
        r = input.nextFloat();

        System.out.println("Height :  ");
        h = input.nextFloat();

        double v = pi * r * r * h;
        System.out.println("Objetosc cylindra o promieniu" + r + " i wysokosc " + h + " : " + v);

        launch(args);
    }


}