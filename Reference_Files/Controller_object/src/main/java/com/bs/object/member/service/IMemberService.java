package com.bs.object.member.service;

import com.bs.object.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	Member memberSearch(Member member);
	Member memberModify(Member member);
	void memberRemove(Member member);
}
