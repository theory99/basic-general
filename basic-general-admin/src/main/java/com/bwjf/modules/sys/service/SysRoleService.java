package com.bwjf.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.bwjf.common.utils.PageUtils;
import com.bwjf.modules.sys.entity.SysRoleEntity;

import java.util.Map;


/**
 * 
* @ClassName: SysRoleService
* @Description: TODO 角色
* @author admin
* @date 2018年10月30日
*
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
