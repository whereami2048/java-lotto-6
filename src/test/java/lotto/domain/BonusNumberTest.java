package lotto.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BonusNumberTest {
    @DisplayName("당첨 숫자가 1보다 낮을 경우 예외가 발생한다.")
    @Test
    void validateUnder() {
        //given
        int underBonusNumber = 0;
        //when
        //then
        assertThatThrownBy(() -> {
            BonusNumber bonusNumber = new BonusNumber(underBonusNumber);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 당첨 번호가 1보다 낮을 수 없습니다.");
    }

    @DisplayName("당첨 숫자가 45보다 높을 경우 예외가 발생한다.")
    @Test
    void validateUpper() {
        //given
        int upperBonusNumber = 46;
        //when
        //then
        assertThatThrownBy(() -> {
            BonusNumber bonusNumber = new BonusNumber(upperBonusNumber);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 당첨 번호가 45보다 높을 수 없습니다.");
    }
}