package com.ittools.mirror.controller;

import com.ittools.mirror.service.MirrorService;
import com.ittools.mirror.vo.MirrorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MirrorWebController {

    @Autowired
    MirrorService mirrorService;

    @RequestMapping("/index")
    public String mirrorList(Model model){
        model.addAttribute("mirrors",mirrorService.getMirror());
        return "list";
    }

    @RequestMapping("/add")
    public String addMirror(){
        return "add";
    }

    @RequestMapping("/save")
    public String saveI(@ModelAttribute MirrorVo mirrorVo, Model model){

        mirrorService.addMirror(mirrorVo);
        model.addAttribute("mirrors",mirrorService.getMirror());
        return "list";
    }
}
