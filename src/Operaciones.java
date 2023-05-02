import java.util.Scanner;

public class Operaciones {
    public void string(String palabra){
        int mayuscula = 0;
        int minuscula = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (Character.isUpperCase(letra)) {
                mayuscula++;
            } else if (Character.isLowerCase(letra)) {
                minuscula++;
            }
        }
        System.out.println("En la palabra '" + palabra + "' hay :");
        System.out.println( mayuscula + " mayúsculas  ");
        System.out.println( minuscula + " minúsculas.");
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
    }
    public void palabrasEncontradas(String palabra, char letra){
        int cantidadLetras = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter == letra || caracter == Character.toUpperCase(letra) || caracter == Character.toLowerCase(letra)) {
                cantidadLetras++;
            }
        }
        System.out.println("La letra " + letra );
        System.out.println(" aparece " +cantidadLetras );
        System.out.println(" En la palabra " + palabra );
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
    }
    public String alreves(String palabra){
        String resultado = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado += palabra.charAt(i);
        }
        return resultado;
    }
    public void extraer(String palabra){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el numero de inicio");
        int inicio=scanner.nextInt();
        System.out.println("Ingresa el numero de fin");
        int fin=scanner.nextInt();

        String letra= palabra.substring(inicio,fin);
        System.out.println(palabra);
        System.out.println(letra);
    }
}
