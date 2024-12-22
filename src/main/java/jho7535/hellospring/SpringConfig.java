package jho7535.hellospring;

import jho7535.hellospring.repository.MemberRepository;
import jho7535.hellospring.repository.MemoryMemberRepository;
import jho7535.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
