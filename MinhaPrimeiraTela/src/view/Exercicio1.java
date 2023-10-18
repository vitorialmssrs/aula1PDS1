package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTextoTemperatura;

	/**
	 * Launch the application.
	 */
	//MAIN METODO INICIAL EM JAVA QUE INICIA O SISTEMA 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setBackground(new Color(0, 0, 0));
		setTitle("Janela de Conversão de temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 305);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversão de Temperatura");
		lblNewLabel.setForeground(new Color(153, 51, 204));
		lblNewLabel.setBackground(new Color(153, 51, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(139, 11, 265, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblTemperaturaF = new JLabel("Temperatura ( F )");
		lblTemperaturaF.setBounds(57, 145, 105, 14);
		contentPane.add(lblTemperaturaF);
		
		txtTextoTemperatura = new JTextField();
		txtTextoTemperatura.setBounds(189, 142, 175, 20);
		contentPane.add(txtTextoTemperatura);
		txtTextoTemperatura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar a temperatura digitada no componente texto a gente quer chamar o metodo conversão temperatura e 
				String tempDigitada = txtTextoTemperatura.getText();
				//precisa converter a temperatura de string pra float 
				float temConvertidaF = Float.valueOf(tempDigitada);
				//criar objeto conversao temperatura chamando a classe chamando primeiro a classe depois os metodos 
				ConversaoTemperatura conv = new ConversaoTemperatura();
				//chamar metodo conversao 
				float tempC = conv.converterFtoC(temConvertidaF);
				//mostrar temperatura convertida 
				JOptionPane.showMessageDialog(null, "A temperatura convertida é  "+ tempC);
			}
		});
		btnCalcular.setBounds(208, 193, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblMensagemdeInformação = new JLabel("Esse programa faz a conversão de Farenheit para Celsius");
		lblMensagemdeInformação.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMensagemdeInformação.setBounds(103, 46, 331, 20);
		contentPane.add(lblMensagemdeInformação);
		
		JLabel lblMensagemDigiteaTemperatura = new JLabel("Digite a temperatura que deseja converter no local indicado abaixo");
		lblMensagemDigiteaTemperatura.setBounds(57, 96, 369, 14);
		contentPane.add(lblMensagemDigiteaTemperatura);
	}

}
