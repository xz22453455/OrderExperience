package com.sss.oem.common.base.vo;

/** 
* @ClassName: PCAjaxVO 
* @Description: PC 的 ajax请求 封装
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月10日
*  
*/
public class PCAjaxVO {
	private Boolean success;
	private String code;
	private String message;

	public PCAjaxVO(Boolean success) {
		this.success = success;
	}

	public PCAjaxVO(Boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public Boolean isSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
