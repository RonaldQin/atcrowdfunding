package com.example.manager.service;

import java.util.List;

import com.example.bean.Cert;
import com.example.bean.MemberCert;

public interface CertService {
    List<Cert> queryAllCert();

    List<Cert> queryCertByAccttype(String accttype);

    void saveMemberCert(List<MemberCert> certimgs);
}
