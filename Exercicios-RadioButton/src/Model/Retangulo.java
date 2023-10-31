package Model;

public class Retangulo {
	
	//serve para calcular o valor do perimetro e o valor da área 
	
	public float perimetroTotal (float altura, float base) {
		
		//forma de fazer a conta: declara o tipo da variavel coloca o nome dela, faz ela receber o valor dos calculos
		float resultadoPerimetro = 2 * (altura + base);
		
		return resultadoPerimetro;
	}
	 
	public float areaTotal (float baseA, float alturaA) {
		
		float resultadoArea = baseA * alturaA;
		return resultadoArea;
		
	}
	
	// Contas para fazer o código 
	//Perímetro: 2 * (altura + base)

	//- Área: base * altura

}
