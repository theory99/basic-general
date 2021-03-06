package com.bwjf.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bwjf.modules.sys.entity.SysRoleMenuEntity;

import java.util.List;

/**
 * 
 * @ClassName: SysRoleMenuDao
 * @Description: TODO 角色与菜单对应关系
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {

	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
