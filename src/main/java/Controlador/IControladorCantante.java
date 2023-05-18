/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

import Modelo.Cantante;
import Modelo.Persona;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IControladorCantante {
    public void create(Cantante cantante);
    public Cantante read(int codigo);
    public void update(Cantante cantante);
    public void delete(Cantante cantante);   
    public List<Cantante> findAll();
}
