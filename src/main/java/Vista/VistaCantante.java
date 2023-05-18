
package Vista;


import Modelo.Cantante;
import Modelo.Disco;
import java.util.Scanner;

public class VistaCantante {

    public static int readId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Scanner entrada;

    public VistaCantante() {
        entrada = new Scanner(System.in);
    }
    
    public Disco mostrarTitulo() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa los datos de la disco");
        int codigo = entrada.nextInt();
        String nombredisco = entrada.next();
        int anioDeLanzamiento = entrada.nextInt();
        return new Disco( codigo, nombredisco, anioDeLanzamiento );
    }

    public Disco actualizardisco() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo de la direccion a actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos Datos ");
        String nombredisco = entrada.next();
        int anioDeLanzamiento = entrada.nextInt();
        return new Disco( codigo, nombredisco, anioDeLanzamiento );
    }

    public Disco eliminarDisco() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del disco a eliminar");
        int codigo = entrada.nextInt();
        return new Disco(codigo, null, codigo);
    }

    public int buscarDisco() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo de la cancion a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public void imDisco(){
        Disco d = new Disco();
        d.toString();
    }

    public Cantante ingresarCantante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int buscarCantante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void verCantante(Cantante cantante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Cantante actualizarCantante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Cantante eliminarCantante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void imCantante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void idCantante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
