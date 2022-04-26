import java.io.File;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Direccion");
        String di = sc.next();
        File ruta = new File(di);
        String[] list = ruta.list();
        for (int i = 0; i < list.length; i++) {
            File  a= new File(ruta, list[i]);
            if (a.isDirectory()) {
                System.out.println("Directorio: " + list[i]);
            }else{
                System.out.println("fichero: " +list[i]);
            }
        }
    }
}
