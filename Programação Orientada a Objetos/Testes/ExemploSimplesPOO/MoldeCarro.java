public class MoldeCarro{

	String modelo;
	String marca;
	double anoDeLancamento;

	void PrintInfo(){
	
		System.out.println("Modelo do carro: "+ modelo);
		System.out.println("Marca: "+ marca);
		System.out.println("Ano de lançamento: "+ anoDeLancamento);

	}

	void Fazervrumvrum(){

		System.out.println("vrummmmmmmmmmm, vruummmmmmmmmmm, vrummmmmmmm");

	}

	public MoldeCarro (String modelo, String marca, double anoDeLancamento) {

		this.modelo = modelo;
		this.marca = marca;
		this.anoDeLancamento = anoDeLancamento;

	}

}
