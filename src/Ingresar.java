import java.util.Scanner;

public class Ingresar {
    public void ingresar(){
        Operaciones operaciones=new Operaciones();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa la palabra que desees");
        String palabra=scanner.nextLine();
        System.out.println("Ingresa una letra");
        char letra = scanner.next().charAt(0);
        operaciones.string(palabra);
        operaciones.palabrasEncontradas(palabra,letra);
        String palabraNueva = operaciones.alreves(palabra);
        System.out.println("La palabra invertida es:");
        System.out.println(palabraNueva);
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
        operaciones.extraer(palabra);
    }
}
