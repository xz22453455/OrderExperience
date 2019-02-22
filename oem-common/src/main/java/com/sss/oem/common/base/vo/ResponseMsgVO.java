package com.sss.oem.common.base.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ResponseMsgVO
 * @Description: 服务端响应消息类
 * @author: WangYiZhi
 * @email: yizhi_wang@126.com
 * @date: 2017年10月26日 上午11:31:48
 * @version V1.0
 */
public class ResponseMsgVO {
	private int code; // 200: 代表成功 201: 代表失败
	private String msg;
	private Map<String, Object> extend = new HashMap<String, Object>();

	public static ResponseMsgVO success() {
		ResponseMsgVO result = new ResponseMsgVO();
		result.setCode(200);
		result.setMsg("处理成功");
		return result;
	}

	public static ResponseMsgVO fail() {
		ResponseMsgVO result = new ResponseMsgVO();
		result.setCode(201);
		result.setMsg("处理失败");
		return result;
	}

	public static ResponseMsgVO fail(int code, String object) {
		ResponseMsgVO result = new ResponseMsgVO();
		result.setCode(code);
		result.setMsg(object);
		return result;
	}

	public ResponseMsgVO add(String key, Object value) {
		this.getExtend().put(key, value);
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
}
