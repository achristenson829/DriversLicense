public class InvalidBirthdayException extends Exception{

    public InvalidBirthdayException(int year, int month, int day) {

        super("This date is invalid");
    }
}
