package com.bwjf.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bwjf.modules.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 
 * @ClassName: SysUserRoleDao
 * @Description: TODO 用户与角色对应关系
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {

	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
