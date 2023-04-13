package lam_them.repository;

import java.util.List;
import java.util.Objects;

public interface IPersonRepo<E> {
    void add(E e);
    void delete(List<E> eList);
    List<E> display();
}
