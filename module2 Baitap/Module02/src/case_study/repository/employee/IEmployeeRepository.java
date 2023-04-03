package case_study.repository.employee;

import case_study.models.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployee();
    void addEmployee(List<Employee> employeeList);
    void editEmployee(List<Employee> employeeList);

}
