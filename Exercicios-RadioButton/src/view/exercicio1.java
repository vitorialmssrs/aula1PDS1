package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Retangulo;
import model.ConversaoTemperatura;
import model.RetanguloEx3;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio1 frame = new exercicio1();
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
	public exercicio1() {
		setTitle("Retangulo ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 96, 95};
		gbl_contentPane.rowHeights = new int[] {27, 27, 27, 27};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblBase = new GridBagConstraints();
		gbc_lblBase.fill = GridBagConstraints.VERTICAL;
		gbc_lblBase.insets = new Insets(0, 0, 5, 5);
		gbc_lblBase.gridx = 1;
		gbc_lblBase.gridy = 0;
		contentPane.add(lblBase, gbc_lblBase);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 0;
		contentPane.add(label, gbc_label);
		
		JLabel lblArea = new JLabel("Altura");
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblArea = new GridBagConstraints();
		gbc_lblArea.fill = GridBagConstraints.BOTH;
		gbc_lblArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblArea.gridx = 3;
		gbc_lblArea.gridy = 0;
		contentPane.add(lblArea, gbc_lblArea);
		
		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 5;
		gbc_label_1.gridy = 0;
		contentPane.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 0;
		contentPane.add(label_2, gbc_label_2);
		
		textBase = new JTextField();
		GridBagConstraints gbc_textBase = new GridBagConstraints();
		gbc_textBase.anchor = GridBagConstraints.NORTH;
		gbc_textBase.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBase.insets = new Insets(0, 0, 5, 5);
		gbc_textBase.gridx = 1;
		gbc_textBase.gridy = 1;
		contentPane.add(textBase, gbc_textBase);
		textBase.setColumns(10);
		
		JLabel label_3 = new JLabel("");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 2;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		textAltura = new JTextField();
		GridBagConstraints gbc_textAltura = new GridBagConstraints();
		gbc_textAltura.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAltura.anchor = GridBagConstraints.NORTH;
		gbc_textAltura.insets = new Insets(0, 0, 5, 5);
		gbc_textAltura.gridx = 3;
		gbc_textAltura.gridy = 1;
		contentPane.add(textAltura, gbc_textAltura);
		textAltura.setColumns(10);
		
		JLabel label_4 = new JLabel("");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 5;
		gbc_label_4.gridy = 1;
		contentPane.add(label_4, gbc_label_4);
		
		JLabel label_5 = new JLabel("");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.gridheight = 2;
		gbc_label_5.fill = GridBagConstraints.BOTH;
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 6;
		gbc_label_5.gridy = 1;
		contentPane.add(label_5, gbc_label_5);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnArea = new GridBagConstraints();
		gbc_rdbtnArea.fill = GridBagConstraints.BOTH;
		gbc_rdbtnArea.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnArea.gridx = 1;
		gbc_rdbtnArea.gridy = 2;
		contentPane.add(rdbtnArea, gbc_rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnPerimetro);
		rdbtnPerimetro.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnPerimetro = new GridBagConstraints();
		gbc_rdbtnPerimetro.fill = GridBagConstraints.BOTH;
		gbc_rdbtnPerimetro.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPerimetro.gridx = 3;
		gbc_rdbtnPerimetro.gridy = 2;
		contentPane.add(rdbtnPerimetro, gbc_rdbtnPerimetro);
		
		JLabel lblResultadoArea = new JLabel("");
		lblResultadoArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblResultadoArea = new GridBagConstraints();
		gbc_lblResultadoArea.fill = GridBagConstraints.BOTH;
		gbc_lblResultadoArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblResultadoArea.gridx = 1;
		gbc_lblResultadoArea.gridy = 3;
		contentPane.add(lblResultadoArea, gbc_lblResultadoArea);
		
		JLabel label_6 = new JLabel("");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.BOTH;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 2;
		gbc_label_6.gridy = 3;
		contentPane.add(label_6, gbc_label_6);
		
		JLabel lblResultadoPerimetro = new JLabel("");
		lblResultadoPerimetro.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblResultadoPerimetro = new GridBagConstraints();
		gbc_lblResultadoPerimetro.fill = GridBagConstraints.BOTH;
		gbc_lblResultadoPerimetro.insets = new Insets(0, 0, 5, 5);
		gbc_lblResultadoPerimetro.gridx = 3;
		gbc_lblResultadoPerimetro.gridy = 3;
		contentPane.add(lblResultadoPerimetro, gbc_lblResultadoPerimetro);
		
		JLabel label_7 = new JLabel("");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.BOTH;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 5;
		gbc_label_7.gridy = 3;
		contentPane.add(label_7, gbc_label_7);
		
		JLabel label_8 = new JLabel("");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.BOTH;
		gbc_label_8.insets = new Insets(0, 0, 5, 0);
		gbc_label_8.gridx = 6;
		gbc_label_8.gridy = 3;
		contentPane.add(label_8, gbc_label_8);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if ( rdbtnPerimetro = != null  ) {
				
				//chamar a classe que foi criada para ele realizar o calculo e mostrar na tela
				//String valorBase = textBase.getText();
				//String valorAltura = textAltura.getText();
				
				//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
				//float baseConvertida = Float.valueOf(valorBase);
				//float alturaConvertida = Float.valueOf(valorAltura);
				
				//chamar o metodo criado 
				//Retangulo contas = new Retangulo ();
				
				//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
				//float resultadoPerimetro = contas.perimetroTotal (baseConvertida, alturaConvertida);
				
				//lblResultadoArea.setText( ""+ resultadoPerimetro);
				//} else { //Como vou identificar que é o outro botão? 
					
					//chamar a classe que foi criada para ele realizar o calculo e mostrar na tela
					
				//String valorBase = textBase.getText() ;//
					//String valorAltura = textAltura.getText();
					
					//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
					//float baseConvertida = Float.valueOf(valorBase);
					//float alturaConvertida = Float.valueOf(valorAltura);
					
					//Retangulo contasA = new Retangulo ();
					
					//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
					//float resultadoArea = contasA.areaTotal(baseConvertida, alturaConvertida);
					//comando que diz o resultado da area 
					//lblResultadoArea.setText( ""+ resultadoArea);

				}
				
				
				//chamar a classe que foi criada para ele realizar o calculo e mostrar na tela
				
				//String valorBase = textBase.getText() ;
				//String valorAltura = textAltura.getText();
				//primeiro chama o numero e depois converte usando essa formula pode usar para todos 
				//float baseConvertida = Float.valueOf(valorBase);
				//float alturaConvertida = Float.valueOf(valorAltura);
				//chamar o metodo criado 
				//Retangulo contas = new Retangulo ();
				
				//chama os metodos criados usando uma nova variavel que foi criada em cima para armazenar
				//float resultadoArea = contas.areaTotal(baseConvertida, alturaConvertida);
				//float resultadoPerimetro = contas.perimetroTotal (baseConvertida, alturaConvertida);
				
				//float resultArea = 
				//comando que diz o resultado da area 
				//lblResultadoArea.setText( ""+ resultadoArea);
				//precisa ter um if? por causa dos botões? 		

				//para mostrar as informações agora 
				//JOptionPane.showMessageDialog(null, "O valor do Perimetro  e da área são: "+resultadoPerimetro + " "+ resultadoArea);
				
			//}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.fill = GridBagConstraints.BOTH;
		gbc_btnCalcular.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalcular.gridx = 1;
		gbc_btnCalcular.gridy = 4;
		contentPane.add(btnCalcular, gbc_btnCalcular);
		GridBagConstraints gbc_btnLimpar = new GridBagConstraints();
		gbc_btnLimpar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpar.gridx = 2;
		gbc_btnLimpar.gridy = 4;
		contentPane.add(btnLimpar, gbc_btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnFechar = new GridBagConstraints();
		gbc_btnFechar.fill = GridBagConstraints.BOTH;
		gbc_btnFechar.insets = new Insets(0, 0, 5, 5);
		gbc_btnFechar.gridx = 3;
		gbc_btnFechar.gridy = 4;
		contentPane.add(btnFechar, gbc_btnFechar);
		
		JLabel label_9 = new JLabel("");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.BOTH;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 4;
		gbc_label_9.gridy = 4;
		contentPane.add(label_9, gbc_label_9);
		
		JLabel label_10 = new JLabel("");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.fill = GridBagConstraints.BOTH;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 5;
		gbc_label_10.gridy = 4;
		contentPane.add(label_10, gbc_label_10);
		
		JLabel label_11 = new JLabel("");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.fill = GridBagConstraints.BOTH;
		gbc_label_11.insets = new Insets(0, 0, 5, 0);
		gbc_label_11.gridx = 6;
		gbc_label_11.gridy = 4;
		contentPane.add(label_11, gbc_label_11);
		
		JLabel label_12 = new JLabel("");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.fill = GridBagConstraints.BOTH;
		gbc_label_12.insets = new Insets(0, 0, 0, 5);
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 5;
		contentPane.add(label_12, gbc_label_12);
		
		JLabel label_13 = new JLabel("");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.fill = GridBagConstraints.BOTH;
		gbc_label_13.gridx = 6;
		gbc_label_13.gridy = 5;
		contentPane.add(label_13, gbc_label_13);
	}

}
