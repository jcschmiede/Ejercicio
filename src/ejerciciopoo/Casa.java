package ejerciciopoo;

import java.util.ArrayList;

public class Casa {

	private double precio;
	private Direccion direccion; 
	private ArrayList<Habitacion> habitacion; 
	private Persona duenio;
	
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Habitacion> getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(ArrayList<Habitacion> habitacion) {
		this.habitacion = habitacion;
	}
	public Persona getDuenio() {
		return duenio;
	}
	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", direccion=" + direccion + ", habitacion=" + habitacion + ", duenio="
				+ duenio + "]";
	} 
	
	
	
}
