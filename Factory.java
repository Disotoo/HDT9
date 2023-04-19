/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 6
 * 6-03-2023
 */
import structure5.*;


public class Factory {

    private IEstructuraArbol<Palabra> resultado;

    private ComparadorPalabras<Palabra> comparator = new ComparadorPalabras<Palabra>();
    
    /** 
     * @param tipo
     * @return 
     */
    public IEstructuraArbol<Palabra> getInstance(int tipo){

    
        switch (tipo) {
            case 1:
            resultado = new ArbolRedBlack<Palabra>(); 
            break;

            case 2:
            resultado = new ArbolSplay<Palabra>();
            break;

            case 3:
            resultado = new ArbolBinary<Palabra>();
            break;

            default:
            break;
        }
        return resultado;

    } 
}

