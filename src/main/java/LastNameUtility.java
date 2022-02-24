import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {

    private Soundex soundex = new Soundex();

    public String encodeLastName(String lastName) throws MissingNameException{

        if (lastName.isBlank()) throw new MissingNameException("The last name cannot be blank");

        return soundex.encode(lastName);
    }
}
