package kareta.lab6.machine;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by vitya on 01.04.17.
 */
public class MoneyCounter implements Iterable<Integer> {

    public ArrayList<Integer> money = new ArrayList<>();

    @Override
    public Iterator<Integer> iterator() {
        return new MoneyInterator();
    }

    private class MoneyInterator implements Iterator<Integer> {

        public int current;

        @Override
        public boolean hasNext() {
            return money.size() == current;
        }

        @Override
        public Integer next() {
            return money.get(current++);
        }
    }

    public int count() {
        int count = 0;

        for (int bill : money) {
            count += bill;
        }

        return count;
    }
}
