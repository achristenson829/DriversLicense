
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name >> ");
        String firstName = scanner.nextLine().toUpperCase();
        System.out.print("Enter middle initial >> ");
        String middleInitial = scanner.nextLine().toUpperCase();
        System.out.print("Enter last name >> ");
        String lastName = scanner.nextLine();
        System.out.print("Enter month of birth (1-12) >> ");
        int month = scanner.nextInt();
        System.out.print("Enter day of birth (1-31) >> ");
        int day = scanner.nextInt();
        System.out.print("Enter year of birth (YYYY) >> ");
        int year = scanner.nextInt();
        System.out.print("Male or Female M/F? >> ");
        char gendercode = scanner.next().toUpperCase().charAt(0);

        try {

            DriversLicense dLicense = new DriversLicense();
            FirstNameUtility f = new FirstNameUtility();
            dLicense.setFirstNameMiddleInitial(f.encodeFirstName(firstName, middleInitial));
            LastNameUtility l = new LastNameUtility();
            dLicense.setSoundexCode(l.encodeLastName(lastName));
            MonthDayGenderUtility m = new MonthDayGenderUtility();
            dLicense.setBirthMonthDayGender(m.encodeMonthDayGender(year, month, day, gendercode));
            dLicense.setBirthYear(year);
            dLicense.setOverflow(0);

            WisconsinFormatter wisconsinFormatter = new WisconsinFormatter();
            System.out.println(wisconsinFormatter.formatLicenseNumber(dLicense));
            FloridaFormatter formatter = new FloridaFormatter();
            System.out.println(formatter.formatLicenseNumber(dLicense));

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
