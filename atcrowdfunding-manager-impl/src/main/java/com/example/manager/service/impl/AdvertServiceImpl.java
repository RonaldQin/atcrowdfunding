package com.example.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Advertisement;
import com.example.bean.User;
import com.example.manager.dao.AdvertisementMapper;
import com.example.manager.service.AdvertService;
import com.example.util.Page;

@Service
public class AdvertServiceImpl implements AdvertService {

    @Autowired
    private AdvertisementMapper advertisementMapper;

    @Override
    public int insertAdvert(Advertisement advert) {
        return advertisementMapper.insert(advert);
    }

    @Override
    public Page queryPage(Map paramMap) {
        Page advertPage = new Page((Integer) paramMap.get("pageno"), (Integer) paramMap.get("pagesize"));

        Integer startIndex = advertPage.getStartIndex();
        paramMap.put("startIndex", startIndex);
        List<User> datas = advertisementMapper.pageQuery(paramMap);
        advertPage.setDatas(datas);

        Integer totalsize = advertisementMapper.queryCount(paramMap);
        advertPage.setTotalsize(totalsize);

        return advertPage;
    }
}
