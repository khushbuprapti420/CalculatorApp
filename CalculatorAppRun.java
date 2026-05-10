package calculatorAppRun;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorAppRun extends Application {

    double firstNumber = 0;
    double secondNumber = 0;
    String operator = "";

    @Override
    public void start(Stage primaryStage) {

        TextField display = new TextField();
        display.setEditable(false);
        display.setPrefHeight(50);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));

        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnMul = new Button("*");
        Button btnDiv = new Button("/");
        Button btnMod = new Button("%");
        Button btnEqual = new Button("=");
        Button btnClear = new Button("C");
        Button btnDot = new Button(".");

        Button[] buttons = {
            btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnSub, btnMul, btnDiv,
            btnMod, btnEqual, btnClear, btnDot
        };

        for (Button btn : buttons) {
            btn.setPrefSize(60, 50);
        }

        grid.add(btn7, 0, 0);
        grid.add(btn8, 1, 0);
        grid.add(btn9, 2, 0);
        grid.add(btnDiv, 3, 0);

        grid.add(btn4, 0, 1);
        grid.add(btn5, 1, 1);
        grid.add(btn6, 2, 1);
        grid.add(btnMul, 3, 1);

        grid.add(btn1, 0, 2);
        grid.add(btn2, 1, 2);
        grid.add(btn3, 2, 2);
        grid.add(btnSub, 3, 2);

        grid.add(btn0, 0, 3);
        grid.add(btnDot, 1, 3);
        grid.add(btnEqual, 2, 3);
        grid.add(btnAdd, 3, 3);

        grid.add(btnMod, 0, 4);
        grid.add(btnClear, 1, 4);

        btn0.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {
           
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });

        btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });

        btn6.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });

        btn7.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });

        btn8.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });

        btn9.setOnAction(new EventHandler<ActionEvent>() {
           
            public void handle(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });

        btnDot.setOnAction(new EventHandler<ActionEvent>() {
           
            public void handle(ActionEvent e) {
                display.setText(display.getText() + ".");
            }
        });

        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
          
            public void handle(ActionEvent e) {
                firstNumber = Double.parseDouble(display.getText());
                operator = "+";
                display.clear();
            }
        });

        btnSub.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                firstNumber = Double.parseDouble(display.getText());
                operator = "-";
                display.clear();
            }
        });

        btnMul.setOnAction(new EventHandler<ActionEvent>() {
          
            public void handle(ActionEvent e) {
                firstNumber = Double.parseDouble(display.getText());
                operator = "*";
                display.clear();
            }
        });

        btnDiv.setOnAction(new EventHandler<ActionEvent>() {
           
            public void handle(ActionEvent e) {
                firstNumber = Double.parseDouble(display.getText());
                operator = "/";
                display.clear();
            }
        });

        btnMod.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                firstNumber = Double.parseDouble(display.getText());
                operator = "%";
                display.clear();
            }
        });

        btnEqual.setOnAction(new EventHandler<ActionEvent>() {
           
            public void handle(ActionEvent e) {

                secondNumber = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {

                    case "+":
                        result = firstNumber + secondNumber;
                        break;

                    case "-":
                        result = firstNumber - secondNumber;
                        break;

                    case "*":
                        result = firstNumber * secondNumber;
                        break;

                    case "/":
                        result = firstNumber / secondNumber;
                        break;

                    case "%":
                        result = firstNumber % secondNumber;
                        break;
                }

                display.setText(String.valueOf(result));
            }
        });

        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent e) {
                display.clear();
                firstNumber = 0;
                secondNumber = 0;
                operator = "";
            }
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(display, grid);

        Scene scene = new Scene(root, 300, 350);

        primaryStage.setTitle("Calculator App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}