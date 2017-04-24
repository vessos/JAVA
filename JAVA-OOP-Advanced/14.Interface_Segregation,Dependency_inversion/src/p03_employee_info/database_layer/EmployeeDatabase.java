package p03_employee_info.database_layer;

import p03_employee_info.models.Employee;
import p03_employee_info.buisness_Layer.DataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabase implements DataBase {

    public List<Employee> readEmployees() {
        List<Employee> employees = new ArrayList<>();
        Collections.addAll(employees,
                new Employee("Pesho", 20),
                new Employee("Gosho", 40));

        return employees;
    }
}
