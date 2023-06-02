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

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                Unit<E> tmp = first;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                index++;
                return tmp.element;
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
