package baseball.exception;

public class InputException {
    private static final int USER_INPUT_SIZE = 3;

    public static String isValidInput(String userInput) {
        if (!userInput.matches("[1-9]{3}")) {
            throw new IllegalArgumentException();
        }
        if (userInput.chars().distinct().count() != USER_INPUT_SIZE) {
            throw new IllegalArgumentException();
        }
        return userInput;
    }

    public static String isOneOrTwo(String userInput) {
        if (!userInput.matches("[1-2]{1}")) throw new IllegalArgumentException();
        return userInput;
    }
}

