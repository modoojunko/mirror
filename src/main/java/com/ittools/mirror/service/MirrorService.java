package com.ittools.mirror.service;

import com.ittools.mirror.common.ResponseResult;
import com.ittools.mirror.model.MirrorModel;
import com.ittools.mirror.vo.MirrorVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class MirrorService {
    public ResponseResult addMirror(MirrorVo mirrorVo){

        try{
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }

    }
    public ResponseResult deleteMirror(long id){

        try{
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
    public ResponseResult getMirror(){
        try{
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
    public ResponseResult findMirrorById(long id){
        try{
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
    public ResponseResult modifyMirrorById(long id,MirrorVo mirrorVos){
        try{
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
}

