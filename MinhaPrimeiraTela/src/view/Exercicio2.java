package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimeiroNome;
	private JTextField textSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 239, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Leitura de Nome");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		lblTitulo.setBounds(176, 24, 197, 29);
		contentPane.add(lblTitulo);
		
		JLabel lblPrimeiroNome = new JLabel("Digite seu nome");
		lblPrimeiroNome.setFont(new Font("Arial", Font.ITALIC, 14));
		lblPrimeiroNome.setBounds(10, 94, 137, 13);
		contentPane.add(lblPrimeiroNome);
		
		JLabel lblSobrenome = new JLabel("Digite seu sobrenome");
		lblSobrenome.setFont(new Font("Arial", Font.ITALIC, 14));
		lblSobrenome.setBounds(10, 137, 162, 13);
		contentPane.add(lblSobrenome);
		
		textPrimeiroNome = new JTextField();
		textPrimeiroNome.setBounds(161, 92, 192, 19);
		contentPane.add(textPrimeiroNome);
		textPrimeiroNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(161, 135, 192, 19);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JButton btnAvancar = new JButton("Avançar");
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a variável recebe o texto digitado
				String exibirNome = textPrimeiroNome.getText();
				String exibirSobrenome = textSobrenome.getText();
				//ira mostrar a tela com o que foi digitado, e houve uma concatenação para mostrar a informação
				//usa as variaveis que jogou a informação para colocar e puxar as informações para mostrar
				JOptionPane.showMessageDialog(null, "O nome e sobrenome digitado é: "+exibirNome+ " " +exibirSobrenome);	
				
			}
		});
		btnAvancar.setFont(new Font("Arial", Font.BOLD, 12));
		btnAvancar.setBounds(211, 222, 85, 21);
		contentPane.add(btnAvancar);
	}
}
