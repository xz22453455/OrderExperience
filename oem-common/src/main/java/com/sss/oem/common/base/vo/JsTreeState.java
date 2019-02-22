package com.sss.oem.common.base.vo;

import java.io.Serializable;

/** 
* @ClassName: JsTreeState 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月10日
*  
*/
public class JsTreeState implements Serializable {
	private static final long serialVersionUID = 8872587664256359256L;
	private Boolean opened = false;
	private Boolean disabled = false;
	private Boolean selected = false;

	public JsTreeState() {
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public Boolean getOpened() {
		return opened;
	}

	public void setOpened(Boolean opened) {
		this.opened = opened;
	}

}
