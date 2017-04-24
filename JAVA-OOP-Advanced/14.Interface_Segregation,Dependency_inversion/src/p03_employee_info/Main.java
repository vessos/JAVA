package p03_employee_info;

import p03_employee_info.buisness_Layer.ConsoleFormatter;
import p03_employee_info.buisness_Layer.EmployeeInfoProvider;
import p03_employee_info.userInterface.ConsoleClient;
import p03_employee_info.userInterface.Formatter;
import p03_employee_info.userInterface.InfoProvider;

public class Main {

    public static void main(String[] args) {
        InfoProvider employeeInfo = new EmployeeInfoProvider();
        Formatter formatter = new ConsoleFormatter();

        ConsoleClient consoleClient = new ConsoleClient(formatter,employeeInfo);
        System.out.println(consoleClient.getResult());
    }
}
