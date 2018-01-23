/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Dalia
 */
public class Persona {
    private Integer numIdent;
    private String nombres;
    private String apellido;

    public Persona() {
    }

    public Persona(Integer numIdent, String nombres, String apellido) {
        this.numIdent = numIdent;
        this.nombres = nombres;
        this.apellido = apellido;
    }

    public Integer getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(Integer numIdent) {
        this.numIdent = numIdent;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "numIdent=" + numIdent + ", nombres=" + nombres + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
}
