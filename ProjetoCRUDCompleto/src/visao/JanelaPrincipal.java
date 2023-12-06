package visao;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Pessoa;
import javax.swing.JSpinner;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 104, 287, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(185, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(181, 36, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				if(nome.length() == 0) {
					JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório!");
					return ;

				}
				
				String cpf= txtCPF.getText();
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				int cpfInt=0;
				try {
					cpfInt = Integer.parseInt(cpf);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "CPF Inválid! Digite apenas números");
					return ;
					
				}
				
				p.setCpf(cpfInt);
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
				
				
				
			}
		});
		btnNewButton.setBounds(11, 67, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione a pessoa para excluir!");
					return;
				}
				
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		
		
		
		
		btnNewButton_1.setBounds(110, 67, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		JanelaPrincipal estaJanela = this;
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				
				JanelaAlterarPessoa janelaAlterar = new JanelaAlterarPessoa(pessoaSelecionada, estaJanela);
				janelaAlterar.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(210, 67, 89, 23);
		contentPane.add(btnNewButton_2);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
	}
	
	
	public void atualizarDadosPessoa(Pessoa pessoa) {
		int linhaSelecionada = table.getSelectedRow();
		listaPessoas.set(linhaSelecionada, pessoa); // Atualizar os dados da pessoa
		atualizarJTableModel();
	}
}










