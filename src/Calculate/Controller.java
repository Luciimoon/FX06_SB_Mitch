package Calculate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.util.Random;

public class Controller {

    public TextField showResult;

    @FXML
    private Label Lab;
    private double n1 = 0;
    private double n2 = 0;
    private double finalResult = 0;
    private String Operator = "";
    private boolean startNumber = true;
    private Model model = new Model();
    String value = "";

    @FXML
    public void Random(ActionEvent e) {
        Random rand = new Random();
        int random = rand.nextInt(50) + 1;
        Lab.setText(Integer.toString(random));

    }

    @FXML
    public void processNumbers(ActionEvent e) {
        if (startNumber) {
            Lab.setText("");
            startNumber = false;
        }
        String value = ((Button) e.getSource()).getText();
        Lab.setText(Lab.getText() + value);
    }

    @FXML
    public void processOperators(ActionEvent e) {
        if (n1 == 0.0) {
            value = ((Button) e.getSource()).getText();
            n1 = Double.parseDouble(Lab.getText());
            Lab.setText("");
        } else {
            n2 = Double.parseDouble(Lab.getText());
            finalResult = model.calculate(n1, n2, value);
            Lab.setText(Double.toString(finalResult));
        }

    }

    @FXML
    public void Square(ActionEvent e) {
        n1 = Double.parseDouble(Lab.getText());
       Lab.setText(Double.toString(Math.pow(n1, 2)));

    }

    @FXML
    public void SquareRoot(ActionEvent e) {
        n1 = Double.parseDouble(Lab.getText());
        Lab.setText(Double.toString(Math.sqrt(n1)));

    }

    @FXML
    public void Cube(ActionEvent e) {
        n1 = Double.parseDouble(Lab.getText());
        Lab.setText(Double.toString(Math.pow(n1, 3)));

    }

    @FXML
    public void CubeRoot(ActionEvent e) {
        n1 = Double.parseDouble(Lab.getText());
        Lab.setText(Double.toString(Math.cbrt(n1)));

    }

    @FXML
    public void clear(ActionEvent e) {
         n1 = 0;
         n2 = 0;
         finalResult = 0;
         Operator = "";
        Lab.setText("");
    }

}
