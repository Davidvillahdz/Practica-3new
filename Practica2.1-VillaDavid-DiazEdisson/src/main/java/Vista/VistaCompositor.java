
package Vista;

import Modelo.Compositor;
import java.util.List;
import java.util.Scanner;


public class VistaCompositor {
    private Scanner entrada;

    public VistaCompositor() {
        this.entrada = new Scanner(System.in);
    }

    public Compositor ingresarCompositor() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del compositor: ");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el nombre del compositor: ");
        String nombre = entrada.next();

        System.out.println("Ingrese el apellido del compositor: ");
        String apellido = entrada.next();

        System.out.println("Ingrese la edad del compositor: ");
        int edad = entrada.nextInt();

        System.out.println("Ingrese la nacionalidad del compositor: ");
        String nacionalidad = entrada.next();

        System.out.println("Ingrese el salario del compositor: ");
        double salario = entrada.nextDouble();

        System.out.println("Ingrese el numero de composiciones del compositor");
        int numeroDeComposiciones = entrada.nextInt();

        return new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);

    }
    public void imCompositor(){
        Compositor c = new Compositor();
        c.toString();
    }
    public Compositor actualizarCompositor() {
        entrada = new Scanner(System.in);

        System.out.println("Ingresa el codigo del compositor a actualizar");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el nombre del compositor: ");
        String nombre = entrada.next();

        System.out.println("Ingrese el apellido del compositor: ");
        String apellido = entrada.next();

        System.out.println("Ingrese la edad del compositor: ");
        int edad = entrada.nextInt();

        System.out.println("Ingrese la nacionalidad del compositor: ");
        String nacionalidad = entrada.next();

        System.out.println("Ingrese el salario del compositor: ");
        double salario = entrada.nextDouble();

        System.out.println("Ingresa el numero de composicionesdel compositor: ");
        int numeroDeComposiciones = entrada.nextInt();

        return new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);
    }
    public Compositor eliminarCompositor() {
        entrada = new Scanner(System.in);

        System.out.println("Ingresa el codigo del compositor a eliminar");
        int codigo = entrada.nextInt();
        return new Compositor(0, codigo, null, null, 0, null, 0);
    }

    public int buscarCompositor() {
        entrada = new Scanner(System.in);
        System.out.println("Ingresa el codigo del compositor a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }

    public void verCompositor(Compositor compositor) {
        System.out.println("Datos del compositor: " + compositor);
    }

    public void verCompositores(List<Compositor> compositores) {
        for (Compositor compositor : compositores) {
            System.out.println("Datos del compositor: " + compositor);
        }
    }
}
