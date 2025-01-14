package hello.core.member.impl;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;

public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
