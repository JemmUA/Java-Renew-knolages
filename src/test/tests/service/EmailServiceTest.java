package tests.service;

import hilelll.tests.service.EmailService;
import org.junit.jupiter.api.*;
import hilelll.tests.exception.WrongEmailException;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    private EmailService emailService = new EmailService();

    @BeforeAll
    static void beforeAll() {
        System.out.println("Runs on the very beginning only!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Runs at the End! It's time for coffee :))");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Runs before each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Runs after each test");
    }

    @Test
    void validateIfEmailIsNull() {
        WrongEmailException wrongEmailException = assertThrows(
                WrongEmailException.class,
                () -> emailService.validate(null));
        System.out.println("Happy test");

        assertEquals("Email is empty or null", wrongEmailException.getMessage());
    }

    @Test
    void validateIfEmailIsEmpty() {
        WrongEmailException wrongEmailException = assertThrows(
                WrongEmailException.class,
                () -> emailService.validate(""));
        System.out.println("Happy test");

        assertEquals("Email is empty or null", wrongEmailException.getMessage());
    }

    @Test
    void validateIfCorrectMail() throws WrongEmailException {
        String mail = "alex@mail";
        boolean validation = emailService.validate(mail);
        assertTrue(validation, "Mail is not  correct");
    }
    @Test
    void validateIfIncorrectMail() throws WrongEmailException {
        String mail = "alex___mail";
        boolean validation = emailService.validate(mail);
        assertFalse(validation, "Mail  is  correct");
    }
}