package baseball.exception;

public class InputException {
    private static final int EXPECTED_USER_INPUT_SIZE = 3;

    public static String isExpectedNumberOfUserValid(String expectedNumberofUser) {
        if (!expectedNumberofUser.matches("[1-9]{3}")) {
            throw new IllegalArgumentException();
        }
        if (expectedNumberofUser.chars().distinct().count() != EXPECTED_USER_INPUT_SIZE) {
            throw new IllegalArgumentException();
        }
        return expectedNumberofUser;
    }

    public static String isValueOfRestartGameOrNotValid(String userInput) {
        if (!userInput.matches("[1-2]{1}")) throw new IllegalArgumentException();
        return userInput;
    }
}

