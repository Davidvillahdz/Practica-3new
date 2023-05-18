
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Compositor extends Persona{
    private int numeroDeComposiciones;
    private List<Cancion>cancionesTop100billboard;
    private List<Cantante>Clientes;

    public Compositor() {
        this.cancionesTop100billboard = new ArrayList<>();
        this.Clientes = new ArrayList<>();
    }
    public Compositor(int numeroDeComposiciones, List<Cancion> cancioesTop100Billboard, List<Cantante> clientes, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100billboard = new ArrayList<>();
        this.Clientes = new ArrayList<>();
    }

    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100billboard = new ArrayList<>();
        this.Clientes = new ArrayList<>();
    }
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.cancionesTop100billboard);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        return Objects.equals(this.cancionesTop100billboard, other.cancionesTop100billboard);
    }

    //Metodos
    @Override
    public double calcularSalario() {
        if (numeroDeComposiciones > 5) {
            double salarioFinal = super.getSalario() + 300;
            return salarioFinal;
        } else if (cancionesTop100billboard.size() > 0 && cancionesTop100billboard.size() < 4) {
            double porcentaje = super.getSalario() * 0.1;
            double salarioFinal = super.getSalario() + porcentaje;
            return salarioFinal;

        } else if (cancionesTop100billboard.size() > 3 && cancionesTop100billboard.size() < 7) {
            double porcentaje = super.getSalario() * 0.2;
            double salarioFinal = super.getSalario() + porcentaje;
            return salarioFinal;
        } else if (cancionesTop100billboard.size() > 6) {
            double porcentaje = super.getSalario() * 0.2;
            double salarioFinal = super.getSalario() + porcentaje;
            return salarioFinal;
        } else {
            return super.getSalario();

        }
    }

    public void agregarCancion(Cancion cancion) {
        cancionesTop100billboard.add(cancion);

    }

    public void agregarCliente(Cantante cantante) {
        Clientes.add(cantante);
    }

    public List<Cancion> buscarNombreDeCancion(String titulo) {
        return cancionesTop100billboard.stream().filter(e -> e.getTitulo().startsWith(titulo)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Compositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100billboard=" + cancionesTop100billboard + ", Clientes=" + Clientes + '}';
    }
    
}
