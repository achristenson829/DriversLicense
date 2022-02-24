public class UnknownGenderCodeException extends Exception{

    public UnknownGenderCodeException(char genderCode) {

        super(genderCode + " is not known");
    }
}
