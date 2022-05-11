package vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pais {

	private String nombre;
	private static ArrayList<Pais> paises1 = new ArrayList<Pais>();
	private int cantidadVentas = 0;

	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.paises1.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public static Pais paisMasVendedor() {
		return Fabricante.CantiVen();
	}

}