package hello.core;

import hello.core.discount.impl.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.impl.MemberServiceImpl;
import hello.core.member.impl.MemoryMemberRepository;
import hello.core.order.impl.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderServiceImpl orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }
}
