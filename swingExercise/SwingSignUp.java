package swingExercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingSignUp {

	JFrame f = new JFrame("Registration Form");
	
	SwingSignUp() {
		
		JLabel name, email, phoneNumber, password;
		final JTextField nameField = new JTextField();
		final JTextField emailField = new JTextField();
		final JTextField phoneNumberField = new JTextField();
		JPasswordField passwordField = new JPasswordField();
		
		name = new JLabel("Enter Name: ");
		name.setBounds(10, 50, 170, 30);
		nameField.setBounds(180, 50, 100, 30);
		
		email = new JLabel("Enter Email: ");
		email.setBounds(10, 100, 170, 30);
		emailField.setBounds(180, 100, 100, 30);
		
		phoneNumber = new JLabel("Enter Phone Number: ");
		phoneNumber.setBounds(10, 150, 170, 30);
		phoneNumberField.setBounds(180, 150, 100, 30);
		
		password = new JLabel("Enter Password: ");
		password.setBounds(10, 200, 170, 30);
		passwordField.setBounds(180, 200, 100, 30);
		
		JButton b = new JButton("Register");
		b.setBounds(100, 300, 100, 30);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b, "Registered");
			}
		});
		
		f.add(name);
		f.add(email);
		f.add(phoneNumber);
		f.add(password);
		f.add(nameField);
		f.add(emailField);
		f.add(phoneNumberField);
		f.add(passwordField);
		f.add(b);
		
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingSignUp();
	}

}
