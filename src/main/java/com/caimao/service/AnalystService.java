package com.caimao.service;


import com.caimao.entity.AnalystEntity;

import java.util.List;

public interface AnalystService {
     int deleteByPrimaryKey(Integer id);

     int insertSelective(AnalystEntity record);

     AnalystEntity selectByPrimaryKey(Integer id);

     int updateByPrimaryKeySelective(AnalystEntity record);

     List<AnalystEntity> queryAnalystlist();
}
