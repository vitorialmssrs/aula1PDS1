package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.RetanguloEx3;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCaixaValor1;
	private JTextField textAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Calculadora Retangulo");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
		lblTitulo.setBounds(161, 31, 195, 19);
		contentPane.add(lblTitulo);
		
		textCaixaValor1 = new JTextField();
		textCaixaValor1.setBounds(183, 112, 126, 19);
		contentPane.add(textCaixaValor1);
		textCaixaValor1.setColumns(10);
		
		JLabel lblDigitarValor = new JLabel("Digite o valor da base");
		lblDigitarValor.setFont(new Font("Arial", Font.ITALIC, 14));
		lblDigitarValor.setBounds(21, 114, 152, 13);
		contentPane.add(lblDigitarValor);
		
		textAltura = new JTextField();
		textAltura.setBounds(183, 160, 126, 19);//setBound são as cordenadas dos componentes(posição, largura, comprimento,)
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite a altura");
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 14));
		lblNewLabel.setBounds(29, 166, 109, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//chamar a classe que foi criada para ele realizar o calculo e mostrar na tela
				String valorBase = textCaixaValor1.getText() ;
				String valorAltura = textAltura.getText();
				//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
				float baseConvertida = Float.valueOf(valorBase);
				float alturaConvertida = Float.valueOf(valorAltura);
				//chamar o metodo criado 
				RetanguloEx3 contas = new RetanguloEx3 ();
				
				//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
				float resultadoArea = contas.calculoArea(baseConvertida, alturaConvertida);
				float resultadoPerimetro = contas.calculoPerimetro (baseConvertida, alturaConvertida);
				
						

				//para mostrar as informações agora 
				JOptionPane.showMessageDialog(null, "O valor do Perimetro  e da área são: "+resultadoPerimetro + " "+ resultadoArea);
				
			}
		});
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.setBounds(205, 240, 85, 21);
		contentPane.add(btnCalcular);
	}

}
