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
	private JButton btnNewButton_2;
	private JTextField textPeso;
	private JTextField textIdade;
	private JLabel lblTelefone;

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
		setBounds(100, 100, 805, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 100, 617, 149);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: "+pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		scrollPane.setColumnHeaderView(lblNewLabel_1);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(313, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(309, 36, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
				
				
				
			}
		});
		btnNewButton.setBounds(140, 66, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_1.setBounds(239, 66, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//pegar a linha selecionada 
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = Pessoa.get(linha);
				
				//precisa abrir a janela cria um objeto e chama um metodo ste visible true 
				
				AlterarPessoa JanelaPessoa = new AlterarPessoa(pessoaSelecionada);
				
				//chama metodos para passar as informações para o objeto 
				//ou usa o metodo construtor chamado uma vez só quando cria o objeto 
				
					
			}
		});
		btnNewButton_2.setBounds(339, 66, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(172, 12, 63, 13);
		contentPane.add(lblPeso);
		
		textPeso = new JTextField();
		textPeso.setBounds(166, 36, 132, 19);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(441, 12, 45, 13);
		contentPane.add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.setBounds(437, 36, 96, 19);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(551, 12, 45, 13);
		contentPane.add(lblTelefone);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Nome", "CPF", "Idade", "Peso", "Telefone"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
	}
}










