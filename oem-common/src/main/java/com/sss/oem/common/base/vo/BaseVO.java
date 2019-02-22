package com.sss.oem.common.base.vo;

import java.io.Serializable;

/** 
* @ClassName: BaseVO 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月10日
*  
*/
public class BaseVO implements Serializable{

    private static final long serialVersionUID = -989209809168644953L;
    /**
     * 记录id
     */
    protected Long id;
    /**
     * 备注
     */
    protected String remark;

    /**
     * 删除标记
     */
    protected String delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
