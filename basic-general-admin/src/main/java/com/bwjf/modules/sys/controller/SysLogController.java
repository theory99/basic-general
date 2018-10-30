package com.bwjf.modules.sys.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bwjf.common.utils.PageUtils;
import com.bwjf.common.utils.R;
import com.bwjf.modules.sys.service.SysLogService;

import java.util.Map;

/**
 * 
 * @ClassName: SysLogController
 * @Description: TODO 系统日志
 * @author admin
 * @date 2018年10月30日
 *
 */
@Controller
@RequestMapping("/sys/log")
public class SysLogController {
	@Autowired
	private SysLogService sysLogService;

	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("sys:log:list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = sysLogService.queryPage(params);

		return R.ok().put("page", page);
	}

}
