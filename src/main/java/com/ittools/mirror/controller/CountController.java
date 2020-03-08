package com.ittools.mirror.controller;

import com.ittools.mirror.common.ResponseResult;
import com.ittools.mirror.service.CountService;
import com.ittools.mirror.vo.CountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountController {

    @Autowired
    CountService countService;

    @GetMapping(value = "/count")
    public ResponseResult getLastCount(){
        return countService.getLastCount();
    }

    @PostMapping(value = "/count")
    public ResponseResult addCount(@RequestBody CountVo countVo){
        return countService.addNewCount(countVo);
    }
}
