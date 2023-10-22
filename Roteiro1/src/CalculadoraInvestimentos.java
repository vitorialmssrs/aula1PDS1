import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textDepositomensal;
	private JTextField textNumdeMeses;

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
		
		textField = new JTextField();
		textField.setBounds(37, 132, 169, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textDepositomensal = new JTextField();
		textDepositomensal.setBounds(37, 33, 169, 19);
		contentPane.add(textDepositomensal);
		textDepositomensal.setColumns(10);
		
		textNumdeMeses = new JTextField();
		textNumdeMeses.setBounds(37, 79, 169, 19);
		contentPane.add(textNumdeMeses);
		textNumdeMeses.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.setBounds(78, 182, 85, 21);
		contentPane.add(btnCalcular);
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		lblDepositoMensal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDepositoMensal.setBounds(66, 10, 140, 13);
		contentPane.add(lblDepositoMensal);
		
		JLabel lblNumdeMeses = new JLabel("Num. de meses:");
		lblNumdeMeses.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumdeMeses.setBounds(66, 56, 117, 13);
		contentPane.add(lblNumdeMeses);
		
		JLabel lblJurosdoMes = new JLabel("Juros ao mês %: ");
		lblJurosdoMes.setHorizontalAlignment(SwingConstants.TRAILING);
		lblJurosdoMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJurosdoMes.setBounds(66, 108, 106, 13);
		contentPane.add(lblJurosdoMes);
		
		JLabel lblNewLabel = new JLabel("Total investido + juros R$:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(47, 161, 159, 13);
		contentPane.add(lblNewLabel);
	}
}
