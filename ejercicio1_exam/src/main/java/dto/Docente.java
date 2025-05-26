/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author rosar
 */
public class Docente {
    private String codigo;
    private String nombre;
    private String direccion;
    private Date fecha;
    private String talla;
    private String correo;
    private Docente sig;
    private Docente ant;

    public Docente() {
    }

    public Docente(String codigo, String nombre, String direccion, Date fecha, String talla, String correo,Docente sig, Docente ant) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecha = fecha;
        this.talla = talla;
        this.correo = correo;
        this.sig=sig;
        this.ant=ant;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Docente getSig() {
        return sig;
    }

    public void setSig(Docente sig) {
        this.sig = sig;
    }

    public Docente getAnt() {
        return ant;
    }

    public void setAnt(Docente ant) {
        this.ant = ant;
    }
    
    
}
