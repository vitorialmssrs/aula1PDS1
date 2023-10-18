package model;

public class RetanguloEx3 {
	
	//caso de erro ao salvar da um ctrl c no conteudo fecha a aba salva e abre de novo copia e salva que funciona. 
	//não pode ficar todo cinza
	//calculo para calcular o perimetro e area
	//variavel no final do codigo que ira ser armazanada o valor 
	//metodos para realizar os calculos, cada metodo precisa de um metodo

		public float calculoArea (float base, float altura) {
 		float calculandoArea = (base * altura);
 		return calculandoArea;
 		
 	}
 	
 	public float calculoPerimetro (float base, float altura) {
 		float calculandoPerimetro = (2 * (altura + base));
 		return calculandoPerimetro;

 	}
}