package app;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private Map<Integer, String> trans;

    public Translator() {
        trans = new HashMap<>();
        trans.put(0, "zero");
        trans.put(1, "one");
        trans.put(2, "two");
        trans.put(3, "three");
        trans.put(4, "four");
        trans.put(5, "five");
        trans.put(6, "six");
        trans.put(7, "seven");
        trans.put(8, "eight");
        trans.put(9, "nine");
    }

    public String translateDigit(int x) throws IllegalArgumentException {
        String res = trans.get(x);
        if (res == null)
            throw new IllegalArgumentException();
        return res;
    }
}
