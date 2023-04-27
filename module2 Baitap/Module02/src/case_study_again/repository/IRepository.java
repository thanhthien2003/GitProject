package case_study_again.repository;

import java.util.List;

public interface IRepository<E> {
    List<E> display();
     void add(E e);
}
