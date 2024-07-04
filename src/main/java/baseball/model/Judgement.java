package baseball.model;

import java.util.List;
import java.util.Objects;

public class Judgement {
    private int strikeCnt;
    private int ballCnt;

    public Judgement() {
        strikeCnt = 0;
        ballCnt = 0;
    }

    public void judgeStrike(User user, Computer computer) {
        setStrikeCntZero();
        List<Integer> userNumber = user.getUserInputNumber();
        List<Integer> computerNumber = computer.getRandomNumber();
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(userNumber.get(i), computerNumber.get(i))) strikeCnt++;
        }
    }

    public void judgeBall(User user, Computer computer) {
        setBallCntZero();
        List<Integer> userNumber = user.getUserInputNumber();
        List<Integer> computerNumber = computer.getRandomNumber();
        for (int i = 0; i < 3; i++) {
            if (computerNumber.contains(userNumber.get(i)) && !Objects.equals(userNumber.get(i), computerNumber.get(i))) {
                ballCnt++;
            }
        }
    }

    public boolean judgeNothing(User user, Computer computer) {
        judgeStrike(user, computer);
        judgeBall(user, computer);
        if (strikeCnt == 0 && ballCnt == 0) return true;
        return false;
    }

    private void setStrikeCntZero() {
        strikeCnt = 0;
    }

    private void setBallCntZero() {
        ballCnt = 0;
    }
}
