import java.util.function.Predicate;

public class PhoneNumberValidator implements Predicate<String> {
    @Override
    public boolean test(String phoneNumber) {

        /*
        if((phoneNumber.startsWith("+62") && (phoneNumber == 13)){
            return true
        }

        return false;
         */

        //baris komentar tersebut bisa disederhanakan menjadi
        return phoneNumber.startsWith("+62") && phoneNumber.length() == 13;


    }
}
