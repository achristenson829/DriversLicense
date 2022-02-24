import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender (int year, int month, int day, char genderCode) throws UnknownGenderCodeException,
            InvalidBirthdayException {
        if (genderCode != CODE_MALE && genderCode != CODE_FEMALE) throw new UnknownGenderCodeException(genderCode);

        SimpleDateFormat checkDate = new SimpleDateFormat("yyyy/MM/dd");
        String dateToCheck = String.format("%s/%s/%s",year, month, day);
        checkDate.setLenient(false);
        try {checkDate.parse(dateToCheck.trim());}
        catch (Exception e){
            throw new InvalidBirthdayException(year, month, day);}

        int genderModConstant = 0;
        if (genderCode == CODE_MALE)
            genderModConstant = MOD_MALE;
        else if (genderCode == CODE_FEMALE)
            genderModConstant = MOD_FEMALE;

        return (month -1)*40 + day + genderModConstant;
    }
}
