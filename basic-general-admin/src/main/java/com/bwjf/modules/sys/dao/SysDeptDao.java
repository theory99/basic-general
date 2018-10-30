package com.bwjf.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bwjf.modules.sys.entity.SysDeptEntity;

import java.util.List;

/**
* @ClassName: SysDeptDao
* @Description: TODO 部门管理
* @author admin
* @date 2018年10月30日
*
 */
public interface SysDeptDao extends BaseMapper<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     * @param parentId  上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);

}
