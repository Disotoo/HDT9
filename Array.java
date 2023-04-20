import java.util.ArrayList;

public class Array<T> implements IEstructuraArbol<T> {
    private ArrayList<T> myInternalTree; 
    private ArrayList prueba;
    private Palabra pal;

    public Array(ArrayList palabras){
        myInternalTree = new ArrayList<>();
        prueba = palabras;
    } 

    @Override
    public void add(T value) {
        
    }

    public Palabra verificar(Palabra valor){
        if(prueba.contains(valor.getEnglish())){
            pal =  new Palabra(valor.getEnglish(), "");
            return pal;
            
        }
        else{
            return null;
        }
    }

    @Override
    public T get(T key) {

    }

    @Override
    public T remove(T key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
    
}
