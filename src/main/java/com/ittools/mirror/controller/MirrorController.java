package com.ittools.mirror.controller;

import com.ittools.mirror.common.ResponseResult;
import com.ittools.mirror.service.MirrorService;
import com.ittools.mirror.vo.MirrorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class MirrorController {

    @Autowired
    MirrorService mirrorService;


    @RequestMapping(value = "/resource",method = RequestMethod.GET)
    public ResponseResult getAll(@RequestParam(value = "id",required = false) Long id){
        if(null!=id && id>0){
            return mirrorService.findMirrorById(id);
        }
        return mirrorService.getMirror();
    }

    @RequestMapping(value = "/resource/{id}", method = RequestMethod.PUT)
    public ResponseResult modifyById(@PathVariable(value = "id")long id,
                                     @RequestBody MirrorVo mirrorVo){
        return mirrorService.modifyMirrorById(id,mirrorVo);
    }

    @RequestMapping(value = "/resource/{id}",method = RequestMethod.DELETE)
    public ResponseResult deleteMirror(@PathVariable(value = "id")long id){
        return mirrorService.deleteMirror(id);
    }

    @RequestMapping(value = "/resource",method = RequestMethod.POST)
    public ResponseResult addMirror(@RequestBody MirrorVo mirrorVo){
        return mirrorService.addMirror(mirrorVo);
    }
}
