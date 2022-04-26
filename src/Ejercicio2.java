import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Direccion");
        String di = sc.next();
        File ruta = new File(di);
        String[] list = ruta.list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
