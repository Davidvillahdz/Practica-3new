/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;

/**
 *
 * @author HP
 */
public interface IControlador {

    public int MAX_OBJECTS = 10;

    public abstract void create(Persona obj); //C
 
    public abstract Persona read(Persona obj); //R

    public abstract void update(Persona obj); //U

    public abstract void delete(Persona obj); //D

    public abstract void list();
}
