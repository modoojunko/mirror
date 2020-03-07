package com.ittools.mirror.controller;

import com.ittools.mirror.common.ResponseResult;
import com.ittools.mirror.service.CountService;
import com.ittools.mirror.vo.CountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {

    @Autowired
    CountService countService;

    @RequestMapping(value = "/count",method = RequestMethod.GET)
    public ResponseResult getLastCount(){
        return countService.getLastCount();
    }

    @RequestMapping(value = "/count",method = RequestMethod.POST)
    public ResponseResult addCount(@RequestBody CountVo countVo){
        return countService.addNewCount(countVo);
    }
}
