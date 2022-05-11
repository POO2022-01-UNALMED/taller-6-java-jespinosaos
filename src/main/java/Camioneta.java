package vehiculos;

public class Camioneta extends Vehiculo{
  
  private boolean volco;
	private static int cantidadCamionetas;

  public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco=volco;
		Camioneta.cantidadCamionetas += 1;

  }

  public static int getCantidadCamionetas(){
    return Camioneta.cantidadCamionetas;
    }

  public boolean isVolco(){
    return volco;
    }

}