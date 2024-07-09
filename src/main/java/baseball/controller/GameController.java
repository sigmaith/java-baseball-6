package baseball.controller;

import baseball.model.Computer;
import baseball.model.Judgement;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    private final User user;
    private final Computer computer;

    public GameController(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public void gameStart() {
        Judgement judgement = new Judgement();

        OutputView.printGameStartMessage();
        computer.generateRandomNumber();

        while (judgement.getStrikeCnt() != 3) {
            String userInput = InputView.getUserInput();
            user.setUserInputNumber(userInput);

            if (judgement.judgeNothing(user, computer)) continue;
            else OutputView.printBallAndStrikeOrNothing(judgement.getBallCnt(), judgement.getStrikeCnt());
        }

        OutputView.printGameEndMessage();
        gameRestartOrNot();
    }

    private void gameRestartOrNot(){
        String userInput = InputView.getUserInputRestartOrEnd();
        if (userInput.equals("1")) gameStart();
    }
}
