package modelo;

public class Hardware {

	private String modelo;
	private int precio;
	private String fechaSalida;
	private String marca;
	private int stock;
	private String fabricante;
	
	public Hardware(String modelo, int precio, String fechaSalida, String marca, int stock, String fabricante){
		this.modelo = modelo;
		this.precio = precio;
		this.fechaSalida = fechaSalida;
		this.marca = marca;
		this.stock = stock;
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
