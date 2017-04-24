package p03_employee_info.buisness_Layer;


import p03_employee_info.models.Employee;

import java.util.List;

public interface DataBase {
    List<Employee>readEmployees();
}
