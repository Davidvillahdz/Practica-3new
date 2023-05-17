
package Vista;

import Modelo.Cancion;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VistaCancion {
    private Scanner entrada;

    public VistaCancion() {
        entrada = new Scanner(System.in);
    }
    
    public Cancion mostrarTitulo() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos de la cancion");
        int codigo = entrada.nextInt();
        String titulo = entrada.next();
        String letra = entrada.next();
        double tiempoEnMinutos = entrada.nextDouble();
        return new Cancion( codigo, titulo, letra, tiempoEnMinutos );
    }

    public Cancion actualizarCancion() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo de la direccion a actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos Datos (cancion1, cancion2, tiempoEnminutos)");
        String cancion1 = entrada.next();
        String cancion2 = entrada.next();
        double tiempoEnMinutos = entrada.nextDouble();
        return new Cancion(codigo, cancion1, cancion2, tiempoEnMinutos);
    }

    public Cancion eliminarDireccion() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo de la cancion a eliminar");
        int codigo = entrada.nextInt();
        return new Cancion(codigo, null, null, 0.0);
    }

    public int buscarCancion() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo de la cancion a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public void imCancion(){
        Cancion c = new Cancion();
        c.toString();
    }
    
}
