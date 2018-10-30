package com.bwjf.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bwjf.modules.sys.entity.SysMenuEntity;

import java.util.List;

/**
 * 
 * @ClassName: SysMenuDao
 * @Description: TODO 菜单管理
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

	/**
	 * 根据父菜单，查询子菜单
	 * 
	 * @param parentId
	 *            父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);

	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();

}
