package visao;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;
import modelo.PessoaJTableModel;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnAlterar;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JLabel lblPeso;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JLabel lblAtura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 144, 447, 152);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				txtNome.setText(pessoaSelecionada.getNome());
				txtCPF.setText(String.valueOf(pessoaSelecionada.getCpf()));
				txtTelefone.setText(String.valueOf(pessoaSelecionada.getTelefone()));
				txtIdade.setText(String.valueOf(pessoaSelecionada.getIdade()));
				txtPeso.setText(String.valueOf(pessoaSelecionada.getIdade()));
				txtAltura.setText(String.valueOf(pessoaSelecionada.getAltura()));		
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(29, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(65, 9, 202, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(29, 61, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(73, 59, 194, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar na tabela");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				String telefone = txtTelefone.getText();
				String idade = txtIdade.getText();
				String peso = txtPeso.getText();
				String altura = txtAltura.getText();
				
				Long cpfF = Long.parseLong(cpf);
            	Long telF = Long.parseLong(telefone);
            	Integer idadeF = Integer.parseInt(idade);
            	Float pesoF = Float.parseFloat(peso);
            	Float altF = Float.parseFloat(altura);
            	
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(cpfF);
				p.setTelefone(telF);
				p.setIdade(idadeF);
				p.setPeso(pesoF);
				p.setAltura(altF);
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton.setBounds(130, 99, 217, 23);
		contentPane.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnExcluir.setBounds(65, 323, 95, 23);
		contentPane.add(btnExcluir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa p = listaPessoas.get(table.getSelectedRow());
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				String telefone = txtTelefone.getText();
				String idade = txtIdade.getText();
				String peso = txtPeso.getText();
				String altura = txtAltura.getText();
				
				Long cpfF = Long.parseLong(cpf);
				Long tel = Long.parseLong(telefone);
				Integer id = Integer.parseInt(idade);
				Float pesoF = Float.parseFloat(peso);
				Float alt = Float.parseFloat(altura);
				
				p.setNome(nome);
				p.setCpf(cpfF);
				p.setTelefone(tel);
				p.setIdade(id);
				p.setPeso(pesoF);
				p.setAltura(alt);
				
				atualizarJTableModel();
				limparCampos();
				
				
				//int idx_linha = table.getSelectedRow();
				
				//listaPessoas.remove(idx_linha);
				//atualizarJTableModel();
				
				//PopUpEdicao popUpEdicao = new PopUpEdicao();
				
				//popUpEdicao.atualizarJTableModel();
				
				
				//Pessoa pessoaSelecionada = listaPessoas.get(idx_linha);
				
				//pessoaSelecionada.setText();
				
		        //popUpEdicao.setVisible(true);
		        
		        //atualizarJTableModel();
			}
		});
		btnAlterar.setBounds(170, 323, 95, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(29, 35, 69, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(75, 33, 191, 20);
		contentPane.add(txtTelefone);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(316, 59, 111, 20);
		contentPane.add(txtIdade);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(277, 61, 46, 14);
		contentPane.add(lblIdade);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(277, 11, 46, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(316, 9, 111, 20);
		contentPane.add(txtPeso);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(316, 33, 111, 20);
		contentPane.add(txtAltura);
		
		lblAtura = new JLabel("Altura");
		lblAtura.setBounds(276, 35, 46, 14);
		contentPane.add(lblAtura);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(275, 323, 89, 23);
		contentPane.add(btnFechar);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
	}
}