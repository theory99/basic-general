package com.bwjf.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bwjf.modules.sys.entity.SysConfigEntity;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @ClassName: SysConfigDao
 * @Description: TODO 系统配置信息
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysConfigDao extends BaseMapper<SysConfigEntity> {

	/**
	 * 根据key，查询value
	 */
	SysConfigEntity queryByKey(String paramKey);

	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("paramKey") String paramKey, @Param("paramValue") String paramValue);

}
