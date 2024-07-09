package baseball.view;

public class OutputView {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";

    public static void printGameStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printGameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }

    public static void printBallAndStrikeOrNothing(int ballCnt, int strikeCnt) {
        if (ballCnt == 0 && strikeCnt == 0) {
            System.out.println(NOTHING);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ballCnt != 0) sb.append(ballCnt).append(BALL).append(" ");
        if (strikeCnt != 0) sb.append(strikeCnt).append(STRIKE);
        System.out.println(sb);
    }

}
