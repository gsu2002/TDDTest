package knu.ac.kr.passwordvalidator;

public class PasswordValidator {
    private int minLength;
    private int maxLength;

    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validate(String password){
        if(password == null)
            return false;

        if(password == "")
            return false;

        if(password.compareToIgnoreCase("ADMIN") == 0)
            return false;

        int length = password.length();

        if(length < minLength)
            return false;

        if(length > maxLength)
            return false;



        return true;
    }

    public static void main(String[] args) {
        PasswordValidator passwordVaildator = new PasswordValidator(5, 10);
        boolean result = passwordVaildator.validate("abcdd");
        System.out.println(result);
    }
}
