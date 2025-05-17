package employee;

import address.Address;
import address.AddressService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeService {

    public static Optional<List<Employee>> getEmployeeList(int totalCountOfEmployee) {
        List<Employee> employeeList = new ArrayList<>();

        // Get address list from AddressService
        Optional<List<Address>> addressListOpt = AddressService.getAddressList(totalCountOfEmployee);

        // Check if address list is present
        if (addressListOpt.isPresent()) {
            List<Address> addressList = addressListOpt.orElseGet(ArrayList::new);
            // Populate employee list with employee data and associated addresses
            for (int i = 0; i < totalCountOfEmployee && i < EMPLOYEE_DATA.length; i++) {
                Address address = addressList.get(i);

                Employee employee = new Employee.Builder()
                        .id(Integer.parseInt(EMPLOYEE_DATA[i][0]))
                        .firstName(EMPLOYEE_DATA[i][1])
                        .lastName(EMPLOYEE_DATA[i][2])
                        .age(Integer.parseInt(EMPLOYEE_DATA[i][3]))
                        .employeeId(Integer.parseInt(EMPLOYEE_DATA[i][4]))
                        .deptName(EMPLOYEE_DATA[i][5])
                        .salary(new BigDecimal(EMPLOYEE_DATA[i][6]))
                        .address(address)
                        .build();

                employeeList.add(employee);
            }
        }
        return Optional.of(employeeList);
    }

    private static final String[][] EMPLOYEE_DATA = {
            {"201", "John", "Doe", "30", "1001", "Engineering", "75000"},
            {"202", "Jane", "Smith", "28", "1002", "Marketing", "65000"},
            {"203", "Michael", "Johnson", "35", "1003", "Sales", "85000"},
            {"204", "Emily", "Davis", "32", "1004", "HR", "70000"},
            {"205", "David", "Wilson", "40", "1005", "Finance", "90000"},
            {"206", "Sophia", "Martinez", "25", "1006", "Engineering", "60000"},
            {"207", "James", "Brown", "27", "1007", "IT", "72000"},
            {"208", "Olivia", "Garcia", "29", "1008", "Marketing", "68000"},
            {"209", "Liam", "Anderson", "31", "1009", "Sales", "82000"},
            {"210", "Charlotte", "Thomas", "33", "1010", "HR", "75000"},
            {"211", "William", "Harris", "29", "1011", "Engineering", "74000"},
            {"212", "Ava", "Clark", "26", "1012", "Marketing", "66000"},
            {"213", "Mason", "Lee", "34", "1013", "Sales", "83000"},
            {"214", "Isabella", "Walker", "31", "1014", "Finance", "91000"},
            {"215", "Ethan", "Hall", "38", "1015", "HR", "72000"},
            {"216", "Amelia", "Allen", "25", "1016", "IT", "70000"},
            {"217", "Alexander", "Young", "30", "1017", "Engineering", "78000"},
            {"218", "Mia", "Hernandez", "27", "1018", "Marketing", "69000"},
            {"219", "Jacob", "King", "33", "1019", "Sales", "80000"},
            {"220", "Harper", "Wright", "36", "1020", "Finance", "95000"},
            {"221", "Michael", "Scott", "32", "1021", "HR", "77000"},
            {"222", "Evelyn", "Green", "29", "1022", "Engineering", "76000"},
            {"223", "Logan", "Adams", "28", "1023", "Marketing", "67000"},
            {"224", "Ella", "Baker", "35", "1024", "Sales", "89000"},
            {"225", "Daniel", "Gonzalez", "31", "1025", "Finance", "92000"},
            {"226", "Aiden", "Nelson", "37", "1026", "HR", "70000"},
            {"227", "Scarlett", "Carter", "26", "1027", "IT", "68000"},
            {"228", "James", "Mitchell", "29", "1028", "Engineering", "75000"},
            {"229", "Lily", "Perez", "30", "1029", "Marketing", "64000"},
            {"230", "Matthew", "Roberts", "34", "1030", "Sales", "85000"},
            {"231", "Sofia", "Turner", "33", "1031", "Finance", "90000"},
            {"232", "Henry", "Phillips", "38", "1032", "HR", "74000"},
            {"233", "Aria", "Campbell", "27", "1033", "IT", "69000"},
            {"234", "Lucas", "Parker", "35", "1034", "Engineering", "77000"},
            {"235", "Grace", "Evans", "29", "1035", "Marketing", "68000"},
            {"236", "Jackson", "Edwards", "31", "1036", "Sales", "82000"},
            {"237", "Chloe", "Stewart", "30", "1037", "Finance", "95000"},
            {"238", "Wyatt", "Flores", "36", "1038", "HR", "76000"},
            {"239", "Zoey", "Simmons", "26", "1039", "IT", "70000"},
            {"240", "Owen", "Russell", "28", "1040", "Engineering", "78000"},
            {"241", "Victoria", "Ortiz", "35", "1041", "Marketing", "66000"},
            {"242", "Samuel", "Jenkins", "31", "1042", "Sales", "82000"},
            {"243", "Nora", "Bennett", "29", "1043", "Finance", "90000"},
            {"244", "Gabriel", "Gray", "32", "1044", "HR", "75000"},
            {"245", "Hannah", "Rivera", "27", "1045", "IT", "68000"},
            {"246", "Anthony", "Wood", "36", "1046", "Engineering", "74000"},
            {"247", "Eleanor", "Cole", "30", "1047", "Marketing", "69000"},
            {"248", "Isaac", "Cox", "34", "1048", "Sales", "83000"},
            {"249", "Ellie", "Howard", "33", "1049", "Finance", "91000"},
            {"250", "Joshua", "Ward", "39", "1050", "HR", "70000"}
    };
}
