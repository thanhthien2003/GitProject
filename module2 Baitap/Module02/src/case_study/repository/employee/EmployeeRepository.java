package case_study.repository.employee;

import case_study.models.person.Employee;
import case_study.utils.ReadAndWriteEmployee;
import file_nhi_phan.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements  IEmployeeRepository{
    static List<Employee> employeeList = ReadAndWriteEmployee.readFile();
    @Override
    public List<Employee> displayEmployee() {
        return employeeList;
    }

    @Override
    public void addEmployee(List<Employee> employeeList) {
        ReadAndWriteEmployee.writeFile(employeeList,false);
    }
    @Override
    public void editEmployee(List<Employee> employeeList) {
        ReadAndWriteEmployee.writeFile(employeeList,false);
    }
}
