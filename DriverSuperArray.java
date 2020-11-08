public class DriverSuperArray{

        public static void removeDuplicates(SuperArray s) {
                for (int i = s.size() - 1; i >= 0; i--) {
                        if (i != s.indexOf(s.get(i))) {
                                s.remove(i);
                        }
                }
        }

        public static void findOverlap(SuperArray a, SuperArray b) {
                SuperArray val = new SuperArray(1);
                for (int i = 0; i < a.size(); i++) {
                        if (b.contains(a.get(i)) && !val.contains(a.get(i))) {
                                val.add(a.get(i));
                        }
                }
		System.out.println(val.toString());
    	}

    	public static void main(String[]args){
    		/* SuperArray words = new SuperArray();
    		//grouped to save vertical space
    		words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    		words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    		words.add("una");    words.add("ebi");     words.add("toro");
    		System.out.println(words);
    		removeDuplicates(words);
    		System.out.println(words.toArray()); */
		SuperArray a = new SuperArray(6);
		SuperArray b = new SuperArray(5);
		a.add("9");
		a.add("1");
                a.add("2");
		a.add("2");
		a.add("3");
		a.add("4");
		b.add("0");
		b.add("4");
		b.add("2");
		b.add("2");
		b.add("9");
	    	findOverlap(a,b);
    }
}

