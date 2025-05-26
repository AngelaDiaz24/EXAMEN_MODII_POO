/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Docente;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author rosar
 */
public class DocenteDAO {
 private Docente raiz;
    private Docente ultimo;
    private Docente puntero;
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public DocenteDAO() {
        this.raiz = null;
        this.ultimo = null;
    }
    
    public void irAlInicio() {
        if (raiz == null) {
            System.out.print("No se han ingresado datos");
        } else {
            puntero = raiz;
        }
    }
    
    public void siguiente() {
        if (getPuntero() != null && getPuntero().getSig() != null){
            puntero = getPuntero().getSig();
        }
    }
    
    public void anterior() {
        if (getPuntero() != null && getPuntero().getAnt() != null){
            puntero = getPuntero().getAnt();
        }
    }
    
    public void irAlFinal() {
        if (ultimo == null) {
            System.out.println("NO se han ingresado datos");
        } else {
            puntero = ultimo;    
        }
    }
    
    public void agregar(Docente p) {
        if (raiz == null){
            raiz = ultimo = puntero = p;
        } else {
            ultimo.setSig(p);
            p.setAnt(ultimo);
            ultimo = p;
        }
    }
    
    public void eliminar() {
        if (raiz == null) {
            JOptionPane.showMessageDialog(null, "Todavia no se ingresan Sismos");
        }
        
        Docente p = raiz;
        
        if (p == raiz && p.getSig() == null) {
            raiz = ultimo = null;
        } else {
            while (p.getSig().getSig()!= null) {
                p = p.getSig();
            }
            p.setSig(null);
            ultimo = p;
            p = p.getSig();
            p.setAnt(null);
        }
    }
    
    public String leer() {
        String lista = "Datos del Alumnos:\n";
        Docente p = raiz;
        while (p != null) {
            lista += "Codigo: " + p.getCodigo() + "\n"
                    + "Nombre: " + p.getNombre() + "\n"
                    + "Direccion: " + p.getDireccion() + "\n"
                    + "Fecha de Nacimiento: " + formato.format(p.getFecha()) + "\n"
                    + "Talla: " + p.getTalla() + "\n"
                    + "Correo: " + p.getCorreo() + "\n"
                    +"--------------------------------------------------------------\n";
            p = p.getSig();
        }
        return lista;
    }
    
    public Docente getPuntero() {
        return this.puntero;
    }
}
