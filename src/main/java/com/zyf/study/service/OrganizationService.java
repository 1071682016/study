package com.zyf.study.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganizationService {

    List<JSONObject> selectList();

}
