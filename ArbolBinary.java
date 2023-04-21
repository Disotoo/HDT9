/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 */
import java.util.Comparator;

import structure5.BinarySearchTree;


public class ArbolBinary<T extends Comparable<T>> implements IEstructuraArbol<T> {

    private BinarySearchTree<T> myInternalTree;

    public ArbolBinary() {
		myInternalTree = new BinarySearchTree<T>();
	}
	
	public ArbolBinary(Comparator<T> comparador){
		myInternalTree = new BinarySearchTree<T>(comparador);
	}
	@Override
	public void add(T value) {
		myInternalTree.add(value);
	}

	@Override
	public T get(T key) {
		return myInternalTree.get(key);
	}

	@Override
	public T remove(T key) {
		return myInternalTree.remove(key);
	}

	@Override
	public int count() {
		return myInternalTree.size();
	}

	@Override
	public boolean isEmpty() {
		return myInternalTree.isEmpty();
	}
	
	public BinarySearchTree<T> getInternalTree(){
		return myInternalTree;
	}
}
