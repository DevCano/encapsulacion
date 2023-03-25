package devnaz.encapsulacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Ejercicio de encapsulación:
// Crear clase Persona.
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
// Crear un objeto persona en el main.
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
@SpringBootApplication
public class EncapsulacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncapsulacionApplication.class, args);
		Persona persona = new Persona();
		persona.setEdad(22);
		int edad = persona.getEdad();

		persona.setNombre("Jesus Mercado");
		String nombre = persona.getNombre();

		persona.setTelefono("4521313146");
		String telefono = persona.getTelefono();

		System.out.println(edad);
		System.out.println(nombre);
		System.out.println(telefono);


	}

	static class Persona {
		private int edad;
		private String nombre;
		private String telefono;

		public void setEdad(int valor){
			this.edad = valor;
		}
		public void setNombre(String valor){
			this.nombre = valor;
		}
		public void setTelefono(String valor){
			this.telefono = valor;
		}

		public int getEdad() {
			return this.edad;
		}

		public String getNombre() {
			return this.nombre;
		}

		public String getTelefono() {
			return this.telefono;
		}
	}

}
