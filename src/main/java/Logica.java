
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Logica 
{
    /**
     * creo un mapa que contiene los atributos de la clase principal
     */
    Map<Integer, Persona> mapaAbuelo = new HashMap();
    /**
     * contructor que inicializa el programa
     */
    public Logica() 
    {     
    }
    /**
     * Metodo imprimir que se utiliza para recorrer el mapa de los 
     * datos que se encuentran quemados, y por medio de condicionales 
     * se valida que tipo de datos son los que debe imprimir segun el criterio de busqueda
     * @param mapaAbue variable donde guardo los datos que estan quemados
     * @param buscar varable que utilizo para realizar la busqueda deseada por el usuario
     * @return 
     */
    public String imprimir(Map mapaAbue, int buscar)
    {
        String prueba = "";
        mapaAbuelo.putAll(mapaAbue);
        for(Integer keyAbuelo : mapaAbuelo.keySet())
        {
            Persona pAbuelo = mapaAbuelo.get(keyAbuelo);            
            for(Integer keyPadre : pAbuelo.getArbol().keySet())
            {                    
                Persona pPadre = pAbuelo.getArbol().get(keyPadre);                
                for(Integer keyHijo : pPadre.getArbol().keySet())
                {
                    Persona pHijo = pPadre.getArbol().get(keyHijo);                    
                    if(mapaAbuelo.containsKey(buscar))
                    {
                        if(keyAbuelo == buscar)
                        {
                            prueba = prueba.concat(pAbuelo.getNombre());
                            prueba = prueba.concat(pPadre.getNombre());
                            prueba = prueba.concat(pHijo.getNombre());
                            System.out.println("soy: " + pAbuelo.getNombre());
                            System.out.println("mi hijo es: " + pPadre.getNombre());
                            System.out.println("mi nieto es: " + pHijo.getNombre());
                        }
                    }
                    else if(mapaAbuelo.get(keyAbuelo).getArbol().containsKey(buscar))
                    {
                        if(keyPadre == buscar)
                        {
                            prueba = prueba.concat(pPadre.getNombre());
                            prueba = prueba.concat(pHijo.getNombre());
                            prueba = prueba.concat(pAbuelo.getNombre());
                            System.out.println("soy: " + pPadre.getNombre());
                            System.out.println("mi hijo es: " + pHijo.getNombre());
                            System.out.println("el abuelo es: " + pAbuelo.getNombre());
                        }
                    }
                    else if(mapaAbuelo.get(keyAbuelo).getArbol().get(keyPadre).getArbol().containsKey(buscar))
                    {
                        if(keyHijo == buscar)
                        {
                            prueba = prueba.concat(pHijo.getNombre());
                            prueba = prueba.concat(pPadre.getNombre());
                            prueba = prueba.concat(pAbuelo.getNombre());
                            System.out.println("soy: " + pHijo.getNombre());
                            System.out.println("mi padre es: " + pPadre.getNombre());
                            System.out.println("mi abuelo es: " + pAbuelo.getNombre());
                        }
                    }
                }                    
            }
        }
        return prueba;
    }
}
