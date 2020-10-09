package com.lagou.dao;

import com.lagou.domain.*;

import java.util.List;

public interface RoleMapper {

    /*
        查询所有角色&条件进行查询
     */

    public List<Role> findAllRole(Role role);


    /*
        根据角色ID查询该角色关联的菜单信息ID [1,2,3,5]
     */
    public List<Integer> findMenuByRoleId(Integer roleid);


    /*
        根据roleid清空中间表的关联关系
     */
    public void deleteRoleContextMenu(Integer rid);


    /*
        为角色分配菜单信息
     */
    public void roleContextMenu(Role_menu_relation role_menu_relation);

    /*
        删除角色
     */

    public void deleteRole(Integer roleid);

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

    /*
        根据roleid清空中间表的关联关系
     */
    public void deleteRoleContextResource(Integer rid);


    /*
        为角色分配资源信息
     */
    public void roleContextResource(RoleResourceRelation roleResourceRelation);


}
