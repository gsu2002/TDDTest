package knu.ac.kr.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidatorTest {
    @Test
    public void 미니멈랭쓰가_지정값보다크면_테스트_성공(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        passwordValidator.validate(testPassword);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }
    @Test
    public void 맥시멈랭쓰가_지정값보다작으면_테스트_성공(){
        String testPassword = "adfgfgbf";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        passwordValidator.validate(testPassword);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }
    @Test
    public void 맥시멈랭쓰가_지정값보다작으면_테스트_실패() {
        String testPassword = "agbfhh";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        passwordValidator.validate(testPassword);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }
    @Test
    public void password가_null일때_실패() {
        String testPassword = null;
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        passwordValidator.validate(testPassword);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }
    @Test
    public void password가_empty_String일때_실패() {
        String testPassword = "";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        passwordValidator.validate(testPassword);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }
    @Test
    public void password가_ADMIN일때_성공() {
        String testPassword = "ADMIN";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        passwordValidator.validate(testPassword);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }
}
