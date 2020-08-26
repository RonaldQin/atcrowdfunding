package com.example.manager.service;

import java.util.Map;

import com.example.bean.Advertisement;
import com.example.util.Page;

public interface AdvertService {

	int insertAdvert(Advertisement advert);

	Page queryPage(Map paramMap);
}
