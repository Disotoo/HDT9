/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 */



public class Factory {

    private IEstructuraArbol<Palabra> resultado;

    
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

