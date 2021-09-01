package com.agro.dao.mapper;

import com.agro.dao.BaseMapper;
import com.agro.pojo.SysPermission;

import java.util.List;

public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    List<SysPermission> selectListByUserId(Long id);
}