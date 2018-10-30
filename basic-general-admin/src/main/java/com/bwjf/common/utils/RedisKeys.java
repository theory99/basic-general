package com.bwjf.common.utils;

/**
 * @ClassName: RedisKeys
 * @Description: TODO redis keys
 * @author admin
 * @date 2018年10月30日
 */
public class RedisKeys {

	public static String getSysConfigKey(String key) {
		return "sys:config:" + key;
	}

	public static String getShiroSessionKey(String key) {
		return "sessionid:" + key;
	}
}
