package com.bwjf.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.bwjf.common.utils.PageUtils;
import com.bwjf.modules.sys.entity.SysLogEntity;

import java.util.Map;

/**
 * 
 * @ClassName: SysLogService
 * @Description: TODO 系统日志
 * @author admin
 * @date 2018年10月30日
 *
 */
public interface SysLogService extends IService<SysLogEntity> {

	PageUtils queryPage(Map<String, Object> params);

}
