public interface MyArrays <T>{
	T[] createArray(int arraySize);
	boolean addElement(T element, T[] array, int i);

	int checkArraySize(T[] array, int i);

	T[] removeElement(T[] array, T element);

	T[] removeElementCopies(T[] array, T element);

	T[] resizeArray(T[] array);

	T[] copyArrayElem(T[] arrA);

	T[] sliceArray(T[] array, int start, int end);
}
