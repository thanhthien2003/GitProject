package case_study_again.service.employee_service;

import case_study_again.models.persons.Employees;
import case_study_again.repository.employee_repo.EmployeeRepo;
import case_study_again.repository.employee_repo.IEmployeeRepo;
import case_study_again.util.RegExEmployees;
import regex_lam_lai.CheckRegEx;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepo employeeRepo = new EmployeeRepo();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Employees e : employeeRepo.display()) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        Employees employees = entryEmployees();
        employeeRepo.add(employees);
    }

    @Override
    public void edit() {
        System.out.print("Enter your id you want edit");
        String id = sc.nextLine();
        List<Employees> employeesList = employeeRepo.display();
        for (int i = 0; i < employeesList.size(); i++) {
            if (id.equals(employeesList.get(i).getId())) {
                Employees employeesUp = employeesList.get(i);
                boolean append;
                do {
                    append = false;
                    System.out.println("choose 1 thing you want to fix: " +
                            "\n 1. Name" +
                            "\n 2. Date" +
                            "\n 3. Gender" +
                            "\n 4. IdCountry" +
                            "\n 5. PhoneNumber" +
                            "\n 6. Email" +
                            "\n 7. Lever" +
                            "\n 8. Address" +
                            "\n 9. Wage");
                    String choose = sc.nextLine();
                    boolean flag = true;
                    switch (choose) {
                        case "1":
                            String name = null;
                            do {
                                System.out.print("Enter name edit:");
                                name = sc.nextLine();
                                if (RegExEmployees.checkNameEmployee(name)) {
                                    flag = false;
                                } else {
                                    System.out.println("Please re-enter, maybe you forgot UpperCase a firts key ");
                                    flag = true;
                                }
                            } while (flag);
                            employeesUp.setName(name);
                            break;
                        case "2":
                            String date = null;
                            do {
                                System.out.print("Enter date edit:");
                                date = sc.nextLine();
                                if (RegExEmployees.checkDate(date)) {
                                    flag = false;
                                } else {
                                    flag = true;
                                }
                            } while (flag);
                            employeesUp.setDate(date);
                            break;
                        case "3":
                            String gender = null;
                            do {
                                System.out.println("Choose one gender edit:" +
                                        "\n 1. Male" +
                                        "\n 2. Female");
                                choose = sc.nextLine();
                                switch (choose) {
                                    case "1":
                                        gender = "Male";
                                        flag = false;
                                        break;
                                    case "2":
                                        gender = "Female";
                                        flag = false;
                                        break;
                                    default:
                                        System.out.println("Your choice not exist , please re-enter");
                                        flag = true;
                                        break;
                                }
                            } while (flag);
                            employeesUp.setGender(gender);
                            break;
                        case "4":
                            String idCountry = null;
                            do {
                                System.out.print("Enter your IdCountry edit:");
                                idCountry = sc.nextLine();
                                if (RegExEmployees.checkIdCountry(idCountry)) {
                                    flag = false;
                                } else {
                                    System.out.println("Your enter wrong , please re-enter");
                                    flag = true;
                                }
                            } while (flag);
                            employeesUp.setIdCountry(idCountry);
                            break;
                        case "5":
                            String phoneNumber = null;
                            do {
                                System.out.print("Enter your phone number edit:");
                                phoneNumber = sc.nextLine();
                                if (RegExEmployees.checkPhoneNumber(phoneNumber)) {
                                    flag = false;
                                } else {
                                    System.out.println("Your enter wrong , please re-enter with format: 0XXXXXXXXX");
                                    flag = true;
                                }
                            } while (flag);
                            employeesUp.setPhoneNumber(phoneNumber);
                            break;
                        case "6":
                            System.out.print("Enter your email edit : ");
                            String email = sc.nextLine();
                            employeesUp.setEmail(email);
                            break;
                        case "7":
                            String lever = null;
                            do {
                                System.out.println("Choose your lever edit:" +
                                        "\n 1. Intermediate " +
                                        "\n 2. College " +
                                        "\n 3. University" +
                                        "\n 4.  After university");
                                choose = sc.nextLine();
                                switch (choose) {
                                    case "1":
                                        lever = "Intermediate";
                                        flag = false;
                                        break;
                                    case "2":
                                        lever = "College";
                                        flag = false;
                                        break;
                                    case "3":
                                        lever = "University";
                                        flag = false;
                                        break;
                                    case "4":
                                        lever = "After university";
                                        flag = false;
                                        break;
                                    default:
                                        System.out.println("Enter one number same your choice , please re-enter");
                                        flag = true;
                                }
                            } while (flag);
                            employeesUp.setLever(lever);
                            break;
                        case "8":
                            String position = null;
                            do {
                                System.out.println("Position: \n" +
                                        "1. Receptionist\n" +
                                        "2. Server\n" +
                                        "3. Expert\n" +
                                        "4. Monitor\n" +
                                        "5. Manager\n" +
                                        "6. Administrator\n" +
                                        "Enter your choice: ");
                                int option = Integer.parseInt(sc.nextLine());
                                switch (option) {
                                    case 1:
                                        position = "RECEPTIONIST";
                                        flag = false;
                                        break;
                                    case 2:
                                        position = "SERVER";
                                        flag = false;
                                        break;
                                    case 3:
                                        position = "EXPERT";
                                        flag = false;
                                        break;
                                    case 4:
                                        position = "MONITOR";
                                        flag = false;
                                        break;
                                    case 5:
                                        position = "MANAGER";
                                        flag = false;
                                        break;
                                    case 6:
                                        position = "ADMINISTRATOR";
                                        flag = false;
                                        break;
                                    default:
                                        System.out.println("Your choice not exist , please re-enter");
                                        flag = true;
                                }
                            } while (flag);
                            employeesUp.setPosition(position);
                            break;
                        case "9":
                            System.out.print("Enter your wage: ");
                            float wage = Float.parseFloat(sc.nextLine());
                            employeesUp.setWage(wage);
                            break;
                        default:
                            append = true;
                            System.out.println("Your enter not exist, please re-enter");
                            break;
                    }
                }while (append);
                employeesList.set(i,employeesUp);
                employeeRepo.edit(employeesList);
                break;
            } else {
                System.out.println("Your enter id not exist");
            }
        }
    }

    public Employees entryEmployees() {
        boolean flag = true;
//        String id, String name, String date, String gender, String idCountry, String phoneNumber, S
//        tring email, String lever, String address, float wage
        String id = null;
        do {
            System.out.print("Enter id:");
            id = sc.nextLine();
            if (RegExEmployees.checkIdEmployees(id)) {
                flag = false;
            } else {
                System.out.println("Please enter correct format:: NV-YYYY ( Y : 0-9)");
                flag = true;
            }
        } while (flag);
        String name = null;
        do {
            System.out.print("Enter name:");
            name = sc.nextLine();
            if (RegExEmployees.checkNameEmployee(name)) {
                flag = false;
            } else {
                System.out.println("Please re-enter, maybe you forgot UpperCase a firts key ");
                flag = true;
            }
        } while (flag);
        String date = null;
        do {
            System.out.print("Enter date:");
            date = sc.nextLine();
            if (RegExEmployees.checkDate(date)) {
                flag = false;
            } else {
                flag = true;
            }
        } while (flag);
        String gender = null;
        do {
            System.out.println("Choose one gender:" +
                    "\n 1. Male" +
                    "\n 2. Female");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    gender = "Male";
                    flag = false;
                    break;
                case "2":
                    gender = "Female";
                    flag = false;
                    break;
                default:
                    System.out.println("Your choice not exist , please re-enter");
                    flag = true;
                    break;
            }
        } while (flag);
        String idCountry = null;
        do {
            System.out.print("Enter your IdCountry:");
            idCountry = sc.nextLine();
            if (RegExEmployees.checkIdCountry(idCountry)) {
                flag = false;
            } else {
                System.out.println("Your enter wrong , please re-enter");
                flag = true;
            }
        } while (flag);
        String phoneNumber = null;
        do {
            System.out.print("Enter your phone number:");
            phoneNumber = sc.nextLine();
            if (RegExEmployees.checkPhoneNumber(phoneNumber)) {
                flag = false;
            } else {
                System.out.println("Your enter wrong , please re-enter with format: 0XXXXXXXXX");
                flag = true;
            }
        } while (flag);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        String lever = null;
        do {
            System.out.println("Choose your lever:" +
                    "\n 1. Intermediate " +
                    "\n 2. College " +
                    "\n 3. University" +
                    "\n 4.  After university");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    lever = "Intermediate";
                    flag = false;
                    break;
                case "2":
                    lever = "College";
                    flag = false;
                    break;
                case "3":
                    lever = "University";
                    flag = false;
                    break;
                case "4":
                    lever = "After university";
                    flag = false;
                    break;
                default:
                    System.out.println("Enter one number same your choice , please re-enter");
                    flag = true;
            }
        } while (flag);
        String position = null;
        do {
            System.out.println("Position: \n" +
                    "1. Receptionist\n" +
                    "2. Server\n" +
                    "3. Expert\n" +
                    "4. Monitor\n" +
                    "5. Manager\n" +
                    "6. Administrator\n" +
                    "Enter your choice: ");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    position = "RECEPTIONIST";
                    flag = false;
                    break;
                case 2:
                    position = "SERVER";
                    flag = false;
                    break;
                case 3:
                    position = "EXPERT";
                    flag = false;
                    break;
                case 4:
                    position = "MONITOR";
                    flag = false;
                    break;
                case 5:
                    position = "MANAGER";
                    flag = false;
                    break;
                case 6:
                    position = "ADMINISTRATOR";
                    flag = false;
                    break;
                default:
                    System.out.println("Your choice not exist , please re-enter");
                    flag = true;
            }
        } while (flag);
        float wage = 0;
        do {
            try {
                System.out.print("Enter your wage: ");
                wage = Float.parseFloat(sc.nextLine());
                flag = false;
            } catch (Exception e) {
                flag = true;
                System.out.println("Just number please re-enter");
            }
        } while (flag);
        Employees employees = new Employees(id, name, date, gender, idCountry, phoneNumber, email, lever, position, wage);
        return employees;
    }
}
