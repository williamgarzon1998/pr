
public class Clase_11 {

	public static void main(String[] args) {
		
		String nombre="William";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
	    System.out.println("La primera letra de mi nombre es " + nombre + " es la " + nombre.charAt(0));
	    int ultima_letra;
	    ultima_letra=nombre.length();
	    System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
	}
}
