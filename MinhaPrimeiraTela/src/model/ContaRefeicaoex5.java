package model;

public class ContaRefeicaoex5 {
	//multiplicar as gramas em questão pelo preço praticado por quilograma, e dividir tudo por mil.
	//conta para calcular o valor final do prato 
	
	public float ContaRefeicao ( float valorQuilo, float pesoPrato) {
		
		float conta = (pesoPrato * valorQuilo)/1000;
		
		return conta;
	}
}
