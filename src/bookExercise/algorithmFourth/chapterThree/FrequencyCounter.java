package bookExercise.algorithmFourth.chapterThree;

import bookExercise.algorithmFourth.chapterThree.section1.Exe313;
import bookExercise.algorithmFourth.common.SymbolTable;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FrequencyCounter {
    public static void main(String[] args) {
        int distinct = 0, words = 0;
        int minlen = Integer.parseInt(args[0]);
//        ST<String, Integer> st = new ST<String, Integer>();
        SymbolTable st = new Exe313.OrderedSequentialSearchST();

        // compute frequency counts
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (key.length() < minlen) continue;
            words++;
            if (st.contains(key)) { st.put(key, (Integer.parseInt(st.get(key)) + 1 ) + ""); }
            else                  { st.put(key, "1"); distinct++; }
        }

        // find a key with the highest frequency count
        String max = "";
        st.put(max, "0");
//        for (String word : st.keys()) {
//            if (st.get(word) > st.get(max))
//                max = word;
//        }

        StdOut.println(max + " " + st.get(max));
        StdOut.println("distinct = " + distinct);
        StdOut.println("words  = " + words);


    }
}
