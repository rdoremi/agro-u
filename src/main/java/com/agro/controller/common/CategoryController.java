package com.agro.controller.common;


import com.agro.result.ServerResponse;
import com.agro.pojo.Category;
import com.agro.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/label")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public ServerResponse add(Category category){

        Category rs = categoryService.add(category);
        if (rs==null){
            return ServerResponse.errorMsg("添加失败");
        }
        return ServerResponse.successMsg("添加成功");
    }
    @GetMapping("/getlist")
    public ServerResponse getList(){
        List<Category> list = categoryService.getList();
        return ServerResponse.success(list);
    }
    @GetMapping("/get")
    public ServerResponse get(String name){
        List<Category> list = categoryService.getByName(name);
        return ServerResponse.success(list);
    }
    @PostMapping("/update")
    public ServerResponse update(Category category){
        System.out.println(category);
        boolean rs = categoryService.update(category);
        return rs?ServerResponse.successMsg("修改成功"):ServerResponse.errorMsg("修改失败");
    }
    @GetMapping("/delete")
    public ServerResponse delete(Integer id){
        boolean b = categoryService.deleteById(id);
        return b?ServerResponse.successMsg("删除成功"):ServerResponse.errorMsg("删除失败");
    }

}
