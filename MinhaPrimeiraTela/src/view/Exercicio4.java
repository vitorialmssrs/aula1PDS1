package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.contaGasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValorgasolina;
	private JTextField textValorFinalGasolina;

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
		setBounds(100, 100, 496, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 239, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Quantidade de gasolina");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(148, 10, 273, 31);
		contentPane.add(lblTitulo);
		
		textValorgasolina = new JTextField();
		textValorgasolina.setBounds(209, 93, 96, 19);
		contentPane.add(textValorgasolina);
		textValorgasolina.setColumns(10);
		
		textValorFinalGasolina = new JTextField();
		textValorFinalGasolina.setBounds(209, 133, 96, 19);
		contentPane.add(textValorFinalGasolina);
		textValorFinalGasolina.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//código para mostrar o resultado, chamar o metodo, criar variavel, tranformar string em float 
				//cria a variavel que receberá o que for digitado no campo e armazena
				String valorGasolina = textValorgasolina.getText();
				String valorFinalGasolina = textValorFinalGasolina.getText();
				
				//conversão de string para float 
				float valorGasolinaPreco = Float.valueOf(valorGasolina);
				float valorGasolinaFinal = Float.valueOf(valorFinalGasolina);
				
				//chamar o metodo
				contaGasolina contaFeita = new contaGasolina ();
				
				//
				float resultadoGasolina = contaFeita.calculoTotal(valorGasolinaPreco, valorGasolinaFinal);
				 
				//comando para mostrar o resultado
				JOptionPane.showMessageDialog(null, "A quantidade de litros possiveis para serem abstecidos são:  "+resultadoGasolina);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(209, 192, 85, 21);
		contentPane.add(btnCalcular);
		
		JLabel lblValordigitar = new JLabel("Digite o valor da gasolina");
		lblValordigitar.setBounds(10, 96, 160, 13);
		contentPane.add(lblValordigitar);
		
		JLabel lblNewLabel_2 = new JLabel("Digite o valor final da gasolina");
		lblNewLabel_2.setBounds(10, 139, 180, 13);
		contentPane.add(lblNewLabel_2);
	}

}
