
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Persona 
{
    /**
     * Creo una lista tipo mapa que contiene atributos generales de identificacion y nombre
     */
    private Map<Integer, Persona> arbol = new HashMap();
    private int indentificacion;
    private String nombre;

    /*
    *constructor que inicializa los atributos 
    */
    public Persona(int indentificacion, String nombre) {
        this.indentificacion = indentificacion;
        this.nombre = nombre;
    }

    /**
     * @return the arbol
     */
    public Map<Integer, Persona> getArbol() {
        return arbol;
    }

    /**
     * @param arbol the arbol to set
     */
    public void setArbol(Map<Integer, Persona> arbol) {
        this.arbol = arbol;
    }

    /**
     * @return the indentificacion
     */
    public int getIndentificacion() {
        return indentificacion;
    }

    /**
     * @param indentificacion the indentificacion to set
     */
    public void setIndentificacion(int indentificacion) {
        this.indentificacion = indentificacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
