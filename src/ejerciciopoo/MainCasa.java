package ejerciciopoo;

import java.util.ArrayList;

public class MainCasa {
	public static void main(String[] args) {
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		Direccion direccion = new Direccion();

		direccion.setTipoVia("Calle");
		direccion.setNombreVia("Serrano");
		direccion.setNumero("378");
		direccion.setCp("28001");
		direccion.setCiudad("Madrid");
		
		Habitacion salon = new Habitacion();
		salon.setTipoHabitacion("Salón");
		salon.setM2(50);
		
		Habitacion cocina = new Habitacion();		 
		cocina.setTipoHabitacion("Cocina");
		cocina.setM2(20);
		
		listaHabitaciones.add(cocina);
		listaHabitaciones.add(salon);
		
		Persona duenio = new Persona();
		duenio.setNombre("Manuel López");
		
		Casa chalet = new Casa(); 
		chalet.setHabitacion(listaHabitaciones);
		chalet.setDireccion(direccion);
		chalet.setDuenio(duenio);
		chalet.setPrecio(3000000);
		System.out.println(chalet);
	}
}
