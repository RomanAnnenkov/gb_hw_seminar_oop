package hw_seminar3;


import java.util.Iterator;

public class LinkedUnit<E> implements Iterable<E> {
    private int size = 0;
    private Unit<E> first;
    private Unit<E> last;

    public void add(E e) {
        Unit<E> newUnit = new Unit<>(null, e, null);
        if (first == null) {
            first = newUnit;
        } else {
            newUnit.previous = last;
            last.next = newUnit;
        }
        last = newUnit;
        size++;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private Unit<E> getUnit(int index) {
        int lastIndex = size - 1;
        if (index == 0) {
            return first;
        }
        if (index == lastIndex) {
            return last;
        }
        boolean backwardSearch = index > size / 2;
        Unit<E> unit = backwardSearch ? last : first;
        int countStep = backwardSearch ? lastIndex - index : index;
        for (int i = 0; i < countStep; i++) {
            unit = backwardSearch ? unit.previous : unit.next;
        }
        return unit;
    }

    public E get(int index) {
        isIndexExist(index);
        Unit<E> unit = getUnit(index);
        return unit.element;
    }

    public E remove(int index) {
        isIndexExist(index);
        Unit<E> unit = getUnit(index);
        if (unit == first) {
            first = unit.next;
            first.previous = null;
        } else if (unit == last) {
            last = unit.previous;
            last.next = null;
        } else {
            Unit<E> previousUnit = unit.previous;
            Unit<E> nextUnit = unit.next;
            previousUnit.next = nextUnit;
            nextUnit.previous = previousUnit;
        }
        size--;
        return unit.element;
    }

    public void isIndexExist(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(E value, int index) {
        isIndexExist(index);
        Unit<E> unit = getUnit(index);
        unit.element = value;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            Unit<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }

    private static class Unit<E> {
        Unit<E> previous;
        E element;
        Unit<E> next;

        public Unit(Unit<E> previous, E element, Unit<E> next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }


}
