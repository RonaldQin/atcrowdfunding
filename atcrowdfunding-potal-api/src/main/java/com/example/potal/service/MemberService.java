package com.example.potal.service;

import java.util.List;
import java.util.Map;

import com.example.bean.Member;

public interface MemberService {
    Member queryMemberlogin(Map<String, Object> paramMap);

    void updateAcctType(Member loginMember);

    void updateBasicinfo(Member loginMember);

    void updateEmail(Member loginMember);

    void updateAuthstatus(Member loginMember);

    Member getMemberById(Integer memberid);

    List<Map<String, Object>> queryCertByMemberid(Integer memberid);
}
