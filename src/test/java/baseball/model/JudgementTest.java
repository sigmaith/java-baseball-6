package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JudgementTest {
    @Test
    void 낫싱인지_아닌지_판단_1() {
        User user = new User();
        Computer computer = new Computer();
        Judgement judgement = new Judgement();
        List<Integer> randomNumber = new ArrayList<>(Arrays.asList(5, 6, 7));
        computer.setRandomNumber(randomNumber);
        user.setUserInputNumber("123");
        assertThat(judgement.judgeWhetherNothing(user, computer)).isEqualTo(true);
    }

    @Test
    void 낫싱인지_아닌지_판단_2() {
        User user = new User();
        Computer computer = new Computer();
        Judgement judgement = new Judgement();
        List<Integer> randomNumber = new ArrayList<>(Arrays.asList(2, 4, 5));

        computer.setRandomNumber(randomNumber);
        user.setUserInputNumber("123");

        assertThat(judgement.judgeWhetherNothing(user, computer)).isEqualTo(false);
    }

    @Test
    void 낫싱이_아닐때_볼과_스트라이크_개수_판단_1() {
        User user = new User();
        Computer computer = new Computer();
        Judgement judgement = new Judgement();
        List<Integer> randomNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        computer.setRandomNumber(randomNumber);
        user.setUserInputNumber("315");
        judgement.judgeWhetherNothing(user, computer);

        assertThat(judgement.getStrikeCnt()).isEqualTo(0);
        assertThat(judgement.getBallCnt()).isEqualTo(2);
    }

    @Test
    void 낫싱이_아닐때_볼과_스트라이크_개수_판단_2() {
        User user = new User();
        Computer computer = new Computer();
        Judgement judgement = new Judgement();
        List<Integer> randomNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        computer.setRandomNumber(randomNumber);
        user.setUserInputNumber("125");
        judgement.judgeWhetherNothing(user, computer);

        assertThat(judgement.getStrikeCnt()).isEqualTo(2);
        assertThat(judgement.getBallCnt()).isEqualTo(0);
    }

    @Test
    void 낫싱이_아닐때_볼과_스트라이크_개수_판단_3() {
        User user = new User();
        Computer computer = new Computer();
        Judgement judgement = new Judgement();
        List<Integer> randomNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        computer.setRandomNumber(randomNumber);
        user.setUserInputNumber("321");
        judgement.judgeWhetherNothing(user, computer);

        assertThat(judgement.getStrikeCnt()).isEqualTo(1);
        assertThat(judgement.getBallCnt()).isEqualTo(2);
    }

    @Test
    void 낫싱이_아닐때_볼과_스트라이크_개수_판단_4() {
        User user = new User();
        Computer computer = new Computer();
        Judgement judgement = new Judgement();
        List<Integer> randomNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        computer.setRandomNumber(randomNumber);
        user.setUserInputNumber("123");
        judgement.judgeWhetherNothing(user, computer);

        assertThat(judgement.getStrikeCnt()).isEqualTo(3);
        assertThat(judgement.getBallCnt()).isEqualTo(0);
    }
}