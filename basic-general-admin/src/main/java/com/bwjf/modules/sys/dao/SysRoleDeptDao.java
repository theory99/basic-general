package com.bwjf.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bwjf.modules.sys.entity.SysRoleDeptEntity;

import java.util.List;

/**
 * 
 * @ClassName: SysRoleDeptDao
 * @Description: TODO 角色与部门对应关系
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysRoleDeptDao extends BaseMapper<SysRoleDeptEntity> {

	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
