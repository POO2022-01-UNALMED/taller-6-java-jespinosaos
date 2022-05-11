package vehiculos;

import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private Pais pais;
	protected static ArrayList<Pais> paises = new ArrayList<>();

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.paises.add(pais);
	}

	public static Pais CantiVen() {
		int c = 0;

		Pais fa = new Pais("Polombia");

		for (int i = 0; i < paises.size(); i++) {
			Pais f = paises.get(i);
			int c1 = 0;
			for (int j = 0; j < paises.size(); j++) {
				Pais f2 = paises.get(j);
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

	public static Fabricante fabricaMayorVentas() {
		return Vehiculo.CantiFa();
	}

	public String getNombre() {
		return nombre;
	}

	public Pais getPais() {
		return pais;

	}

}