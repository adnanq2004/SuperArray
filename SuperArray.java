public class SuperArray{

	private String[] data;
	private int size;

	public SuperArray() {
		this.size = 10;
	}

	public int size() {
		return this.size;
	}

	public boolean add(String element) {
		String[] temp = new String[data.length+1];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		temp[temp.length-1] = element;
		this.data = temp;
		return true;
	}

}
