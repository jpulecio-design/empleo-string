import java.util.Scanner;

public class EjercicioDos {

    public static void ejecutar() {

        System.out.println("\n EJERCICIO DOS");

        // Comparacion de objetos
        String palabrita = "El lenguaje Python";
        String palabrota = new String("El lenguaje Ensamblador");

        System.out.println("palabrita: " + palabrita);
        System.out.println("palabrota: " + palabrota);

        //  compara referencias
        if (palabrita == palabrota) {
            System.out.println(" son el MISMO objeto");
        } else {
            System.out.println(" son objetos DISTINTOS");
        }

        // equals compara contenido
        System.out.println("equals: " + palabrita.equals(palabrota));

        // Igualar referencias con intern()
        palabrota = palabrota.intern();
        System.out.println("Despues de intern() : " + (palabrita == palabrota));

        // Invertir palabra
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresa una palabra: ");
        String palabra = sc.nextLine();
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        System.out.println("Original : " + palabra);
        System.out.println("Invertida: " + palabraInvertida);

        // Frase sin espacios invertida 
        System.out.print("\nIngresa una frase: ");
        String frase = sc.nextLine();
        String sinEspacios = frase.replace(" ", "");
        String fraseInvertida = new StringBuilder(sinEspacios).reverse().toString();
        System.out.println("Sin espacios : " + sinEspacios);
        System.out.println("Invertida    : " + fraseInvertida);

        // Contar vocales
        System.out.print("\nIngresa una frase para contar vocales: ");
        String fraseVocales = sc.nextLine().toLowerCase();
        int conteo = 0;
        for (int i = 0; i < fraseVocales.length(); i++) {
            char c = fraseVocales.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                conteo++;
            }
        }
        System.out.println("Numero de vocales: " + conteo);

        sc.close();
    }
}