package com.caimao.service.impl;


import com.caimao.dao.AnalystDao;
import com.caimao.entity.AnalystEntity;
import com.caimao.service.AnalystService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("analystService")
public class AnalystServiceImpl implements AnalystService{

     @Autowired
     private AnalystDao analystDao;

     public int deleteByPrimaryKey(Integer id){
          return this.analystDao.deleteByPrimaryKey(id);
     }

     public int insertSelective(AnalystEntity record){
          return this.analystDao.insertSelective(record);
     }

     public AnalystEntity selectByPrimaryKey(Integer id){
          return this.analystDao.selectByPrimaryKey(id);
     }

     public int updateByPrimaryKeySelective(AnalystEntity record){
          return this.analystDao.updateByPrimaryKeySelective(record);
     }

     public List<AnalystEntity> queryAnalystlist(){
          return this.analystDao.queryAnalystlist();
     }
}
