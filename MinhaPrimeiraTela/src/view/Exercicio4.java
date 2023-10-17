package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValorgasolina;
	private JTextField textQuantidadegasolina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 239, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Conversor de quantidade de gasolina");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(74, 10, 326, 31);
		contentPane.add(lblTitulo);
		
		textValorgasolina = new JTextField();
		textValorgasolina.setBounds(180, 96, 96, 19);
		contentPane.add(textValorgasolina);
		textValorgasolina.setColumns(10);
		
		textQuantidadegasolina = new JTextField();
		textQuantidadegasolina.setBounds(180, 136, 96, 19);
		contentPane.add(textQuantidadegasolina);
		textQuantidadegasolina.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(180, 193, 85, 21);
		contentPane.add(btnCalcular);
		
		JLabel lblValordigitar = new JLabel("Digite o valor da gasolina");
		lblValordigitar.setBounds(10, 96, 135, 13);
		contentPane.add(lblValordigitar);
		
		JLabel lblNewLabel_2 = new JLabel("Digite a quantidade de gasolina");
		lblNewLabel_2.setBounds(10, 139, 145, 13);
		contentPane.add(lblNewLabel_2);
	}

}
