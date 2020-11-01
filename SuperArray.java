public class SuperArray{

	private String[] data;
	private int size;

	public SuperArray() {
		this.data = new String[10];
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean add(String element) {
		if (size == data.length - 1) {
			this.resize();
		}
		data[data.length - 1] = element;
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

	private void resize() {
		String[] temp = new String[data.length + 1];
		for (int i = 0; i < data.length; i++) {
                        temp[i] = data[i];
                }
		data = temp;
	}

}
