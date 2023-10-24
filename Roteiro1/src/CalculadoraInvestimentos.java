package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDepositoMensal;
	private JTextField textNumdeMeses;
	private JTextField textJurosaoMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 250, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		lblDepositoMensal.setBounds(55, 10, 126, 13);
		contentPane.add(lblDepositoMensal);
		
		textDepositoMensal = new JTextField();
		textDepositoMensal.setBounds(41, 33, 140, 19);
		contentPane.add(textDepositoMensal);
		textDepositoMensal.setColumns(10);
		
		JLabel lblNumerodeMeses = new JLabel("Num. de meses:");
		lblNumerodeMeses.setBounds(55, 62, 104, 13);
		contentPane.add(lblNumerodeMeses);
		
		textNumdeMeses = new JTextField();
		textNumdeMeses.setBounds(41, 85, 140, 19);
		contentPane.add(textNumdeMeses);
		textNumdeMeses.setColumns(10);
		
		JLabel lblJurosaoMes = new JLabel("Juros ao mês %:  ");
		lblJurosaoMes.setBounds(55, 114, 85, 13);
		contentPane.add(lblJurosaoMes);
		
		textJurosaoMes = new JTextField();
		textJurosaoMes.setBounds(41, 137, 140, 19);
		contentPane.add(textJurosaoMes);
		textJurosaoMes.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total investidos + juros R$:");
		lblNewLabel_3.setBounds(41, 166, 140, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(74, 189, 85, 21);
		contentPane.add(btnCalcular);
	}

}
