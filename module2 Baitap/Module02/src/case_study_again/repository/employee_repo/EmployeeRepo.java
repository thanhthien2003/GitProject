package case_study_again.repository.employee_repo;

import case_study.models.person.Employee;
import case_study_again.models.persons.Employees;
import case_study_again.util.ReadAndWrite;
import case_study_again.util.ReadAndWriteEmployee;

import java.util.List;

public class EmployeeRepo implements IEmployeeRepo{

    @Override
    public List<Employees> display() {
        List<Employees>employeeList= ReadAndWriteEmployee.readFileCustomer();
        return employeeList;
    }

    @Override
    public void add(Employees employee) {

    }

    @Override
    public void edit() {

    }
}
