
public class Pessoa {
	
	private String nome;
	private int cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void atualizarDadosPessoa (Pessoa pessoa) {
		
		int linhaSelecionada = table.getSelectedRow();
		listaPessoas.set(linhaSelecionada, pessoa); //atualizar dados das pessoas 
		atualizarJtableModle();
	}

}
