package modelo;

public class Componentes extends Hardware{
	
	private int voltaje;
	private int potencia;
	
	
	public Componentes(String modelo, int precio, String fechaSalida, String marca, int stock, String fabricante, int voltaje, int potencia){
		super(modelo, precio, fechaSalida, marca, stock, fabricante);
		this.voltaje=voltaje;
		this.potencia=potencia;
	}

}
