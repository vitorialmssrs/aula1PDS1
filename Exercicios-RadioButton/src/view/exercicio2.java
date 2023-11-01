package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Calculadora;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimeiroNumeroInteiro;
	private JTextField textSeundoNumeroInteiro;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio2 frame = new exercicio2();
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
	public exercicio2() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{150, 264, 0};
		gbl_contentPane.rowHeights = new int[]{19, 15, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPrimeiroNumeroInteiro = new JLabel("Primeiro número inteiro: ");
		lblPrimeiroNumeroInteiro.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblPrimeiroNumeroInteiro = new GridBagConstraints();
		gbc_lblPrimeiroNumeroInteiro.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPrimeiroNumeroInteiro.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimeiroNumeroInteiro.gridx = 0;
		gbc_lblPrimeiroNumeroInteiro.gridy = 0;
		contentPane.add(lblPrimeiroNumeroInteiro, gbc_lblPrimeiroNumeroInteiro);
		
		textPrimeiroNumeroInteiro = new JTextField();
		GridBagConstraints gbc_textPrimeiroNumeroInteiro = new GridBagConstraints();
		gbc_textPrimeiroNumeroInteiro.anchor = GridBagConstraints.NORTH;
		gbc_textPrimeiroNumeroInteiro.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrimeiroNumeroInteiro.insets = new Insets(0, 0, 5, 0);
		gbc_textPrimeiroNumeroInteiro.gridx = 1;
		gbc_textPrimeiroNumeroInteiro.gridy = 0;
		contentPane.add(textPrimeiroNumeroInteiro, gbc_textPrimeiroNumeroInteiro);
		textPrimeiroNumeroInteiro.setColumns(10);
		
		JLabel lblSegundoNumeroInteiro = new JLabel("Segundo número inteiro:");
		lblSegundoNumeroInteiro.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblSegundoNumeroInteiro = new GridBagConstraints();
		gbc_lblSegundoNumeroInteiro.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSegundoNumeroInteiro.anchor = GridBagConstraints.NORTH;
		gbc_lblSegundoNumeroInteiro.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoNumeroInteiro.gridx = 0;
		gbc_lblSegundoNumeroInteiro.gridy = 1;
		contentPane.add(lblSegundoNumeroInteiro, gbc_lblSegundoNumeroInteiro);
		
		textSeundoNumeroInteiro = new JTextField();
		GridBagConstraints gbc_textSeundoNumeroInteiro = new GridBagConstraints();
		gbc_textSeundoNumeroInteiro.insets = new Insets(0, 0, 5, 0);
		gbc_textSeundoNumeroInteiro.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSeundoNumeroInteiro.gridx = 1;
		gbc_textSeundoNumeroInteiro.gridy = 1;
		contentPane.add(textSeundoNumeroInteiro, gbc_textSeundoNumeroInteiro);
		textSeundoNumeroInteiro.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_rdbtnAdicao = new GridBagConstraints();
		gbc_rdbtnAdicao.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAdicao.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAdicao.gridx = 0;
		gbc_rdbtnAdicao.gridy = 2;
		contentPane.add(rdbtnAdicao, gbc_rdbtnAdicao);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtracao);
		rdbtnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_rdbtnSubtracao = new GridBagConstraints();
		gbc_rdbtnSubtracao.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSubtracao.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSubtracao.gridx = 0;
		gbc_rdbtnSubtracao.gridy = 3;
		contentPane.add(rdbtnSubtracao, gbc_rdbtnSubtracao);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		rdbtnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_rdbtnMultiplicacao = new GridBagConstraints();
		gbc_rdbtnMultiplicacao.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMultiplicacao.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMultiplicacao.gridx = 0;
		gbc_rdbtnMultiplicacao.gridy = 4;
		contentPane.add(rdbtnMultiplicacao, gbc_rdbtnMultiplicacao);
		
		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisao);
		rdbtnDivisao.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_rdbtnDivisao = new GridBagConstraints();
		gbc_rdbtnDivisao.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDivisao.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDivisao.gridx = 0;
		gbc_rdbtnDivisao.gridy = 5;
		contentPane.add(rdbtnDivisao, gbc_rdbtnDivisao);
		
		JLabel lblResultadoDasContas = new JLabel("");
		GridBagConstraints gbc_lblResultadoDasContas = new GridBagConstraints();
		gbc_lblResultadoDasContas.insets = new Insets(0, 0, 5, 0);
		gbc_lblResultadoDasContas.gridx = 1;
		gbc_lblResultadoDasContas.gridy = 7;
		contentPane.add(lblResultadoDasContas, gbc_lblResultadoDasContas);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Agora sera criado um if igual no exercicio dois mais para cada botão selecionado 
				//ENTÃO CADA VEZ QUE FOR CLICADO UM BOTAO FARA TAL COISA, MAS N IRA RODAR SE N FOR CLICADO EM NADA 
				
				if(rdbtnAdicao.isSelected()) {
					//CHAMAR A CLASSE QUE FOI CRIADA PARA REALIZAR O CALCULO 
					String valorPrimeiroNumero = textPrimeiroNumeroInteiro.getText();
					String valorSegundoNumero = textSeundoNumeroInteiro.getText();
					
					//Chama e depois converte 
					//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
					int  PrimeiroNumero = Integer.valueOf(valorPrimeiroNumero);
					int  SegundoNumero = Integer.valueOf(valorSegundoNumero);
					
					//Chamar o metodo- classe criada
					Calculadora  adicao2 = new Calculadora();
					
					//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
					int resultadoAdicao = adicao2.adicao (PrimeiroNumero, SegundoNumero);
					
					lblResultadoDasContas.setText(" "+ resultadoAdicao);
				
					
				} else if (rdbtnSubtracao.isSelected()) {
					//CHAMAR A CLASSE QUE FOI CRIADA PARA REALIZAR O CALCULO 
					String valorPrimeiroNumero = textPrimeiroNumeroInteiro.getText();
					String valorSegundoNumero = textSeundoNumeroInteiro.getText();
					
					//Chama e depois converte 
					//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
					int  PrimeiroNumero = Integer.valueOf(valorPrimeiroNumero);
					int  SegundoNumero = Integer.valueOf(valorSegundoNumero);
					
					//Chamar o metodo- classe criada
					Calculadora  subratracao2 = new Calculadora();
					
					//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
					int resultadoSubtracao = subratracao2.subtracao (PrimeiroNumero, SegundoNumero);
					
					lblResultadoDasContas.setText(" "+ resultadoSubtracao);
					
					
				} else if (rdbtnMultiplicacao.isSelected()) {
					//CHAMAR A CLASSE QUE FOI CRIADA PARA REALIZAR O CALCULO 
					String valorPrimeiroNumero = textPrimeiroNumeroInteiro.getText();
					String valorSegundoNumero = textSeundoNumeroInteiro.getText();
					
					//Chama e depois converte 
					//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
					int  PrimeiroNumero = Integer.valueOf(valorPrimeiroNumero);
					int  SegundoNumero = Integer.valueOf(valorSegundoNumero);
					
					//Chamar o metodo- classe criada
					Calculadora  multiplicacao2 = new Calculadora();
					
					//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
					int resultadoMulti = multiplicacao2.multiplicacao (PrimeiroNumero, SegundoNumero);
					
					lblResultadoDasContas.setText(" "+ resultadoMulti);
					
					
				} else if (rdbtnDivisao.isSelected()) {
					
					//CHAMAR A CLASSE QUE FOI CRIADA PARA REALIZAR O CALCULO 
					String valorPrimeiroNumero = textPrimeiroNumeroInteiro.getText();
					String valorSegundoNumero = textSeundoNumeroInteiro.getText();
					
					//Chama e depois converte 
					//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
					float  PrimeiroNumero = Float.valueOf(valorPrimeiroNumero);
					float  SegundoNumero = Float.valueOf(valorSegundoNumero);
					
					//Chamar o metodo- classe criada
					Calculadora  Divisao2 = new Calculadora();
					
					//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
					float resultadoDivi = Divisao2.divisao (PrimeiroNumero, SegundoNumero);
					
					lblResultadoDasContas.setText(" "+ resultadoDivi);
				}
				
				
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.insets = new Insets(0, 0, 0, 5);
		gbc_btnCalcular.gridx = 0;
		gbc_btnCalcular.gridy = 8;
		contentPane.add(btnCalcular, gbc_btnCalcular);
		
	
	}

}
