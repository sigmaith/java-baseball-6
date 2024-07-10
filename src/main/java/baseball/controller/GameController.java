package baseball.controller;

import baseball.model.Computer;
import baseball.model.Judgement;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    final User user;
    private final Computer computer;
    private final Judgement judgement;

    public GameController(User user, Computer computer, Judgement judgement) {
        this.user = user;
        this.computer = computer;
        this.judgement = judgement;
    }

    public void gameStart() {
        OutputView.printGameStartMessage();
        computer.generateRandomNumber();
        judgement.clearCnt();

        while (judgement.getStrikeCnt() != 3) {
            String expectedNumberOfUser = InputView.getExpectedNumberOfUser();
            user.setUserInputNumber(expectedNumberOfUser);

            if (judgement.isNothing(user, computer)) {
                continue;
            } else {
                OutputView.printBallAndStrikeOrNothing(judgement.getBallCnt(), judgement.getStrikeCnt());
            }
        }

        OutputView.printGameEndMessage();
        gameRestartOrNot();
    }

    private void gameRestartOrNot() {
        String valueOfRestartGameOrNot = InputView.getValueOfRestartGameOrNot();
        if (valueOfRestartGameOrNot.equals("1")) {
            gameStart();
        }
    }
}
