package case_study.service.employee;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.repository.employee.EmployeeRepository;
import case_study.repository.employee.IEmployeeRepository;
import case_study.utils.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Employee employee = new Employee();
    static Scanner sc = new Scanner(System.in);
    private String regExDate = "^(0[1-9]||([0-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";
    static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        employeeList = employeeRepository.displayEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }

    @Override
    public void add() {
        employee = entryEmployee();
        employeeList.add(employee);
        employeeRepository.addEmployee(employeeList);
    }

    @Override
    public void edit() {
        employeeList = employeeRepository.displayEmployee();
        System.out.println("Enter the id of the Employee you want to check");
        int id = Integer.parseInt(sc.nextLine());
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (id == employeeList.get(i).getId()) {
                employee = entryEmployee();
                employeeList.set(i, employee);
                employeeRepository.editEmployee(employeeList);
            }
        }
    }

    public Employee entryEmployee() {
        System.out.println("enter ID employee");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter name employee");
        String name = sc.nextLine();
        boolean flag = false;
        boolean flag1;
        String date;
        do {
            System.out.println("enter date of birth\n");
            date = sc.nextLine();
            flag1 = date.matches(regExDate);
            if (!flag1) {
                System.out.println("wrong date format" +
                        "\n must be in the correct format: dd/mm/YYYY");
            } else {
                flag = true;
            }
        } while (!flag);
        System.out.println("enter gender");
        String gender = sc.nextLine();
        System.out.println("enter IdCountry");
        int idCountry = Integer.parseInt(sc.nextLine());
        System.out.println("enter phone number");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("enter email");
        String email = sc.nextLine();
        System.out.println("enter lever");
        String lever = sc.nextLine();
        System.out.println("enter address");
        String address = sc.nextLine();
        System.out.println("enter wage");
        float wage = Float.parseFloat(sc.nextLine());
        employee = new Employee(id, name, date, gender, idCountry, phoneNumber, email, lever, address, wage);
        return employee;
    }
}
