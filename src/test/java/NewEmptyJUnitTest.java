/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Duvan
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        /***
         * llamo la funcion que permite dejar quemados los datos 
         */
        ingresar();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    /*
    *creo un mapa de tipo persona que permite guardar los datos segun los atributos solicitados
    */
    static Map<Integer, Persona> mapaAbuelo = new HashMap();
    /**
     * metodo ingresar que sirve para dejar por defecto la informacion
     */
    public static void ingresar()
    {
        
        mapaAbuelo = new HashMap();
        //Abuelos
        Persona pJuan = new Persona(1, "Juan");
        mapaAbuelo.put(1, pJuan);
        Persona pJose = new Persona(2, "Jose");
        mapaAbuelo.put(2, pJose);
        //Padres
        Persona pAndres = new Persona(3,"Andres");
        Persona pMaria = new Persona(4,"Maria");
        Persona pCarlos = new Persona(5,"Carlos");
        Persona pAlberto = new Persona(6,"Alberto");
        Persona pJimmy = new Persona(7,"Jimmy");
        Persona pJhon = new Persona(8,"Jhon");
        pJuan.getArbol().put(3, pAndres);
        pJuan.getArbol().put(4, pMaria);
        pJuan.getArbol().put(5, pCarlos);
        pJose.getArbol().put(6, pAlberto);
        pJose.getArbol().put(7, pJimmy);
        pJose.getArbol().put(8, pJhon);
        //hijos
        Persona pJuana = new Persona(9, "Juana");
        Persona pPaola = new Persona(10, "Paola");
        Persona pSofia = new Persona(11, "Sofia");
        Persona pJaime = new Persona(12, "Jaime");
        Persona pTatiana = new Persona(13, "Tatiana");
        Persona pFernanda = new Persona(14, "Fernanda");
        Persona pViviana = new Persona(15, "Viviana");
        Persona pDiana = new Persona(16, "Diana");
        pAndres.getArbol().put(9, pJuana);
        pAndres.getArbol().put(10, pPaola);
        pMaria.getArbol().put(11, pSofia);
        pCarlos.getArbol().put(12, pJaime);
        pAlberto.getArbol().put(13, pTatiana);
        pAlberto.getArbol().put(14, pFernanda);
        pJimmy.getArbol().put(15, pViviana);
        pJhon.getArbol().put(16, pDiana);
    }
    /**
     * metodo imprimirAbuelo
     * sirve para hacer un testeo de acuerdo al tipo de dato ingresado
     * este imprime toda la jerarquia del abuelo
     */
    @Test
    public void imprimirAbuelo()
    {
        Logica p= new Logica();
        String test = p.imprimir(mapaAbuelo,2);
        assertEquals("JoseAlbertoTatianaJoseAlbertoFernandaJoseJimmyVivianaJoseJhonDiana", test);
    }
    /**
     * metodo imprimir padre
     * sirve para hacer un testeo de acuerdo al tipo de dato ingresado
     * este imprime el nombre del padre, los hijos que tenga este padre
     * y el abuelo
     */
    @Test
    public void imprimirPadre()
    {
        Logica p= new Logica();
        String test = p.imprimir(mapaAbuelo,3);
        assertEquals("AndresJuanaJuanAndresPaolaJuan", test);
    }
    /**
     * metodo imprimirHijo
     * sirve para hacer un testeo de acuerdo al tipo de dato ingresado
     * este imprime el nombre del hijo, el padre y abuelo al que pertenezca
     */
    @Test
    public void imprimirHijo()
    {
        Logica p= new Logica();
        String test = p.imprimir(mapaAbuelo,11);
        assertEquals("SofiaMariaJuan", test);
    }
    /**
     * metodo imprimirError
     * sirve para analizar cuando se ingresa un codigo de identificacion no existente
     */
    @Test
    public void imprimirError()
    {
        Logica p= new Logica();
        String test = p.imprimir(mapaAbuelo,40);
        assertEquals("", test);
    }
}
