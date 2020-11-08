public class SuperArray{

	private String[] data;
	private int size;

	public SuperArray() {
		this.data = new String[10];
		for (int i = 0; i < data.length; i++) {
			data[i] = null;
		}
		this.size = 0;
	}
	
	public SuperArray(int initialCapacity) {
		this.data = new String[initialCapacity];
		for (int i = 0; i < data.length; i++) {
                        data[i] = null;
                }
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean add(String element) {
		if (size == data.length) {
			this.resize();
		}
		data[size] = element;
		size++;
		return true;
	}

	public String get(int index) {
		if (index < size) {
			return data[index];
		}
		else {
			return "faulty index: please provide appropriate index";
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String toString() {
		String val = "[";
		for (int i = 0; i < size; i++) {
			if (i != size - 1) {
				val +=  data[i];
				val += ", ";
			}
			else {
				val += data[i];
				val += "]";
			}
		}
		return val;
	}

	public boolean contains(String s) {
		boolean val = false;
		for (int i = 0; i < size && !val; i++) {
			val = get(i).equals(s);
		}
		return val;
	}

	public String set(int index, String element) {
		String val = this.get(index);
		if (index < size) {
			data[index] = element;
		}
		return val;
	}

	private void resize() {
		String[] temp = new String[data.length * 2 + 1];
		for (int i = 0; i < size; i++) {
                        temp[i] = data[i];
                }
		for (int i = size; i < temp.length; i++) {
			temp[i] = null;
		}
		data = temp;
	}

	public void clear() {
		for (int i = 0; i < data.length; i++) {
			data[i] = null;
		}
		size = 0;
	}

	public void add(int index, String element) {
		if (size == data.length) {
			resize();
		}
		String[] temp = new String[data.length];
		for (int i = 0; i < index; i++) {
			temp[i] = get(i);
		}
		temp[index] = element;
		for (int i = index; i < size + 1; i++) {
			temp[i+1] = get(i);
		}
		for (int i = size+1; i < temp.length; i++) {
			temp[i] = null;
		}
		this.size++;
		data = temp;
	}

	public String remove(int index) {
		String val = get(index);
		String[] temp = new String[data.length];
		for (int i = 0; i < index; i++) {
			temp[i] = get(i);
		}
		for (int i = index; i < size; i++) {
			temp[i] = get(i+1);
		}
		for (int i = size; i < temp.length; i++) {
			temp[i] = null;
		}
		data = temp;
		this.size--;
		return val;
	}

	public int indexOf(String s) {
		int val = -1;
		for (int i = 0; i < size && val == -1; i++) {
			if (get(i).equals(s)) {
				val = i;
			}
		}
		return val;
	}

	public String[] toArray() {
		String[] val = new String[size];
		for (int i = 0; i < size; i++) {
			val[i] = get(i);
		}
		return val;
	}


	public int lastIndexOf(String value) {
		int val = -1;
		for (int i = size - 1; i >= 0; i--) {
			if (get(i).equals(value)) {
				val = i;
				return val;
			}
		}
		return val;
	}

}
