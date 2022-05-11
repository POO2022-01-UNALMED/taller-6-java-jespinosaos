package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int CantidadVehiculos;
	protected static ArrayList<Fabricante> fabricantes = new ArrayList<>();

	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		Vehiculo.CantidadVehiculos = Vehiculo.CantidadVehiculos + 1;
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.fabricantes.add(fabricante);

	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int CantidadVehiculos) {
		Vehiculo.CantidadVehiculos = CantidadVehiculos;
	}

	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\nCamionetas: "
				+ Camioneta.getCantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();

	}

	public static Fabricante CantiFa() {
		int c = 0;

		Fabricante fa = new Fabricante("a", new Pais("Polombia"));

		for (int i = 0; i < fabricantes.size(); i++) {
			Fabricante f = fabricantes.get(i);
			int c1 = 0;
			for (int j = 0; j < fabricantes.size(); j++) {
				Fabricante f2 = fabricantes.get(j);
				if (f2.getNombre().equals(f.getNombre())) {

					c1++;

				}
			}
			if (c1 > c) {
				c = c1;
				fa = f;
			}

		}
		return fa;
	}

}