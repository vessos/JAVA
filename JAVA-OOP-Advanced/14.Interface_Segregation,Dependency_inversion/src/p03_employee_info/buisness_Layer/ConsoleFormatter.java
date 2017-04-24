package p03_employee_info.buisness_Layer;

import p03_employee_info.userInterface.Formatter;

public class ConsoleFormatter implements Formatter{

    public String format(Iterable<?> employees) {
        StringBuilder sb = new StringBuilder();
        for (Object employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }


}
