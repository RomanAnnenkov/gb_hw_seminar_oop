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
