package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("10% 할인")
    void vip_o() {
        //given
        Member vip = new Member(1L, "Vip", Grade.VIP);
        //when
        int discount = discountPolicy.discount(vip, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("10% 할인 X")
    void vip_x() {
        //given
        Member vip = new Member(1L, "Vip", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(vip, 10000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}