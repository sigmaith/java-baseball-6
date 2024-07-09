package baseball;

import baseball.controller.GameController;
import baseball.model.Computer;
import baseball.model.User;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        User user = new User();
        Computer computer = new Computer();

        GameController gameController = new GameController(user, computer);
        gameController.gameStart();
    }
}
