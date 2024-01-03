package mvc.repository;

import mvc.model.Bug;

import java.util.List;

public interface IBugRepo {
    List<Bug> display();

    void add(Bug bug);

    List<String> optionMucDoNguyHai();
}
