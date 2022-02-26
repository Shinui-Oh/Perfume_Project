package com.bs.controller.member.service;

import com.bs.controller.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	void memberSearch(Member member);
	Member[] memberModify(Member member);
	void memberRemove(Member member);
}
