package com.ittools.mirror.service;

import com.ittools.mirror.common.ResponseResult;
import com.ittools.mirror.mapper.MirrorMapper;
import com.ittools.mirror.model.MirrorModel;
import com.ittools.mirror.vo.MirrorVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class MirrorService {

    @Autowired
    MirrorMapper mirrorMapper;

    public ResponseResult addMirror(MirrorVo mirrorVo){
        MirrorModel mirrorModel = new MirrorModel();
        Date now = new Date();
        mirrorModel.setCreatedAt(now);
        mirrorModel.setUpdatedAt(now);
        mirrorModel.setContent(mirrorVo.getContent());
        mirrorModel.setMaintainer(mirrorVo.getMaintainer());
        mirrorModel.setName(mirrorVo.getName());
        try{
            mirrorMapper.insert(mirrorModel);
            return new ResponseResult("insert ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }

    }
    public ResponseResult deleteMirror(long id){

        try{
            mirrorMapper.delete(id);
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
    public ResponseResult getMirror(){
        try{
            List<MirrorModel> mirrorModels = mirrorMapper.getAll();
            return new ResponseResult("ok",200,mirrorModels);
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
    public ResponseResult findMirrorById(long id){
        try{
            List<MirrorModel> mirrorModels = mirrorMapper.findById(id);
            if(mirrorModels.size()==0){
                return new ResponseResult("not found",203,new ArrayList());
            }
            return new ResponseResult("ok",200,mirrorModels);
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
    public ResponseResult modifyMirrorById(long id,MirrorVo mirrorVos){
        MirrorModel mirrorModel = new MirrorModel();
        Date now = new Date();
        mirrorModel.setUpdatedAt(now);
        mirrorModel.setName(mirrorVos.getName());
        mirrorModel.setContent(mirrorVos.getContent());
        mirrorModel.setMaintainer(mirrorVos.getMaintainer());
        mirrorModel.setId(id);
        try{
            mirrorMapper.update(mirrorModel);
            return new ResponseResult("ok",200,new ArrayList());
        }catch (Exception e){
            log.error("ERROR"+e);
            return new ResponseResult("internal error",504,new ArrayList());
        }
    }
}

