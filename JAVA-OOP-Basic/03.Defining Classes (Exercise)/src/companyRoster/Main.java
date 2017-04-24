package companyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(reader.readLine());
        HashMap<String, Double> departments = new HashMap<>();
        HashMap<String, List<Employee>> allOfEmployers = new HashMap<>();

        for (int i = 0; i < line; i++) {

            String[] employer = reader.readLine().split(" ");

            Employee employee;
            double num;
            switch (employer.length) {
                case 6:
                    employee = new Employee(employer[0], Double.parseDouble(employer[1]), employer[2], employer[3], employer[4], Integer.parseInt(employer[5]));
                    if (!departments.containsKey(employee.getDepartment())) {
                        departments.put(employee.getDepartment(), 0.0);
                    }
                    num = departments.get(employee.getDepartment());
                    departments.put(employee.getDepartment(), num += employee.getSalary());
                    if (!allOfEmployers.containsKey(employee.getDepartment())) {
                        allOfEmployers.put(employee.getDepartment(), new ArrayList<>());
                    }
                    allOfEmployers.get(employee.getDepartment()).add(employee);
                    break;
                case 5:
                    if (employer[employer.length - 1].length() == 2) {
                        employee = new Employee(employer[0], Double.parseDouble(employer[1]), employer[2], employer[3], Integer.parseInt(employer[4]));
                        if (!departments.containsKey(employee.getDepartment())) {
                            departments.put(employee.getDepartment(), 0.0);
                        }
                        num = departments.get(employee.getDepartment());
                        departments.put(employee.getDepartment(), num += employee.getSalary());
                        if (!allOfEmployers.containsKey(employee.getDepartment())) {
                            allOfEmployers.put(employee.getDepartment(), new ArrayList<>());
                        }
                        allOfEmployers.get(employee.getDepartment()).add(employee);
                    } else {
                        employee = new Employee(employer[0], Double.parseDouble(employer[1]), employer[2], employer[3], employer[4]);
                        if (!departments.containsKey(employee.getDepartment())) {
                            departments.put(employee.getDepartment(), 0.0);
                        }
                        num = departments.get(employee.getDepartment());
                        departments.put(employee.getDepartment(), num += employee.getSalary());
                        if (!allOfEmployers.containsKey(employee.getDepartment())) {
                            allOfEmployers.put(employee.getDepartment(), new ArrayList<>());
                        }
                        allOfEmployers.get(employee.getDepartment()).add(employee);
                    }
                    break;
                case 4:
                    employee = new Employee(employer[0], Double.parseDouble(employer[1]), employer[2], employer[3]);
                    if (!departments.containsKey(employee.getDepartment())) {
                        departments.put(employee.getDepartment(), 0.0);
                    }
                    num = departments.get(employee.getDepartment());
                    departments.put(employee.getDepartment(), num += employee.getSalary());
                    if (!allOfEmployers.containsKey(employee.getDepartment())) {
                        allOfEmployers.put(employee.getDepartment(), new ArrayList<>());
                    }
                    allOfEmployers.get(employee.getDepartment()).add(employee);
                    break;
            }


        }
        departments.entrySet().stream()
                .sorted((a,b)->Double.compare(b.getValue(),a.getValue()))
                .limit(1)
                .forEach(x-> {
                    System.out.println("Highest Average Salary: " + x.getKey());
                    allOfEmployers.get(x.getKey()).stream()
                            .sorted((a,b)->Double.compare(b.getSalary(),a.getSalary()))
                            .forEach(y-> System.out.println(y.toString()));

                });
    }
}
