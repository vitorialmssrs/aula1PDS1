package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Pessoa;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaAlterarPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;


	/**
	 * Create the frame.
	 */
	public JanelaAlterarPessoa(Pessoa pessoaSelecionada, JanelaPrincipal janela) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 284, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Alterar Pessoa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 6 0");
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		contentPane.add(lblNewLabel_1, "cell 2 2");
		
		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 4 2 11 1,growx");
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		contentPane.add(lblNewLabel_2, "cell 2 3");
		
		txtCPF = new JTextField();
		contentPane.add(txtCPF, "cell 4 3 11 1,growx");
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pessoaSelecionada.setNome(txtNome.getText());
				int cpfInt = Integer.parseInt(txtCPF.getText());
				
				pessoaSelecionada.setCpf(cpfInt);
				janela.atualizarDadosPessoa(pessoaSelecionada);
				dispose();
				
			}
		});
		contentPane.add(btnNewButton, "cell 6 5");
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnNewButton_1, "cell 9 5");
		String cpfString = String.valueOf(pessoaSelecionada.getCpf());
		txtCPF.setText(cpfString);
	}
	

	

}
