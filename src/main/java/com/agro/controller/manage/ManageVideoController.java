package com.agro.controller.manage;


import com.agro.result.ServerResponse;
import com.agro.service.VideoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage/video")
public class ManageVideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/get_no_check")
    public ServerResponse getNoChecklist(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "limit",defaultValue = "20") int limit){
        PageInfo noCheckList = videoService.getNoCheckList(page, limit);
        return ServerResponse.success(noCheckList);
    }
}
