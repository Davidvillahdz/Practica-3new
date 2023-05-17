
package Vista;

import Modelo.Disco;
import java.util.Scanner;

public class VistaDisco {
    private Scanner entrada;

    public VistaDisco() {
        entrada = new Scanner(System.in);
    }
    
    public Disco mostrarDisco() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos del disco");
        int codigo = entrada.nextInt();
        int anioDeLanzamiento = entrada.nextInt();
        String nombreDisco = entrada.next();
        return new Disco( codigo, nombreDisco, anioDeLanzamiento);
    }

    public Disco actualizarDisco() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del disco a actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingresa el anioDeLanzamiento del disco a actualizar");
        int anioDeLanzamiento = entrada.nextInt();
        System.out.println("Ingrese los nuevos Datos (nombreDisco)");
        String nombreDisco1 = entrada.next();
        double tiempoEnMinutos = entrada.nextDouble();
        return new Disco(codigo, nombreDisco1,anioDeLanzamiento);
    }

    public  Disco eliminarDisco() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del disco a eliminar");
        int codigo = entrada.nextInt();
        return new Disco(codigo, null,codigo);
    }

    public int buscarDisco() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo de la cancion a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    public void imDisco(){
        Disco c = new Disco();
        c.toString();
    }
}
