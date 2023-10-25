package src.model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSobre frame = new FormSobre();
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
	public FormSobre() {
		setTitle("Sobre o CalcInvest");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 433, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 0));
		
		JLabel lblCalcInvest = new JLabel("Calc Invest - Calculadora de Investimento");
		contentPane.add(lblCalcInvest);
		
		JLabel lblVersao = new JLabel("Versão: 1.0");
		contentPane.add(lblVersao);
		
		JLabel lblAutor = new JLabel("Autor: Vitória Lemos Soares");
		contentPane.add(lblAutor);
		
		JLabel lblContato = new JLabel("Contato: vitoria.ls10@aluno.ifsc.edu.br");
		contentPane.add(lblContato);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel.add(btnOk);
	}

}
