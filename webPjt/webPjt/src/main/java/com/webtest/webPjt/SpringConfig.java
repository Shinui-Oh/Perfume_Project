package com.webtest.webPjt;

import com.webtest.webPjt.repository.MemberRepository;
import com.webtest.webPjt.repository.MemoryMemberRepository;
import com.webtest.webPjt.service.MemberService;
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
