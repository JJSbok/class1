package org.zerock.bj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/todo/")
public class TodoController {
    

    //list
@GetMapping("list")
public void list(){
    log.info("list");
}

@GetMapping("add")
public void add(){
    log.info("Add");
}

@PostMapping("add")
public String addPost(){
    log.info("Add Post........");
    return "redirect:/todo/list";
}

// @PathVariable 은 메서드 인자에 사용되어 URI 템플릿 변수의 값을 메서드 인자로 할당하는데 사용된다.

@GetMapping("/read/{tno}")
public String read(@PathVariable("tno")Long tno){
    return "/todo/read";
}

@GetMapping("modify/{tno}")
public String modify(@PathVariable("tno")Long tno){
    return "/todo/modify";
}

@PostMapping("remove")
public String removePost(){
    log.info("remove Post");
    return "redirect:/todo/list";
}

@PostMapping("modify/{tno}")
public String modifyPost(@PathVariable("tno")Long tno){
    log.info("modify Post");
    return "redirect:/todo/read/" + tno;
}

}
