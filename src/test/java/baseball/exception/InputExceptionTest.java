package baseball.exception;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class InputExceptionTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "1", "23", "1234", "132983", "234534523462", "23463475373563856",
    "2234265437567687567569876086076867856", "34565865565788"})
    void expectedNumberOfUser_값의_길이가_3이_아닐때의_유효성_검증(String expectedNumberofUser) {

       assertThatThrownBy(() ->
               InputException.isExpectedNumberOfUserValid(expectedNumberofUser))
               .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"112", "122", "323", "555", "131"})
    void expectedNumberOfUser_값에_동일한_숫자가_포함됐을때_유효성_검증(String expectedNumberOfUser) {

        assertThatThrownBy(() ->
                InputException.isExpectedNumberOfUserValid(expectedNumberOfUser))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"110", "102", "023", "050", "000"})
    void expectedNumberOfUser_값에_0이_포함됐을때_유효성_검증(String expectedNumberOfUser) {

        assertThatThrownBy(() ->
                InputException.isExpectedNumberOfUserValid(expectedNumberOfUser))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"11\\", "er4", "@!#%", "adfewkrt", "qwetvcasf"})
    void expectedNumberOfUser_값에_숫자가_아닌_값이_포함됐을때_유효성_검증(String expectedNumberOfUser) {

        assertThatThrownBy(() ->
                InputException.isExpectedNumberOfUserValid(expectedNumberOfUser))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "3", "@!4", "1245", "qwet!@#vcasf", "@#$^&"})
    void valueOfReastartGameOrNot_값이_1이나_2가_아닐때_유효성_검증(String expectedNumberOfUser) {

        assertThatThrownBy(() ->
                InputException.isValueOfRestartGameOrNotValid(expectedNumberOfUser))
                .isInstanceOf(IllegalArgumentException.class);
    }
}