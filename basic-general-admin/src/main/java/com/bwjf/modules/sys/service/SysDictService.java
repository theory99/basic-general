package com.bwjf.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.bwjf.common.utils.PageUtils;
import com.bwjf.modules.sys.entity.SysDictEntity;

import java.util.Map;

/**
 * 
 * @ClassName: SysDictService
 * @Description: TODO 数据字典
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysDictService extends IService<SysDictEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
