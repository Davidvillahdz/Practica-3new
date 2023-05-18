/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import Controlador.IControladorCantante;
import Modelo.Cantante;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CantanteDAO implements IControladorCantante {

    public static void update(Persona cantante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Atributos
    private List<Cantante> listaCantante;

    public CantanteDAO() {
        listaCantante = new ArrayList<>();
    }

    @Override
    public void create(Cantante cantante) {
        listaCantante.add(cantante);
    }

    @Override
    public Cantante read(int codigo) {
        for (Cantante cantante : listaCantante) {
            if (cantante.getCodigo() == codigo) {
                return cantante;
            }
        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {
        for (int i = 0; i < listaCantante.size(); i++) {
            Cantante c = listaCantante.get(i);
            if (c.getCodigo() == cantante.getCodigo()) {
                listaCantante.set(i, cantante);
                break;
            }
        }

    }

    @Override
    public void delete(Cantante cantante) {
        Iterator<Cantante> it = listaCantante.iterator();
        while (it.hasNext()) {
            Cantante d = it.next();
            if (d.getCodigo() == cantante.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cantante> findAll() {
        return listaCantante;
    }
}
