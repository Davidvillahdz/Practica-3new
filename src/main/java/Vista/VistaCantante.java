
package Vista;


import Modelo.Cantante;
import java.util.Scanner;

public class VistaCantante {
    private Scanner entrada;

    public VistaCantante() {
        this.entrada = new Scanner(System.in);
    }

    public Cantante ingresarCantante() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del cantante: ");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = entrada.next();

        System.out.println("Ingrese el apellido del cantante: ");
        String apellido = entrada.next();

        System.out.println("Ingrese la edad del cantante: ");
        int edad = entrada.nextInt();

        System.out.println("Ingrese la nacionalidad del cantante: ");
        String nacionalidad = entrada.next();

        System.out.println("Ingrese el salario del cantante: ");
        double salario = entrada.nextDouble();

        System.out.println("Ingresa el nombre artistico del cantante: ");
        String nombreArtistico = entrada.next();

        System.out.println("Ingrese el genero muscial del cantante: ");
        String generoMusical = entrada.next();

        System.out.println("Ingrese l numero de sencillos del cantante: ");
        int numeroDeSencillos = entrada.nextInt();

        System.out.println("Ingrese el numero de conciertos del cantante: ");
        int numeroDeConciertos = entrada.nextInt();

        System.out.println("Ingres el numero de giras del cantante: ");
        int numeroDeGiras = entrada.nextInt();

        System.out.println("Ingrese la discografia del cantante: ");

        return new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);

    }
   public void imCantante(){
        Cantante c = new Cantante();
        c.toString();
    }
}
