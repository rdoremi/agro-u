package com.agro.service;

import com.agro.pojo.Collect;
import com.agro.pojo.CourseVideo;

import java.util.List;

public interface CollectService {

    public boolean add(Collect collect);

    public List<CourseVideo> selectList(String userId);

    public boolean deleteById(String userId,String productionId);

    boolean checkCollect(String productionId,String userId);
}
