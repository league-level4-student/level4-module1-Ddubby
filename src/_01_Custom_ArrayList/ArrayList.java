package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	int location = -1;
	int value;
	int size;
	T template;
	
	public ArrayList() {
	}
	
	
	public T get(int loc) throws IndexOutOfBoundsException {
		for (int i = 0; i < 2; i++) {
			System.out.println(location);
			if (location == i) {
				location = 0;
				return template;
			} 
		}
		return template;
	}
	
	public void add(T val) {
		template = val;
		location++;
		size++;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {

	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}