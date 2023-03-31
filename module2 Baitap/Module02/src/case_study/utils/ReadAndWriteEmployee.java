package case_study.utils;

import case_study.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public static List<Employee> readFile(String pathFile){
        List<Employee> stringList = new ArrayList<>();
        File file =new File(pathFile);
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line=bufferedReader.readLine()) != null){
                String [] data = line.split(",");
                stringList.add(new Employee(Integer.parseInt(data[0]),data[1],data[2],data[3],Integer.parseInt(data[4]),
                                Integer.parseInt(data[5]),data[6],data[7],data[8],Integer.parseInt(data[9])));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static void writeFile(String pathFile,List<Employee> employeeList,boolean flag){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < employeeList.size(); i++) {
                bufferedWriter.write(employeeList.get(i).getInforToEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file eror");
        }
    }
}
