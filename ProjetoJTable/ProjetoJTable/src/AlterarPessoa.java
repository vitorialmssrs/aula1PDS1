import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarPessoa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarPessoa frame = new AlterarPessoa();
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
	public AlterarPessoa(Pessoa pessoaSelecionada) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 351, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][grow]", "[][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Alterar Pessoa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 3 0");
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		contentPane.add(lblNewLabel_1, "cell 0 2");
		
		textNome = new JTextField();
		contentPane.add(textNome, "cell 2 2 2 1,growx");
		textNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		contentPane.add(lblNewLabel_2, "cell 0 3");
		
		textCPF = new JTextField();
		contentPane.add(textCPF, "cell 2 3 2 1,growx");
		textCPF.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//implementar que a janela alterar comunique com a principal informando as modificações e atualize no array list 
				//tem a janela principal que chamou alterar e n tem nenhuma referencia nessa janela então precisa chamar os metódos 
				//quando clicar no botão salvar precisa informar que os dados foram alterados 
				//
			}
		});
		contentPane.add(btnSalvar, "cell 2 6");
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pessoaSelecionada.setNome(textNome.getText());
				int cpfINT = Integer.parseInt(textCPF.getText());
				
				pessoaSelecionada.setCpf(cpfINt);
				
				janela.atualizarDadosPessoa();
				
				
				//fechar a janela  e desaloca tudo que foi alocado na memoria 
				//precisa por na janela que vai usar o dispose em exit_close
				dispose();
			}
		});
		contentPane.add(btnCancelar, "cell 5 6");
		
		textNome.setText(pessoaSelecionada.getNome());
		
		//conversão string 
		String cpfString = String.valueOf(pessoaSelecionada.getCpf());
		textCPF.setText(cpfString);
		
		
	}

}
