package phoneNumberValidator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest {

    public PhoneNumberValidator phoneNumberValidator;

    @BeforeEach
    void setUp(){
        phoneNumberValidator = new PhoneNumberValidator();
    }

    @Test
    public void phoneNumberValidatorObjectCanBeCreated(){
        assertNotNull(phoneNumberValidator);
    }
    @Test
    public void phoneNumberShouldStartWithNigeriaCallingCode(){
        // Given that I have a phone number
        String phoneNumber = "+2349093837491";
        // When I try to validate it
       boolean isValid = phoneNumberValidator.validate(phoneNumber);
        // Then
        assertTrue(isValid);

    }

    @Test
    public void phoneNumberLengthShouldNotBeMoreThan14(){
        // Given that I have a phoneNumber
        String phoneNumber = "+2349093837491";
        // When I try to validate it
       boolean isValid = phoneNumberValidator.validate(phoneNumber);
        // Then
        assertTrue(isValid);
    }

    @Test
    public void phoneNumberShouldHavePlusSign(){
        // Given that I have a phoneNumber
        String phoneNumber = "+2349093837491";
        // When I try to validate it
        boolean isValid = phoneNumberValidator.validate(phoneNumber);
        // Then
        assertTrue(isValid);
    }



}
