package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void checkAmount(String orderId, String amount) {
        // 해당 주문번호의 최종 결제금액이 정말 amount와 일치하는지 확인하는 로직이 들어간다.

        boolean matched = true;

        // 만약 일치하지 않는다면, 예외를 발생시킨다.
        if (!matched) throw new RuntimeException("결제금액이 일치하지 않습니다.");
    }

    public void setPaymentComplete(String orderId) {
        // '주문 상태 확인' 이거는 쇼핑몰 로직마다 다르다.
        // orderId를 결제 완료 상태로 바꿔서 배송준비를 시킨다던지 이런 로직을 짜면 된다.
    }
}
