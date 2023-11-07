package lotto.exception;

import org.junit.jupiter.api.Test;

public enum ModelExceptionConstant {
    OUT_OF_LOTTO_NUMBER_RANGE("[ERROR] 로또 번호는 1부터 45사이의 숫자이어야 합니다."),
    NOT_DIVIDE_BY_LOTTO_PRICE("[ERROR] 로또 구입 금액이 로또 1장의 가격으로 나누어 떨어지지 않습니다."),
    UNDER_LOTTO_START_NUMBER("[ERROR] 당첨 번호가 1보다 낮을 수 없습니다."),
    UPPER_LOTTO_END_NUMBER("[ERROR] 당첨 번호가 45보다 높을 수 없습니다.");

    private final String text;
    ModelExceptionConstant(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
