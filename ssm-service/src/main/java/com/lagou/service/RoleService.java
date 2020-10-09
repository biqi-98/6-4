package com.lagou.service;

import com.lagou.domain.*;

import java.util.List;

public interface RoleService {

    /*
        查询所有角色（条件）
     */
    public List<Role>  findAllRole(Role role);

    /*
    根据角色ID查询该角色关联的菜单信息ID [1,2,3,5]
 */
    public List<Integer> findMenuByRoleId(Integer roleid);

    /*
        为角色分配菜单
     */
    public void roleContextMenu(RoleMenuVo roleMenuVo);

    /*
        为角色分配资源
     */
    public void roleContextResource(RoleResourceVo roleResourceVo);

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

}
