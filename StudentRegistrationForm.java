import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

// Declare components
JLabel nameLabel, rollLabel, deptLabel, emailLabel;
JTextField nameField, rollField, deptField, emailField;
JButton registerButton;
JTextArea resultArea;

// Constructor
StudentRegistrationForm() {

// Frame title
setTitle("Student Registration Form");

// Set layout
setLayout(new GridLayout(6, 2, 20, 20));

// Create labels
nameLabel = new JLabel("Student Name:");
rollLabel = new JLabel("Roll Number:");
deptLabel = new JLabel("Department:");
emailLabel = new JLabel("Email:");

// Create text fields
nameField = new JTextField();
rollField = new JTextField();
deptField = new JTextField();
emailField = new JTextField();

// Create button
registerButton = new JButton("Register");

// Create text area
resultArea = new JTextArea();
resultArea.setEditable(false);

// Add components to frame
add(nameLabel);
add(nameField);

add(rollLabel);
add(rollField);

add(deptLabel);
add(deptField);

add(emailLabel);
add(emailField);

add(registerButton);
add(new JLabel());

add(new JLabel("Entered Details:"));
add(new JScrollPane(resultArea));

// Register button event
registerButton.addActionListener(this);

// Frame settings
setSize(800, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}

// Handle button click
public void actionPerformed(ActionEvent e) {

String name = nameField.getText();
String roll = rollField.getText();
String dept = deptField.getText();
String email = emailField.getText();

resultArea.setText(
"Student Name : " + name + "\n" +
"Roll Number  : " + roll + "\n" +
"Department   : " + dept + "\n" +
"Email        : " + email
);
}

// Main method
public static void main(String[] args) {
new StudentRegistrationForm();
}
}
