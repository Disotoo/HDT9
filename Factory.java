/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 6
 * 6-03-2023
 */
import java.util.*;

public class Factory<T> {

    private IEstructuraArbol<Palabra> arbol;
    
    /** 
     * @param tipo
     * @return 
     */
    public IEstructuraArbol<Palabra> getInstance(int tipo){

    
        switch (tipo) {
            case 1:
            arbol = new ArbolRedBlack<Palabra>(); 
            break;

            case 2:
            arbol = new ArbolSplay<>();
            break;

            case 3:
            //hash = new TreeMap<String, ArrayList<String>>();
            break;

            default:
            break;
        }
        return arbol;

    } 
}

