package case_study_again.repository.employee_repo;

import case_study.models.person.Employee;
import case_study_again.models.persons.Employees;
import case_study_again.repository.IRepository;

import java.util.List;

public interface IEmployeeRepo extends IRepository<Employees> {
    void edit(List<Employees> list);
}
