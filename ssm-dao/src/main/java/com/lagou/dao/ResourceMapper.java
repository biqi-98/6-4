package com.lagou.dao;

import com.lagou.domain.Resource;
import com.lagou.domain.ResourceCategory;
import com.lagou.domain.ResourseVo;

import java.util.List;

public interface ResourceMapper {


    /*（
        资源分页&多条件查询
     */

    public List<Resource> findAllResourceByPage(ResourseVo resourseVo);

    /**
     * 获取角色资源分类
     * @param id
     * @return
     */
    public List<ResourceCategory> findResourceCategoryByRoleId(Integer id);

    /**
     * 获取角色资源
     * @param id
     * @return
     */
    public List<Resource> findResourceByRoleId(Integer id);


}
