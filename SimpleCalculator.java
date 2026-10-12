import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame implements ActionListener {
JTextField num1Field, num2Field, resultField;
JButton addButton, subButton, mulButton, divButton, clearButton;
SimpleCalculator() {
setTitle("Simple Calculator");
setLayout(new GridLayout(6, 2, 10, 10));
JLabel num1Label = new JLabel("First Number:");
JLabel num2Label = new JLabel("Second Number:");
JLabel resultLabel = new JLabel("Result:");
num1Field = new JTextField();
num2Field = new JTextField();
resultField = new JTextField();
resultField.setEditable(false);
addButton = new JButton("Addition");
subButton = new JButton("Subtraction");
mulButton = new JButton("Multiplication");
divButton = new JButton("Division");
clearButton = new JButton("Clear");
add(num1Label);
add(num1Field);
add(num2Label);
add(num2Field);
add(resultLabel);
add(resultField);
add(addButton);
add(subButton);
add(mulButton);
add(divButton);
add(clearButton);
add(new JLabel());
addButton.addActionListener(this);
subButton.addActionListener(this);
mulButton.addActionListener(this);
divButton.addActionListener(this);
clearButton.addActionListener(this);
setSize(800, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == clearButton) {
num1Field.setText("");
num2Field.setText("");
resultField.setText("");
return;
}
try {
double num1 = Double.parseDouble(num1Field.getText());
double num2 = Double.parseDouble(num2Field.getText());
double result = 0;
if (e.getSource() == addButton) {
result = num1 + num2;
}
else if (e.getSource() == subButton) {
result = num1 - num2;
}
else if (e.getSource() == mulButton) {
result = num1 * num2;
}
else if (e.getSource() == divButton) {
if (num2 == 0) {
JOptionPane.showMessageDialog(
this,
"Cannot divide by zero!"
);
return;
}
result = num1 / num2;
}
resultField.setText(String.valueOf(result));
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(
this,
"Please enter valid numbers!"
);
}
}
public static void main(String[] args) {
new SimpleCalculator();
}
}
