import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Jjanela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jjanela frame = new Jjanela();
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
	public Jjanela() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Janela Entrada");
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlaPessoa = new JLabel("Olá Cliente!");
		lblOlaPessoa.setForeground(new Color(102, 51, 102));
		lblOlaPessoa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "O foco está na JLabel");
			}
		});
		lblOlaPessoa.setVerticalAlignment(SwingConstants.TOP);
		lblOlaPessoa.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblOlaPessoa.setBounds(167, 11, 128, 23);
		contentPane.add(lblOlaPessoa);
		
		JButton btnFechar = new JButton("Fechar ");
		btnFechar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
			}
		});
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setForeground(Color.RED);
		btnFechar.setFont(new Font("Arial", Font.BOLD, 12));
		btnFechar.setBounds(306, 174, 104, 23);
		contentPane.add(btnFechar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar o texto digitad no Jtxtnome e 
				String nome = txtNome.getText();
				//quando pegar armazenar em uma variavel tipo string e mostrar o nome digitado na tela usando o JOptionPane
				//mostrar na tela
				JOptionPane.showMessageDialog(null, "O nome digitado é  " +nome);
			}
		});
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalvar.setBounds(174, 174, 104, 23);
		contentPane.add(btnSalvar);
		
		txtNome = new JTextField();
		txtNome.setBounds(156, 100, 196, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(102, 0, 102));
		lblNome.setFont(new Font("Arial", Font.BOLD, 12));
		lblNome.setBounds(78, 102, 68, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Digite seu nome para começar");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 10));
		lblNewLabel.setBounds(78, 58, 190, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(" ");
			}
		});
		btnLimpar.setBounds(23, 174, 114, 23);
		contentPane.add(btnLimpar);
	}
}
