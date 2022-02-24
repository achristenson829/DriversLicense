import java.util.Objects;

public class MissingNameException extends Exception{

       public MissingNameException(String nameType) {

            super(nameType);
    }
}
