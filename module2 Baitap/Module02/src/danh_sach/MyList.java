package danh_sach;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] element;

    public MyList() {
        element = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        element = (E[]) new Object[size];
    }

    private void ensure() {
        if (size > element.length) {
            int biggerSize = size * 2 + 1;
            element = Arrays.copyOf(element, biggerSize);
        }
    }

    public int size(){
        return size;
    }

    public boolean add(E e) {
        size += 1;
        ensure();
        element[size - 1] = e;
        return true;
    }

    public void add(int index, E e) {
        if (index > 0 && index <= size) {
            size = size + 1;
            for (int i = size - 2; i >= index; i--) {
                element[i + 1] = element[i];
            }
            element[index] = e;
        } else {
            System.out.println("khong the them phan tu nay");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                element[i] = element[i + 1];
            }
            size = size - 1;
        }
    }

    public boolean contains(Object e) {
        boolean flag = false;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == e) {
                flag = true;
            }
        }
        return flag;
    }

    public E[] clone() {
        MyList<E> clone = new MyList<>(size);
        for (E s : element) {
            if (s != null) {
                clone.add(s);
            }
        }
        return clone.element;
    }

    public int indexOf(E o) {
        int flag = -1;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == o) {
                flag = 1;
            }
        }
        return flag;
    }
    public E get(int i){
        if(i>=0 && i< element.length){
            return element[i];
        } else {
            return null;
        }
    }
    public void clear(){
        element = (E[]) new Object[DEFAULT_CAPACITY];
        size=0;
    }
}

