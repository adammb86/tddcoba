import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PhoneNumberValidatorTest {
    private PhoneNumberValidator pnValidator;

    @BeforeEach
    void setUp() {
        pnValidator = new PhoneNumberValidator();
    }

    //uji benar
    @Test
    void checkValidateNumberTrue() {
        //given
        String phoneNumber = "+628130000000";

        //when
        boolean isValidNumber = pnValidator.test(phoneNumber);

        //then
        MatcherAssert.assertThat(isValidNumber, Matchers.is(true));
    }

    //uji salah
    @Test
    void checkValidateNumberFalse() {
        //given
        String phoneNumber = "+6181300000000";

        //when
        boolean isValidNumber = pnValidator.test(phoneNumber);

        //then
        MatcherAssert.assertThat(isValidNumber, Matchers.is(false));
    }
}
