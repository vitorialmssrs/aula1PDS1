package model;

public class calcPagamento {
	
	//Para pagamento à prazo (até 30 dias) o valor não sofre nenhuma alteração.
	//iii. Para pagamento à prazo acima de 30 dias, o valor sofre um aumento de 10%
	//sob o valor total à pagar (combustível e óleo).
	
	public float pagamentoVista(float quantOleo, float quantGasolina, int quantDia) {
		
	//criar metodos para defina os atributos, oleo disel quant frasco oleo tipo combustivel 
	//depois cria metodo para cada valor, e faz os calculos 
		
		
		//achar 10%
		float resultado = (quantOleo + quantGasolina) * 0.10f;
		//depois de achar o 10% resolve a conta menos os 10%
		float res = (quantOleo + quantGasolina) - resultado;
	
	
	   return res;
}
	
	public float pagamentoPrazo(float quantOleo, float quantGasolina, int quantDia) {
			
		float res = (quantOleo + quantGasolina);
		
		 return res;
	

}
}