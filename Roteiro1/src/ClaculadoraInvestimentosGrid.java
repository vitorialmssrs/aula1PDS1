package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.model.FormSobre;
import src.model.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ClaculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDeposito;
	private JTextField textNumMeses;
	private JTextField textJuros;

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
		setBounds(100, 100, 454, 231);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSobre janela = new FormSobre();
				janela.setVisible(true);
			}
		});
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		panel.add(lblDepositoMensal);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textDeposito = new JTextField();
		panel_7.add(textDeposito);
		textDeposito.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNumdeMeses = new JLabel("Num. de meses");
		panel_1.add(lblNumdeMeses);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textNumMeses = new JTextField();
		panel_2.add(textNumMeses);
		textNumMeses.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblJurosaoMes = new JLabel("Juros ao mês %:");
		panel_3.add(lblJurosaoMes);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textJuros = new JTextField();
		panel_4.add(textJuros);
		textJuros.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		contentPane.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTotalInvestidos = new JLabel("Total investido + juros R$: ");
		panel_9.add(lblTotalInvestidos);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblresultado = new JLabel("");
		panel_5.add(lblresultado);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_6 = new JPanel();
		panel_8.add(panel_6);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCalcular = new JButton("Calcular");
		panel_10.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//pegar a mensagem digitada no componente texto a gente quer chamar o metodo conversão temperatura e 
				String depDigitado = textDeposito.getText();
				String mesesDigitados = textNumMeses.getText();
				 String jurosDigitados = textJuros.getText();
			
				//precisa converter a Mensagem de string pra int e double (f) formatada
				int MesesDigitadosf = Integer.parseInt(depDigitado);
				double  DepDigitadof = Double.parseDouble(mesesDigitados);
				double JurosDigitadosf = Double.parseDouble(jurosDigitados);
				
				//criar objeto para mostrar a mensagem chamando a classe chamando primeiro a classe depois os metodos (ob objeto criado) (resTodos) 
				Investimento cal = new Investimento(MesesDigitadosf, DepDigitadof,JurosDigitadosf);
				//variavel para por o metodo da classe e ja chama o metodo
				double resTodos = cal.calculaTotal();
				 
				//mostrar na tela sem se a telinha que mostra as resposta
				lblresultado.setText( ""+ resTodos);
				
				
			}
		});
	}

}
