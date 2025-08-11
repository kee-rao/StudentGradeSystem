import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGradeCalculator extends JFrame implements ActionListener {

    // Declare components
    JTextField subject1Field, subject2Field, subject3Field, subject4Field, subject5Field;
    JButton calculateButton;
    JLabel resultLabel;

    public StudentGradeCalculator() {
        // Frame settings
        setTitle("Student Grade Calculator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 10, 10));

        // Labels and fields
        add(new JLabel("Subject 1 Marks:"));
        subject1Field = new JTextField();
        add(subject1Field);

        add(new JLabel("Subject 2 Marks:"));
        subject2Field = new JTextField();
        add(subject2Field);

        add(new JLabel("Subject 3 Marks:"));
        subject3Field = new JTextField();
        add(subject3Field);

        add(new JLabel("Subject 4 Marks:"));
        subject4Field = new JTextField();
        add(subject4Field);

        add(new JLabel("Subject 5 Marks:"));
        subject5Field = new JTextField();
        add(subject5Field);

        // Calculate button
        calculateButton = new JButton("Calculate Grade");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Result label
        resultLabel = new JLabel("");
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse marks
            double s1 = Double.parseDouble(subject1Field.getText());
            double s2 = Double.parseDouble(subject2Field.getText());
            double s3 = Double.parseDouble(subject3Field.getText());
            double s4 = Double.parseDouble(subject4Field.getText());
            double s5 = Double.parseDouble(subject5Field.getText());

            // Calculate total and average
            double total = s1 + s2 + s3 + s4 + s5;
            double average = total / 5;

            // Determine grade
            String grade;
            if (average >= 90) grade = "A+";
            else if (average >= 80) grade = "A";
            else if (average >= 70) grade = "B";
            else if (average >= 60) grade = "C";
            else if (average >= 50) grade = "D";
            else grade = "F";

            // Display result
            resultLabel.setText("<html>Total: " + total + "<br>Average: " + average + "<br>Grade: " + grade + "</html>");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric marks for all subjects.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new StudentGradeCalculator();
    }
}
