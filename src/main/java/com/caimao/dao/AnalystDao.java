package com.caimao.dao;


import com.caimao.entity.AnalystEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnalystDao {
     int deleteByPrimaryKey(Integer id);

     int insertSelective(AnalystEntity record);

     AnalystEntity selectByPrimaryKey(Integer id);

     int updateByPrimaryKeySelective(AnalystEntity record);

     List<AnalystEntity> queryAnalystlist();
}
