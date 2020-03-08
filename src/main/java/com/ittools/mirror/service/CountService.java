package com.ittools.mirror.service;

import com.ittools.mirror.common.ResponseResult;
import com.ittools.mirror.mapper.CountMapper;
import com.ittools.mirror.model.CountModel;
import com.ittools.mirror.vo.CountVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class CountService {

    @Autowired
    CountMapper countMapper;

    public ResponseResult addNewCount(CountVo countVo){
        CountModel countModel = new CountModel();
        Date now = new Date();
        countModel.setCreatedAt(now);
        countModel.setUpdatedAt(now);
        countModel.setTotalSize(countVo.getTotalSize());
        countModel.setTotalUserNum(countVo.getTotalUserNum());
        countModel.setTotalVisitTime(countVo.getTotalVisitTime());
        countModel.setAvgSpeed(countVo.getAvgSpeed());
        try{
            countMapper.insert(countModel);
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR:"+e);
            return new ResponseResult("internal error:" + e,504,new ArrayList());
        }
    }

    public ResponseResult getLastCount(){
        try{
            List<CountModel> countModels = countMapper.getLatest();
            return new ResponseResult("ok",200,countModels);
        }catch (Exception e){
            return new ResponseResult("internal error"+e,504,new ArrayList());
        }
    }
}
