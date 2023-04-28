package case_study_again.repository.employee_repo;

import case_study.models.person.Employee;
import case_study_again.models.persons.Employees;
import case_study_again.util.ReadAndWrite;
import case_study_again.util.ReadAndWriteEmployee;

import java.util.List;

public class EmployeeRepo implements IEmployeeRepo{
    List<Employees>employeeList= ReadAndWriteEmployee.readFileCustomer();

    @Override
    public List<Employees> display() {;
        return employeeList;
    }

    @Override
    public void add(Employees employee) {
        employeeList.add(employee);
        ReadAndWriteEmployee.writeFileEmployee(false,employeeList);
    }

    @Override
    public void edit(Employees employeeUp,int i) {
        for (int j = 0; j < employeeList.size(); j++) {
            if (j==i){
                employeeList.set(j,employeeUp);
                break;
            }
        }
        ReadAndWriteEmployee.writeFileEmployee(false,employeeList);
    }
}
