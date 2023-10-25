package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ClaculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosGrid frame = new ClaculadoraInvestimentosGrid();
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
	public ClaculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		contentPane.add(lblDepositoMensal);
		
		JLabel lblNumdeMeses = new JLabel("Num. de meses");
		contentPane.add(lblNumdeMeses);
		
		JLabel lblJurosaoMes = new JLabel("Juros ao mês %:");
		contentPane.add(lblJurosaoMes);
		
		JLabel lblTotalInvestidos = new JLabel("Total investido + juros R$: ");
		contentPane.add(lblTotalInvestidos);
	}

}
