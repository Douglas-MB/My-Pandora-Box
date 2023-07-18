public class TestArrays implements MyArrays{
	@Override
	public Object[] createArray(int arraySize) {
		return new Object[arraySize];
	}

	@Override
	public boolean addElement(Object element, Object[] array, int i) {
		if (checkArraySize(array, i) > 0){
			array[i] = element;
		}
		return false;
	}

	@Override
	public int checkArraySize(Object[] array, int i) {
		if (array.length == 0 || i > array.length || i < 0){
			return -1;
		}
		return array.length;
	}

	@Override
	public Object[] removeElement(Object[] array, Object element) {
		Searching aux = new Searching();
		int auxElem = aux.linearSearch(array, element, 0);

		if (auxElem >= 0){
			for (int i = auxElem; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			Object[] newArray = createArray(array.length - 1);
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = array[i];
			}
			return newArray;
		}
		return new Object[0];
	}

	@Override
	public Object[] removeElementCopies(Object[] array, Object element) {

		int i = 0;
		for (int j = 0; j < array.length; j++) {
			if (j == 0 || array[j] != array[j - 1]) {
				array[i] = array[j];
				i++;
			}
		}
		i = array.length - i;
		Object[] newArray = createArray(i);
		for (int j = 0; j < newArray.length; j++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

	@Override
	public Object[] resizeArray(Object[] array) {
		final int newSize = array.length << 1;
		Object[] newArray = new Object[newSize];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

	@Override
	public Object[] copyArrayElem(Object[] arrA) {
		Object[] auxArr = createArray(arrA.length);
		for (int i = 0; i < auxArr.length; i++) {
			auxArr[i] = arrA[i];
		}
		return auxArr;
	}

	@Override
	public Object[] sliceArray(Object[] array, int start, int end) {
		Object[] newArray = createArray(end - start + 1);
		for (int i = start; i < end; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
}
