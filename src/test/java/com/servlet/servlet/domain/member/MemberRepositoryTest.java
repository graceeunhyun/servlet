package com.servlet.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.servlet.servlet.basic.domain.member.Member;
import com.servlet.servlet.basic.domain.member.MemberRepository;

public class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }
    @Test
    void save() {
        //given
        Member member = new Member("hello", 20);

        //when
        memberRepository.save(member);

        //then
        Member member1 = memberRepository.findById(member.getId());
        Assertions.assertThat(member1).isEqualTo(member);
    }
}
