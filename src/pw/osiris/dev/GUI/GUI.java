package pw.osiris.dev.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void iniciarFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUILogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 201, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 11, 46, 14);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 67, 46, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 92, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(96, 36, 89, 76);
		contentPane.add(btnLogar);
	}
}