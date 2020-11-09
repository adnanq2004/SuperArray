public class Demo{

        public static void removeDuplicates(SuperArray s) {
                for (int i = s.size() - 1; i >= 0; i--) {
                        if (i != s.indexOf(s.get(i))) {
                                s.remove(i);
                        }
                }
        }

        public static SuperArray findOverlap(SuperArray a, SuperArray b) {
                SuperArray val = new SuperArray(1);
                for (int i = 0; i < a.size(); i++) {
                        if (b.contains(a.get(i)) && !val.contains(a.get(i))) {
                                val.add(a.get(i));
                        }
                }
        	return val;
	}

	public static SuperArray zip(SuperArray a, SuperArray b) {
		SuperArray val = new SuperArray(0);
		int max = 0;
		if (a.size() > b.size()) {
			max = b.size();
			for (int i = 0; i < max; i++) {
				val.add(a.get(i));
				val.add(b.get(i));
			}
			for (int i = max; i < a.size(); i++) {
				val.add(a.get(i));
			}
		}
		else {
			max = a.size();
                        for (int i = 0; i < max; i++) {
                                val.add(a.get(i));
                                val.add(b.get(i));
                        }
                        for (int i = max; i < b.size(); i++) {
                                val.add(b.get(i));
                        }
		}
		return val;
	}

        public static void main(String[]args){
                /* SuperArray words = new SuperArray();
                //grouped to save vertical space
                words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
                words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
                words.add("una");    words.add("ebi");     words.add("toro");
                System.out.println(words);
                removeDuplicates(words);
                System.out.println(words.toArray());
                SuperArray a = new SuperArray(6);
                SuperArray b = new SuperArray(4);
                a.add("a");
                a.add("b");
                a.add("c");
                a.add("d");
                a.add("e");
                a.add("f");
                b.add("0");
                b.add("1");
                b.add("2");
                b.add("3");
                System.out.println(zip(a,b).toString());
		*/
	}

}

