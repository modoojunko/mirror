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


    @GetMapping(value = "/resource")
    public ResponseResult getAll(@RequestParam(value = "id",required = false) Long id){
        if(null!=id && id>0){
            return mirrorService.findMirrorById(id);
        }
        return mirrorService.getMirror();
    }

    @PutMapping(value = "/resource/{id}")
    public ResponseResult modifyById(@PathVariable(value = "id")long id,
                                     @RequestBody MirrorVo mirrorVo){
        return mirrorService.modifyMirrorById(id,mirrorVo);
    }

    @DeleteMapping(value = "/resource/{id}")
    public ResponseResult deleteMirror(@PathVariable(value = "id")long id){
        return mirrorService.deleteMirror(id);
    }

    @PostMapping(value = "/resource")
    public ResponseResult addMirror(@RequestBody MirrorVo mirrorVo){
        return mirrorService.addMirror(mirrorVo);
    }
}
