package baseball.view;

import baseball.exception.InputException;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String GET_USER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_RESTART_OR_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String getUserInput(){
        System.out.println(GET_USER_INPUT_MESSAGE);
        String userInput = Console.readLine();
        return InputException.isThreeDifferentDigits(userInput);
    }

    public static String getUserInputRestartOrEnd(){
        System.out.println(GAME_RESTART_OR_END_MESSAGE);
        String userInput = Console.readLine();
        return userInput; // InputException 거치도록 수정
    }
}
