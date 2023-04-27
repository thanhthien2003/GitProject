package case_study_again.util;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study_again.models.persons.Employees;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    private static final  String PATH_FILE_EMPLOYEE="src\\case_study_again\\data\\employee.csv";
    public static void writeFileEmployee(boolean flag, List<Employees>employeeList){
        File file = new File(PATH_FILE_EMPLOYEE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter=new FileWriter(file,flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employees e:employeeList) {
                bufferedWriter.write(e.getInforToEmployees());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static List<Employees> readFileCustomer(){
        List<Employees>employeeList = new ArrayList<>();
        File file =new File(PATH_FILE_EMPLOYEE);
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line =null;
            while ((line=bufferedReader.readLine())!=null){
                String [] arr = line.split(",");
                employeeList.add(new Employees(arr[0],arr[1],arr[2],arr[3],
                        arr[4],arr[5],arr[6],arr[7],arr[8],Float.parseFloat(arr[9])));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
