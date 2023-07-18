public class Searching <T>{
	public int linearSearch(T[] array, T target, int i) {
		T lastElement = array[array.length - 1];
		array[array.length - 1] = target;

		if (array[i] == target) {
			array[array.length - 1] = lastElement;
			return i;
		}

		if (i == array.length - 1) {
			return -1;
		}


		return linearSearch(array, target, i + 1);
	}
}
