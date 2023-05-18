/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

import Modelo.Compositor;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IControladorCompositor {
    public void create(Compositor compositor);
    public Compositor read(int numeroDeComposiciones);
    public void update(Compositor compositor);
    public void delete(Compositor compositor);   
    public List<Compositor> findAll();
}
