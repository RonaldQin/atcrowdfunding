package com.example.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Cert;
import com.example.bean.MemberCert;
import com.example.manager.dao.CertMapper;
import com.example.manager.service.CertService;

@Service
public class CertServiceImpl implements CertService {

    @Autowired
    private CertMapper certMapper;

    @Override
    public List<Cert> queryAllCert() {
        return certMapper.selectAll();
    }

    @Override
    public List<Cert> queryCertByAccttype(String accttype) {
        return certMapper.queryCertByAccttype(accttype);
    }

    @Override
    public void saveMemberCert(List<MemberCert> certimgs) {
        for (MemberCert memberCert : certimgs) {
            certMapper.insertMemberCert(memberCert);
        }
    }

}
