import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Direccion");
        String di = sc.next();
        System.out.println("Fichero");
        String fi = sc.next();
        File ruta = new File(di);
        File f = new File(ruta, fi);

        System.out.println("\n");

        if (ruta.exists()) {
            System.out.println("el direcctorio existe");
            fichero(ruta);
        } else {
            System.out.println("no existe el directorio");
        }
        if (f.exists()) {
            System.out.println("el fichero existe");
            fichero(f);
        } else {
            System.out.println("el fichero no existe");
        }
    }

    private static void fichero(File f) {
        if (f.isDirectory()) {
            System.out.println("Es un directorio");
        } else {
            System.out.println("no es un directorio");
        }
        if (f.canWrite()) {
            System.out.println("Es de escritura");
        } else {
            System.out.println("no es de escritura");
        }
        if (f.canRead()) {
            System.out.println("Es de lectura");
        } else {
            System.out.println("no es de lectura");

        }
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.length());
        System.out.println("\n");
    }
}
