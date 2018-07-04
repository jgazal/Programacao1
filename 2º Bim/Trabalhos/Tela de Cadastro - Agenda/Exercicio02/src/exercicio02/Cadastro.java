package exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Cadastro extends JPanel {
	JLabel l_nome, l_logradouro, l_endereco, l_complemento, l_cidade, l_estado, l_telefone;
	JTextField tf_nome, tf_endereco, tf_complemento, tf_cidade, tf_estado, tf_telefone;
	JButton b_confirmar, b_cancelar;
	JComboBox<String> cb_estado;
	
	String[] Estado = { 
			"ESTADO", "AC - ACRE", "AL - ALAGOAS", "AM - AMAZONAS", "AP - AMAPÁ", 
			"BA - BAHIA", "CE - CEARÁ", "DF - DISTRITO FEDERAL","ES - ESPIRITO SANTO", 
			"GO - GOIÁS", "MA - MARANHÃO", "MT - MATO GROSSO", "MS - MATO GROSSO DO SUL", 
			"MG - MINAS GERAIS", "PA - PARÁ", "PB - PARAÍBA", "PR - PARANÁ", "PE - PERNAMBUCO", 
			"PI - PIAUÍ", "RJ - RIO DE JANEIRO", "RN - RIO GRANDE DO NORTE", "RO - RONDÔNIA", 
			"RS - RIO GRANDE DO SUL", "RR - RORAIMA", "SC - SANTA CATARINA", "SE - SERGIPE", 
			"SP - SÃO PAULO", "TO - TOCANTINS" 		
	};
	
	public Cadastro() {
		setLayout(null);
		
		//Rótulos
		l_nome = new JLabel("Nome:");
		l_nome.setBounds(10, 10, 50, 10);
		
		l_logradouro = new JLabel("Logradouro");
		l_logradouro.setBounds(10, 40, 100, 15);

		l_endereco = new JLabel("Endereço:");
		l_endereco.setBounds(10, 65, 105, 15);
		
		l_complemento = new JLabel("Complemento:");
		l_complemento.setBounds(10, 85, 105, 15);
		
		l_cidade = new JLabel("Cidade:");
		l_cidade.setBounds(10, 105, 100, 15);
		
		l_telefone = new JLabel("Telefone:");
		l_telefone.setBounds(10, 145, 100, 15);
		
		//Campos de texto
		tf_nome = new JTextField(10);
		tf_nome.setBounds(65, 5, 368, 20);

		tf_endereco = new JTextField(40);
		tf_endereco.setBounds(115, 65, 320, 20);
		
		tf_complemento = new JTextField(40);
		tf_complemento.setBounds(115, 85, 320, 20);
		
		tf_cidade = new JTextField(40);
		tf_cidade.setBounds(115, 105, 320, 20);

		//Botões
		b_confirmar = new JButton("Confirmar");
		b_confirmar.setBounds(130, 180, 105, 30);

		b_cancelar = new JButton("Cancelar");
		b_cancelar.setBounds(228, 180, 105, 30);
		
		//Formata o campo de texto Telefone
		MaskFormatter m_telefone = null;
		try {
			m_telefone = new MaskFormatter("(##)#####-####");
            m_telefone.setPlaceholderCharacter('_');    
		} catch(ParseException e) {
			System.err.println("Erro na formatação: " + e.getMessage());
			System.exit(1);	
		}
		JFormattedTextField ftf_telefone = new JFormattedTextField(m_telefone); 
		ftf_telefone.setBounds(115, 145, 320, 20);
		
		//ComboBox Estados
		cb_estado = new JComboBox<String>(Estado);
		cb_estado.setBounds(115, 125, 320, 20);
		l_estado = new JLabel("Estado");
		cb_estado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = (String)cb_estado.getSelectedItem();
			}
		});

		//Adiciona os rótulos
		add(l_nome);
		add(l_logradouro);
		add(l_endereco);
		add(l_complemento);
		add(l_cidade);
		add(l_estado);
		add(l_telefone);

		//Adiciona os campos de texto
		add(tf_nome);
		add(tf_endereco);
		add(tf_complemento);
		add(tf_cidade);
		add(cb_estado);
		add(ftf_telefone); //Campo de texto Telefone formatado

		//Adiciona os botões
		add(b_confirmar);
		add(b_cancelar);
		
		//Ação do botão Confimar
		b_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(tf_nome.getText());
				pessoa.setEndereco(tf_endereco.getText());
				pessoa.setComplemento(tf_complemento.getText());
				pessoa.setCidade(tf_cidade.getText());
				//pessoa.setEstado(tf_estado.getText());
				pessoa.setEstado((String) cb_estado.getSelectedItem());
				//pessoa.setEstado(tf_telefone.getText());
				pessoa.setTelefone(ftf_telefone.getText());
					
				GravaArquivo.GravarArquivo(pessoa);
							
				if(e.getSource() == b_confirmar) {
					JOptionPane.showMessageDialog(null, "Informações salvas no arquivo.");
				}
			}
		});
		
		//Ação do botão Cancelar
		b_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_nome.setText("");
				tf_endereco.setText("");
				tf_complemento.setText("");
				tf_cidade.setText("");
				cb_estado.setSelectedItem("ESTADO");
				ftf_telefone.setText("");
				
				if(e.getSource() == b_cancelar) {
					JOptionPane.showMessageDialog(null, "O conteúdo dos campos foi limpo.");
				}
			}
		}); 
	}
}

