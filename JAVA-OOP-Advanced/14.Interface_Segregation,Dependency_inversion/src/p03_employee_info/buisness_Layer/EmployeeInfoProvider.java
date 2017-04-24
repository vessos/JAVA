package p03_employee_info.buisness_Layer;

import p03_employee_info.models.Employee;
import p03_employee_info.database_layer.EmployeeDatabase;
import p03_employee_info.userInterface.InfoProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeInfoProvider implements InfoProvider {

    private EmployeeDatabase database;

    public EmployeeInfoProvider() {
        this.database = new EmployeeDatabase();
    }


    @Override
    public List<Employee> getEmployeesBy(Comparator<Employee> comparator) {
        return this.database.readEmployees().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
