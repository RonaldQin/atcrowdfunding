package com.example.manager.dao;

import java.util.List;

import com.example.bean.Cert;
import com.example.bean.MemberCert;

public interface CertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cert record);

    Cert selectByPrimaryKey(Integer id);

    List<Cert> selectAll();

    int updateByPrimaryKey(Cert record);

    List<Cert> queryCertByAccttype(String accttype);

    void insertMemberCert(MemberCert memberCert);
}