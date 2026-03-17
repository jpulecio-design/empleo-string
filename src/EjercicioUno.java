public class EjercicioUno {
    public static void ejecutar() {

        System.out.println("EJERCICIO UNO");

        String cadenauno = "Chaqueta M65";
        String cadenados = "Xbox360";

        // Imprimir cadenas
        System.out.println("Cadena 1: " + cadenauno);
        System.out.println("Cadena 2: " + cadenados);

        // Caracter en posición 6 de cadenauno
        System.out.println("Caracter posicion 6: " + cadenauno.charAt(6));

        // Longitudes
        System.out.println("Longitud cadena : " + cadenauno.length());
        System.out.println("Longitud cadena 2: " + cadenados.length());

        // Primera ocurrencia de e en cadenauno
        System.out.println("Primera 'e' en cadena 1: " + cadenauno.indexOf('e'));

        // Ultima ocurrencia de e en cadenados
        System.out.println("Ultima 'e' en cadena 2: " + cadenados.lastIndexOf('e'));

        // Mayusculas y minusculas
        System.out.println("cadena 1 mayusculas: " + cadenauno.toUpperCase());
        System.out.println("cadena 2 minusculas: " + cadenados.toLowerCase());

        // Comparar contenido exacto
        System.out.println("equals: " + cadenauno.equals(cadenados));

        // Comparar ignorando mayúsculas
        System.out.println("equalsIgnoreCase: " + cadenauno.equalsIgnoreCase(cadenados));

        // Concatenar
        System.out.println("Concatenada: " + cadenauno.concat(" | ").concat(cadenados));

        // Contiene subcadena?
        System.out.println("cadena 1 contiene 'ena': " + cadenauno.contains("ena"));

        // Subcadena [0, 6)
        System.out.println("Subcadena [0,6]: " + cadenauno.substring(0, 6));

        // Reemplazar a por i
        System.out.println("Remplace a por i en cadena 1: " + cadenauno.replace('a', 'i'));
    }
}
