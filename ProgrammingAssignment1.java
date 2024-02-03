import java.util.Arrays;
import java.util.List;

public class Main2023CSE001 {

    public static void main(String[] args) {
        String[] registrationNumbers = {
            "2023BCS001",
            "2023BIT002",
            "2023BCH003",
            "2023BME004",
            "2023BEL005"
        };

        int validCount = getValidRegistrationsCount(registrationNumbers);
        System.out.println("Count of valid registration numbers: " + validCount);
    }

    public static int getValidRegistrationsCount(String[] registrationNumbers) {
        List<String> validDepartments = Arrays.asList("BCS", "BIT", "BCH", "BME");
        int validCount = 0;

        for (String regNumber : registrationNumbers) {
            if (isValidRegistrationNumber(regNumber, validDepartments)) {
                validCount++;
            }
        }

        return validCount;
    }

    private static boolean isValidRegistrationNumber(String regNumber, List<String> validDepartments) {
        if (regNumber.length() != 10) {
            // Invalid length
            return false;
        }

        String department = regNumber.substring(4, 7);

        return validDepartments.contains(department);
    }
}
