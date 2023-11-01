package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class SistemadePostodeCombustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textOleoDisel;
	private JTextField textGasolinaComum;
	private JTextField textGasolinaAditivada;
	private JTextField textEtanol;
	private JTextField textField;
	private JTextField textFrasco1Litro;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemadePostodeCombustivel frame = new SistemadePostodeCombustivel();
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
	public SistemadePostodeCombustivel() {
		setTitle("Posto de combustivel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel_TabelaPreco_combustivel = new JPanel();
		panel_TabelaPreco_combustivel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Combust\u00EDvel ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		GridBagLayout gbl_panel_TabelaPreco_combustivel = new GridBagLayout();
		gbl_panel_TabelaPreco_combustivel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_TabelaPreco_combustivel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_TabelaPreco_combustivel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_TabelaPreco_combustivel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_TabelaPreco_combustivel.setLayout(gbl_panel_TabelaPreco_combustivel);
		
		JLabel lblOleoDisel = new JLabel("Oleo Disel:");
		GridBagConstraints gbc_lblOleoDisel = new GridBagConstraints();
		gbc_lblOleoDisel.anchor = GridBagConstraints.WEST;
		gbc_lblOleoDisel.insets = new Insets(0, 0, 5, 5);
		gbc_lblOleoDisel.gridx = 0;
		gbc_lblOleoDisel.gridy = 0;
		panel_TabelaPreco_combustivel.add(lblOleoDisel, gbc_lblOleoDisel);
		
		textOleoDisel = new JTextField();
		GridBagConstraints gbc_textOleoDisel = new GridBagConstraints();
		gbc_textOleoDisel.insets = new Insets(0, 0, 5, 0);
		gbc_textOleoDisel.fill = GridBagConstraints.HORIZONTAL;
		gbc_textOleoDisel.gridx = 2;
		gbc_textOleoDisel.gridy = 0;
		panel_TabelaPreco_combustivel.add(textOleoDisel, gbc_textOleoDisel);
		textOleoDisel.setColumns(10);
		
		JLabel lblGasolinaComum4 = new JLabel("Gasolina Comum:");
		GridBagConstraints gbc_lblGasolinaComum4 = new GridBagConstraints();
		gbc_lblGasolinaComum4.anchor = GridBagConstraints.WEST;
		gbc_lblGasolinaComum4.insets = new Insets(0, 0, 5, 5);
		gbc_lblGasolinaComum4.gridx = 0;
		gbc_lblGasolinaComum4.gridy = 1;
		panel_TabelaPreco_combustivel.add(lblGasolinaComum4, gbc_lblGasolinaComum4);
		
		textGasolinaComum = new JTextField();
		textGasolinaComum.setText("");
		GridBagConstraints gbc_textGasolinaComum = new GridBagConstraints();
		gbc_textGasolinaComum.insets = new Insets(0, 0, 5, 0);
		gbc_textGasolinaComum.fill = GridBagConstraints.HORIZONTAL;
		gbc_textGasolinaComum.gridx = 2;
		gbc_textGasolinaComum.gridy = 1;
		panel_TabelaPreco_combustivel.add(textGasolinaComum, gbc_textGasolinaComum);
		textGasolinaComum.setColumns(10);
		
		JLabel lblGasolinaAditivada = new JLabel("Gasolina Aditivada:");
		GridBagConstraints gbc_lblGasolinaAditivada = new GridBagConstraints();
		gbc_lblGasolinaAditivada.anchor = GridBagConstraints.WEST;
		gbc_lblGasolinaAditivada.insets = new Insets(0, 0, 5, 5);
		gbc_lblGasolinaAditivada.gridx = 0;
		gbc_lblGasolinaAditivada.gridy = 2;
		panel_TabelaPreco_combustivel.add(lblGasolinaAditivada, gbc_lblGasolinaAditivada);
		
		textGasolinaAditivada = new JTextField();
		GridBagConstraints gbc_textGasolinaAditivada = new GridBagConstraints();
		gbc_textGasolinaAditivada.insets = new Insets(0, 0, 5, 0);
		gbc_textGasolinaAditivada.fill = GridBagConstraints.HORIZONTAL;
		gbc_textGasolinaAditivada.gridx = 2;
		gbc_textGasolinaAditivada.gridy = 2;
		panel_TabelaPreco_combustivel.add(textGasolinaAditivada, gbc_textGasolinaAditivada);
		textGasolinaAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		GridBagConstraints gbc_lblEtanol = new GridBagConstraints();
		gbc_lblEtanol.anchor = GridBagConstraints.WEST;
		gbc_lblEtanol.insets = new Insets(0, 0, 0, 5);
		gbc_lblEtanol.gridx = 0;
		gbc_lblEtanol.gridy = 3;
		panel_TabelaPreco_combustivel.add(lblEtanol, gbc_lblEtanol);
		
		textEtanol = new JTextField();
		GridBagConstraints gbc_textEtanol = new GridBagConstraints();
		gbc_textEtanol.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEtanol.gridx = 2;
		gbc_textEtanol.gridy = 3;
		panel_TabelaPreco_combustivel.add(textEtanol, gbc_textEtanol);
		textEtanol.setColumns(10);
		
		JPanel panel_TabelaPreco_OleoMotor = new JPanel();
		panel_TabelaPreco_OleoMotor.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gbl_panel_TabelaPreco_OleoMotor = new GridBagLayout();
		gbl_panel_TabelaPreco_OleoMotor.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_TabelaPreco_OleoMotor.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_TabelaPreco_OleoMotor.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_TabelaPreco_OleoMotor.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_TabelaPreco_OleoMotor.setLayout(gbl_panel_TabelaPreco_OleoMotor);
		
		JLabel lblFrasco500mL = new JLabel("Frasco 500 mL:");
		GridBagConstraints gbc_lblFrasco500mL = new GridBagConstraints();
		gbc_lblFrasco500mL.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrasco500mL.gridx = 0;
		gbc_lblFrasco500mL.gridy = 1;
		panel_TabelaPreco_OleoMotor.add(lblFrasco500mL, gbc_lblFrasco500mL);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_TabelaPreco_OleoMotor.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblFrasco1Litro = new JLabel("Frasco 1 Litro:");
		GridBagConstraints gbc_lblFrasco1Litro = new GridBagConstraints();
		gbc_lblFrasco1Litro.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrasco1Litro.gridx = 0;
		gbc_lblFrasco1Litro.gridy = 2;
		panel_TabelaPreco_OleoMotor.add(lblFrasco1Litro, gbc_lblFrasco1Litro);
		
		textFrasco1Litro = new JTextField();
		GridBagConstraints gbc_textFrasco1Litro = new GridBagConstraints();
		gbc_textFrasco1Litro.insets = new Insets(0, 0, 5, 0);
		gbc_textFrasco1Litro.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFrasco1Litro.gridx = 2;
		gbc_textFrasco1Litro.gridy = 2;
		panel_TabelaPreco_OleoMotor.add(textFrasco1Litro, gbc_textFrasco1Litro);
		textFrasco1Litro.setColumns(10);
		
		JPanel panel_OleoMotor = new JPanel();
		panel_OleoMotor.setBorder(new TitledBorder(null, "\u00D3leo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_Abastecimento = new JPanel();
		panel_Abastecimento.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_OleoMotor.setLayout(new MigLayout("", "[106px][106px][106px][106px][106px]", "[21px][21px][21px][21px][21px]"));
		
		JLabel label = new JLabel("");
		panel_OleoMotor.add(label, "cell 0 0,grow");
		
		JLabel label_1 = new JLabel("");
		panel_OleoMotor.add(label_1, "cell 1 0,grow");
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		panel_OleoMotor.add(lblQuantidade, "cell 2 0,alignx center,growy");
		
		JLabel lblValoraPagar = new JLabel("Valor a Pagar");
		panel_OleoMotor.add(lblValoraPagar, "cell 3 0,alignx center,growy");
		
		JLabel lblTotaldeOleo = new JLabel("Total de Óleo");
		panel_OleoMotor.add(lblTotaldeOleo, "cell 4 0,alignx center,growy");
		
		JLabel label_2 = new JLabel("");
		panel_OleoMotor.add(label_2, "cell 0 1,grow");
		
		JLabel lblValoraPagar500mL = new JLabel("-");
		lblValoraPagar500mL.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_OleoMotor.add(lblValoraPagar500mL, "cell 3 1,alignx center,growy");
		
		JLabel lblTotaldoOleo = new JLabel("-");
		panel_OleoMotor.add(lblTotaldoOleo, "cell 4 1,alignx center,growy");
		
		JLabel label_3 = new JLabel("");
		panel_OleoMotor.add(label_3, "cell 0 2,grow");
		
		JLabel lblFrascode500mL = new JLabel("Frasco de 500mL");
		panel_OleoMotor.add(lblFrascode500mL, "cell 1 2,grow");
		
		textField_1 = new JTextField();
		panel_OleoMotor.add(textField_1, "cell 2 2,alignx left,growy");
		textField_1.setColumns(10);
		
		JLabel lblValoraPagar1Litro = new JLabel("-");
		panel_OleoMotor.add(lblValoraPagar1Litro, "cell 3 2,alignx center,growy");
		
		JLabel label_4 = new JLabel("");
		panel_OleoMotor.add(label_4, "cell 4 2,grow");
		
		JLabel label_5 = new JLabel("");
		panel_OleoMotor.add(label_5, "cell 0 3,grow");
		
		JLabel lblFrascode1L = new JLabel("Frasco de 1 Litro");
		panel_OleoMotor.add(lblFrascode1L, "flowx,cell 1 3,grow");
		
		JLabel label_6 = new JLabel("");
		panel_OleoMotor.add(label_6, "cell 1 3,grow");
		
		textField_2 = new JTextField();
		panel_OleoMotor.add(textField_2, "flowx,cell 2 3,grow");
		textField_2.setColumns(10);
		
		JLabel label_7 = new JLabel("");
		panel_OleoMotor.add(label_7, "cell 2 3,grow");
		
		JLabel label_8 = new JLabel("");
		panel_OleoMotor.add(label_8, "cell 3 3,grow");
		
		JLabel label_9 = new JLabel("");
		panel_OleoMotor.add(label_9, "cell 4 3,grow");
		
		JLabel label_10 = new JLabel("");
		panel_OleoMotor.add(label_10, "cell 0 4,grow");
		contentPane.setLayout(new MigLayout("", "[127px][74px][69px][][][][][][][][][][10px][][22px][83px][165px]", "[129px][129px][129px][114px][21px][]"));
		contentPane.add(panel_TabelaPreco_combustivel, "cell 0 0 6 1,grow");
		contentPane.add(panel_TabelaPreco_OleoMotor, "cell 8 0 9 1,growx,aligny top");
		contentPane.add(panel_OleoMotor, "cell 0 1 17 1,grow");
		contentPane.add(panel_Abastecimento, "cell 0 2 6 1,grow");
		panel_Abastecimento.setLayout(new MigLayout("", "[96px][98px]", "[21px][19px][19px]"));
		
		JLabel lblCombustivel = new JLabel("Combustivel");
		panel_Abastecimento.add(lblCombustivel, "cell 0 0,alignx right,aligny center");
		
		JComboBox comboBox = new JComboBox();
		panel_Abastecimento.add(comboBox, "cell 1 0,growx,aligny top");
		
		JLabel lblQuantidadeLitros = new JLabel("Quantidade de litros");
		panel_Abastecimento.add(lblQuantidadeLitros, "cell 0 1,alignx right,aligny center");
		
		textField_4 = new JTextField();
		panel_Abastecimento.add(textField_4, "cell 1 1,alignx left,aligny top");
		textField_4.setColumns(10);
		
		JLabel lblTotalCombustivelAbtm = new JLabel("Total de Combustivel");
		panel_Abastecimento.add(lblTotalCombustivelAbtm, "cell 0 2,alignx left,aligny center");
		
		JLabel lblTotalCombustivel = new JLabel("-");
		panel_Abastecimento.add(lblTotalCombustivel, "cell 1 2,alignx center");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1, "cell 8 2 9 1,grow");
		panel_1.setLayout(new MigLayout("", "[103px][][][][][][grow]", "[21px][21px][][]"));
		
		JRadioButton rdbtnAVista = new JRadioButton(" À vista");
		buttonGroup.add(rdbtnAVista);
		panel_1.add(rdbtnAVista, "cell 0 0,alignx left,aligny top");
		
		JRadioButton rdbtnAPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnAPrazo);
		panel_1.add(rdbtnAPrazo, "cell 0 1,alignx left,aligny top");
		
		JLabel lblDias = new JLabel("Dias:");
		panel_1.add(lblDias, "cell 2 1");
		
		textField_3 = new JTextField();
		panel_1.add(textField_3, "cell 3 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar:");
		panel_1.add(lblTotalAPagar, "cell 0 3");
		
		JLabel lblTotalaPagar = new JLabel("-");
		panel_1.add(lblTotalaPagar, "cell 3 3,alignx center");
		
		JButton btnCalcular = new JButton("Calcular ");
		contentPane.add(btnCalcular, "cell 0 3,alignx right,aligny bottom");
		
		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNovoCalculo, "cell 6 3,growx,aligny bottom");
		
		JButton btnFechar = new JButton("Fechar");
		contentPane.add(btnFechar, "cell 16 3,alignx left,aligny bottom");
	}
}
