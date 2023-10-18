package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ContaRefeicaoex5;
import model.contaGasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPesoPrato;
	private JTextField textValorQuilo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio5 frame = new exercicio5();
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
	public exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloRestaurante = new JLabel("Fomelândia");
		lblTituloRestaurante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTituloRestaurante.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTituloRestaurante.setBounds(95, 10, 182, 35);
		contentPane.add(lblTituloRestaurante);
		
		textPesoPrato = new JTextField();
		textPesoPrato.setBounds(167, 110, 96, 19);
		contentPane.add(textPesoPrato);
		textPesoPrato.setColumns(10);
		
		textValorQuilo = new JTextField();
		textValorQuilo.setBounds(167, 149, 96, 19);
		contentPane.add(textValorQuilo);
		textValorQuilo.setColumns(10);
		
		JLabel lblInformacaoPesoPrato = new JLabel("Peso do prato montado");
		lblInformacaoPesoPrato.setBounds(31, 116, 155, 13);
		contentPane.add(lblInformacaoPesoPrato);
		
		JLabel lblNewLabel_1 = new JLabel("O valor do quilo");
		lblNewLabel_1.setBounds(31, 152, 102, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//comandos para realizar as contas
				//cria a variavel que receberá o que for digitado no campo e armazena
				String pesoPrato = textPesoPrato.getText();
				String valorQuilo = textValorQuilo.getText();
				
				//conversão de string para float 
				float pesoPratoConvertido = Float.valueOf(pesoPrato);
				float valorQuiloConvertido = Float.valueOf(valorQuilo);
				
				//chamar o metodo
				ContaRefeicaoex5 contaFeita = new ContaRefeicaoex5 ();
				
				//
				float resultadoContaRefeicao = contaFeita.ContaRefeicao(pesoPratoConvertido, valorQuiloConvertido);
				
				//comando para mostrar o resultado
				JOptionPane.showMessageDialog(null, "O preço final do prato é:  "+resultadoContaRefeicao);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.setBounds(167, 202, 85, 21);
		contentPane.add(btnCalcular);
		
		JLabel lblInformacaodoValor = new JLabel("O valor é $9,95 o quilo");
		lblInformacaodoValor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInformacaodoValor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInformacaodoValor.setBounds(60, 42, 223, 13);
		contentPane.add(lblInformacaodoValor);
	}

}
