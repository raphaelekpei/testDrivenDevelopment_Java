package phoneNumberValidator;

public class PhoneNumberValidator {


    public boolean validate(String phoneNumber) {
        return phoneNumber.startsWith("+234") &&
                phoneNumber.length() == 14;
    }
}
