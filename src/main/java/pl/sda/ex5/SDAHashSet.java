package pl.sda.ex5;

import java.util.HashSet;

public class SDAHashSet<E> extends HashSet<E> {
    private int operationCounter = 0;

    @Override
    public boolean add(E e) {
        operationCounter++;
        return super.add(e);
    }

    @Override
    public boolean remove(Object o) {
        operationCounter++;
        return super.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        operationCounter++;
        return super.contains(o);
    }

    @Override
    public int size() {
        operationCounter++;
        return super.size();
    }

    @Override
    public void clear() {
        operationCounter++;
        super.clear();
    }

    public int getOperationCounter() {
        return operationCounter;
    }
}
