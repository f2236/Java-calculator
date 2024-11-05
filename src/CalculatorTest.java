import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        // Simulate button clicks for "5 + 3 ="
        calculator.oldValue = 5; // Set old value to 5
        calculator.calculation = 1; // 1 indicates addition
        calculator.DisplayLabel.setText("3"); // Set current display to 3

        calculator.equelbutton.doClick(); // Simulate clicking '=' button

        // Expected result is 8
        assertEquals("8", calculator.DisplayLabel.getText());
    }

    @Test
    public void testSubtraction() {
        // Simulate button clicks for "5 - 2 ="
        calculator.oldValue = 5; // Set old value to 5
        calculator.calculation = 2; // 2 indicates subtraction
        calculator.DisplayLabel.setText("2"); // Set current display to 2

        calculator.equelbutton.doClick(); // Simulate clicking '=' button

        // Expected result is 3
        assertEquals("3", calculator.DisplayLabel.getText());
    }

    @Test
    public void testMultiplication() {
        // Simulate button clicks for "4 x 2 ="
        calculator.oldValue = 4; // Set old value to 4
        calculator.calculation = 3; // 3 indicates multiplication
        calculator.DisplayLabel.setText("2"); // Set current display to 2

        calculator.equelbutton.doClick(); // Simulate clicking '=' button

        // Expected result is 8
        assertEquals("8", calculator.DisplayLabel.getText());
    }

    @Test
    public void testClear() {
        // Simulate clicking the clear button
        calculator.DisplayLabel.setText("5"); // Set current display to 5
        calculator.clearbutton.doClick(); // Simulate clicking clear button

        // Expected result is empty
        assertEquals("", calculator.DisplayLabel.getText());
    }
}
