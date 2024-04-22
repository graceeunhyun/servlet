package com.servlet.servlet.domain.member;

import java.util.List;

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

    @Test
    void findAll() {
        //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);

        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member> result = memberRepository.findAll();

        //then
        Assertions.assertThat(result.size()).isEqualTo(2);
    }
}
