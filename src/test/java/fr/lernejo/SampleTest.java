package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;

class SampleTest {
    @Test
    void neg_number_exception_on_fact() {
        Sample sample = new Sample();
        int neg = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(neg));
    }
    @Test
    void pos_num_works() {
        Sample sample = new Sample();
        int pos = 2;
        int result = sample.fact(pos);
        Assertions.assertThat(result).as("factorial 2")
            .isEqualTo(2);
    }
    @Test
    void multiplication_two_neg_pos() {
        Sample sample = new Sample();
        int result = sample.op(MULT, -1, -1);
        Assertions.assertThat(result).as("multiplication of two negative numbers")
            .isEqualTo(1);
    }
    @Test
    void multiplication_by_zero() {
        Sample sample = new Sample();
        int result = sample.op(MULT, 2349085, 0);
        Assertions.assertThat(result).as("multiplication by zero")
            .isEqualTo(0);
    }
    @Test
    void addition_neg_numbers() {
        Sample sample = new Sample();
        int result = sample.op(ADD, -4, -3);
        Assertions.assertThat(result).as("multiplication by zero")
            .isEqualTo(-7);
    }
}
