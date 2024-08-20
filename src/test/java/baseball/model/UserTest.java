package baseball.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @Test
    void setUserInputNumber_메서드를_여러번_호출했을때_잘_저장되는지_확인() {
        User user = new User();
        user.setUserInputNumber("123");
        user.setUserInputNumber("456");
        user.setUserInputNumber("789");
        assertThat(user.getUserInputNumber()).containsExactly(7, 8, 9);

        user.setUserInputNumber("185");
        assertThat(user.getUserInputNumber()).containsExactly(1, 8, 5);
    }
}