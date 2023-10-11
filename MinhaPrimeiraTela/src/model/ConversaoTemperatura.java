package model;

public class ConversaoTemperatura {
	
	//metodoconverter float para celso (ftoc)
	// f no final dos numeros para indicar que o numero são float 
	
	public float converterFtoC (float temF) {
	
	float tempConvertida  = (temF - 32f)*5f/9f;
	return tempConvertida;
}
}
