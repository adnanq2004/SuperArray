public class SuperArray{

	private String[] data;
	private int size;

	public SuperArray(int size) {
		this.size = size;
	}

	public int size() {
		return this.size;
	}

	public boolean add(String element) {
		String[] temp = new String[size+1];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		temp[temp.length-1] = element;
		this.data = temp;
		this.size = size++;
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

	public String set(int index, String element) {
		String val = this.get(index);
		if (index < size) {
			data[index] = element;
		}
		return val;
	}

}
