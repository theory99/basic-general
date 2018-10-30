package com.bwjf.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.bwjf.modules.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 
 * @ClassName: SysUserRoleService
 * @Description: TODO 用户与角色对应关系
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {

	void saveOrUpdate(Long userId, List<Long> roleIdList);

	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
