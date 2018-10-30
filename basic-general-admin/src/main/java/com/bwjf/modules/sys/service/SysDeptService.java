package com.bwjf.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.bwjf.modules.sys.entity.SysDeptEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: SysDeptService
 * @Description: TODO 部门管理
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysDeptService extends IService<SysDeptEntity> {

	List<SysDeptEntity> queryList(Map<String, Object> map);

	/**
	 * 查询子部门ID列表
	 * 
	 * @param parentId
	 *            上级部门ID
	 */
	List<Long> queryDetpIdList(Long parentId);

	/**
	 * 获取子部门ID，用于数据过滤
	 */
	List<Long> getSubDeptIdList(Long deptId);

}
