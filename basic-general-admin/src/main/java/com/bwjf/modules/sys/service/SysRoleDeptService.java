package com.bwjf.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.bwjf.modules.sys.entity.SysRoleDeptEntity;

import java.util.List;

/**
 * 
 * @ClassName: SysRoleDeptService
 * @Description: TODO 角色与部门对应关系
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysRoleDeptService extends IService<SysRoleDeptEntity> {

	void saveOrUpdate(Long roleId, List<Long> deptIdList);

	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
