package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	private T[] values;

	public ArrayList() {
		values = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return values[loc];
	}

	public void add(T val) {
		T[] values2 = (T[]) new Object[values.length + 1];
		values2[values.length] = val;
		for (int i = 0; i < values.length; i++) {
			values2[i] = values[i];
		}
		values = values2;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] values2 = (T[]) new Object[values.length + 1];
		for (int i = 0; i < values2.length; i++) {
			if (i < loc) {
				values2[i] = values[i];
			} else if (i > loc) {
				values2[i] = values[i - 1];
			} else {
				values2[i] = val;
			}
		}
		values = values2;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		values[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] values2 = (T[]) new Object[values.length - 1];
		for (int i = 0; i < values.length; i++) {
			if (i < loc) {
				values2[i] = values[i];
			}
			if (i > loc) {
				values2[i - 1] = values[i];
			} else {
				continue;
			}
		}
		values = values2;
	}

	public int size() {
		return values.length;
	}
	public boolean contains(T val) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] == val) {
				return true;
			}
		}
		return false;
	}
}