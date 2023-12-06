package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class cadastroClienteCheckin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textDataNascimento;
	private JTextField textDataEntrada;
	private JTextField textNumeroQuarto;
	private JTextField textEmail;
	private JTextField textNacionalidade;
	private JTextField textCodigoReserva;
	private JTextField textTelefone;
	private JTextField textCEP;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textCidade;
	private JTextField textEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroClienteCheckin frame = new cadastroClienteCheckin();
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
	public cadastroClienteCheckin() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Cadastro do Cliente Check-in");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 537);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		//colocar um jlabel para colocar as imagens
		//código para redimensionar as imagens. 
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/ClientebotaoSair.png")).getImage().getScaledInstance(110, 30, Image.SCALE_DEFAULT));
				
				//ImageIcon imageIcon1= new ImageIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Châteu_Imperial-removebg-preview 2LogoInicio.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(5, 12, 110, 30);
				//evento de clique 
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					//usado o evento maouseClicked para sair 
					public void mouseClicked(MouseEvent e) {
						setVisible(false);
					}
				});
				lblNewLabel.setIcon(imageIcon);
				
				JLabel lblNewLabel_2 = new JLabel("Seja Bem Vindo!");
				lblNewLabel_2.setBounds(310, 53, 330, 49);
				lblNewLabel_2.setForeground(new Color(1, 50, 1));
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
				
				JLabel lblNewLabel_3 = new JLabel("Insira a informações abaixo para check-in e cadastro:");
				lblNewLabel_3.setBounds(310, 112, 382, 20);
				lblNewLabel_3.setForeground(new Color(1, 50, 1));
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
				JLabel lblNome = new JLabel("Nome:");
				lblNome.setBounds(31, 247, 42, 17);
				lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textNome = new JTextField();
				textNome.setBounds(95, 250, 170, 15);
				textNome.setBorder(new LineBorder(new Color(1, 50, 1)));
				textNome.setSelectedTextColor(new Color(1, 50, 1));
				textNome.setForeground(new Color(0, 0, 0));
				textNome.setDisabledTextColor(new Color(1, 50, 1));
				textNome.setBackground(new Color(255, 255, 255));
				textNome.setColumns(10);
				
				JLabel lblCPF = new JLabel("CPF:");
				lblCPF.setBounds(557, 247, 29, 17);
				lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textCPF = new JTextField();
				textCPF.setBounds(609, 250, 170, 15);
				textCPF.setBorder(new LineBorder(new Color(1, 50, 1)));
				textCPF.setColumns(10);
				
				JLabel lblDataNascimento = new JLabel("Data de nascimento:");
				lblDataNascimento.setBounds(275, 247, 130, 17);
				lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textDataNascimento = new JTextField();
				textDataNascimento.setBounds(415, 250, 132, 15);
				textDataNascimento.setBorder(new LineBorder(new Color(1, 50, 1)));
				textDataNascimento.setColumns(10);
				
				JLabel lblDataCheckin = new JLabel("Data de check-in:");
				lblDataCheckin.setBounds(31, 392, 162, 17);
				lblDataCheckin.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textDataEntrada = new JTextField();
				textDataEntrada.setBounds(143, 395, 130, 15);
				textDataEntrada.setBorder(new LineBorder(new Color(1, 50, 1)));
				textDataEntrada.setColumns(10);
				
				textNumeroQuarto = new JTextField();
				textNumeroQuarto.setBounds(415, 395, 130, 15);
				textNumeroQuarto.setBorder(new LineBorder(new Color(1, 50, 1)));
				textNumeroQuarto.setColumns(10);
				
				JLabel lblEmail = new JLabel("Email:");
				lblEmail.setBounds(31, 287, 45, 17);
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textEmail = new JTextField();
				textEmail.setBounds(95, 289, 170, 20);
				textEmail.setColumns(10);
				
				JLabel lblLogo = new JLabel("");
				lblLogo.setBounds(125, 31, 140, 147);
				lblLogo.setIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Châteu_Imperial-removebg-preview 3.png")));
				lblLogo.setToolTipText("");
				contentPane.setLayout(null);
				contentPane.add(lblNewLabel);
				contentPane.add(lblLogo);
				contentPane.add(lblNewLabel_3);
				contentPane.add(lblNewLabel_2);
				contentPane.add(lblNome);
				contentPane.add(lblCPF);
				contentPane.add(textNome);
				contentPane.add(lblDataNascimento);
				contentPane.add(textDataNascimento);
				contentPane.add(textEmail);
				contentPane.add(textCPF);
				contentPane.add(lblDataCheckin);
				contentPane.add(textDataEntrada);
				contentPane.add(textNumeroQuarto);
				contentPane.add(lblEmail);
				
				JLabel lblNumeroQuarto = new JLabel("Número do quarto:");
				lblNumeroQuarto.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNumeroQuarto.setBounds(283, 394, 150, 13);
				contentPane.add(lblNumeroQuarto);
				
				JLabel lblGenero = new JLabel("Genêro:");
				lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblGenero.setBounds(275, 290, 68, 13);
				contentPane.add(lblGenero);
				
				JComboBox comboBoxGenero = new JComboBox();
				comboBoxGenero.setBounds(328, 288, 85, 21);
				contentPane.add(comboBoxGenero);
				
				JLabel lblNacionalidade = new JLabel("Nacionalidade:");
				lblNacionalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNacionalidade.setBounds(423, 290, 103, 13);
				contentPane.add(lblNacionalidade);
				
				textNacionalidade = new JTextField();
				textNacionalidade.setBounds(514, 289, 115, 19);
				contentPane.add(textNacionalidade);
				textNacionalidade.setColumns(10);
				
				JLabel lblCodigodaReserva = new JLabel("Código da reserva:");
				lblCodigodaReserva.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCodigodaReserva.setBounds(562, 391, 130, 19);
				contentPane.add(lblCodigodaReserva);
				
				textCodigoReserva = new JTextField();
				textCodigoReserva.setBounds(687, 393, 96, 19);
				contentPane.add(textCodigoReserva);
				textCodigoReserva.setColumns(10);
				
				JLabel lblTelefone = new JLabel("Telefone:");
				lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblTelefone.setBounds(28, 326, 68, 13);
				contentPane.add(lblTelefone);
				
				textTelefone = new JTextField();
				textTelefone.setBounds(95, 325, 110, 19);
				contentPane.add(textTelefone);
				textTelefone.setColumns(10);
				
				JLabel lblCEP = new JLabel("CEP:");
				lblCEP.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCEP.setBounds(215, 326, 45, 13);
				contentPane.add(lblCEP);
				
				textCEP = new JTextField();
				textCEP.setBounds(251, 325, 96, 19);
				contentPane.add(textCEP);
				textCEP.setColumns(10);
				
				JLabel lblRua = new JLabel("Rua:");
				lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblRua.setBounds(373, 328, 45, 13);
				contentPane.add(lblRua);
				
				textField = new JTextField();
				textField.setBounds(415, 325, 132, 19);
				contentPane.add(textField);
				textField.setColumns(10);
				
				JLabel lblBairro = new JLabel("Bairro:");
				lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblBairro.setBounds(557, 328, 45, 13);
				contentPane.add(lblBairro);
				
				textField_1 = new JTextField();
				textField_1.setBounds(607, 327, 172, 19);
				contentPane.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblCidade = new JLabel("Cidade:");
				lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCidade.setBounds(31, 364, 65, 13);
				contentPane.add(lblCidade);
				
				textCidade = new JTextField();
				textCidade.setBounds(95, 363, 96, 19);
				contentPane.add(textCidade);
				textCidade.setColumns(10);
				
				JLabel lblEstado = new JLabel("Estado:");
				lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblEstado.setBounds(201, 366, 85, 13);
				contentPane.add(lblEstado);
				
				textEstado = new JTextField();
				textEstado.setBounds(261, 363, 96, 19);
				contentPane.add(textEstado);
				textEstado.setColumns(10);
	}
}
