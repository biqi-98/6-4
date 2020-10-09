package com.lagou.controller;

import com.lagou.domain.ResourceCategory;
import com.lagou.domain.ResponseResult;
import com.lagou.service.ResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ResourceCategory")
public class ResourceCategoryController {

    @Autowired
    private ResourceCategoryService resourceCategoryService;

    @RequestMapping("/findAllResourceCategory")
    public ResponseResult findAllResourceCategory(){
        List<ResourceCategory> allResourceCategory = resourceCategoryService.findAllResourceCategory();

        return  new ResponseResult(true,200,"查询所有分类信息成功",allResourceCategory);

    }

    //添加& 修改资源分类接口
    @RequestMapping("/saveOrUpdateResourceCategory")
    public ResponseResult saveOrUpdateResourceCategory(@RequestBody ResourceCategory resourceCategory){
        ////新增
        //{
        //	name: "作业管理",
        //	sort: 1
        //}
        //
        ////修改
        //{
        //    id: 10,
        //    name: "家庭作业管理",
        //    sort: "2"
        //}
        if(resourceCategory.getId() == null){
            //新增
            resourceCategoryService.saveResourceCategory(resourceCategory);
            return  new ResponseResult(true,200,"新增分类信息成功",null);
        }else {
            resourceCategoryService.updateResourceCategory(resourceCategory);
            return  new ResponseResult(true,200,"更新分类信息成功",null);
        }

    }

    //删除资源分类接口
    @RequestMapping("/deleteResourceCategory")
    public ResponseResult deleteResourceCategory(Integer id){

        resourceCategoryService.deleteResourceCategory(id);

        ResponseResult responseResult = new ResponseResult(true, 200, "删除资源分类成功", null);

        return responseResult;

    }




}
