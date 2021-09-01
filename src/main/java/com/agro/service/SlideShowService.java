package com.agro.service;

import com.agro.pojo.Slideshow;

import java.util.List;

public interface SlideShowService {

    public int add(Slideshow slideshow);

    public List<Slideshow> selectAll();

    boolean delete(String id);
}
