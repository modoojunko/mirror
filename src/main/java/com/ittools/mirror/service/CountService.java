package com.ittools.mirror.service;

import com.ittools.mirror.common.ResponseResult;
import com.ittools.mirror.vo.CountVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountService {

    public ResponseResult addNewCount(CountVo countVo){
        try{
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            return new ResponseResult("internal error:" + e,504,new ArrayList());
        }
    }

    public ResponseResult getLastCount(){
        try{
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            return new ResponseResult("internal error"+e,504,new ArrayList());
        }
    }
}
