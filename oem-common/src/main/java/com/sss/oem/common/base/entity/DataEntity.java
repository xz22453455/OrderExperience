package com.sss.oem.common.base.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sss.oem.common.constant.Global;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/** 
* @ClassName: DataEntity 
* @Description: 数据Entity类
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月18日
* 
* @param <T> 
*/
public abstract class DataEntity<T extends Model> extends BaseEntity<T> {

    private static final long serialVersionUID = 1L;

    /**
     *  创建者
     */
    @TableField(value = "create_id", fill = FieldFill.INSERT)
    protected Long createId;

    /**
     * 创建日期
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    protected Date createDate;

    /**
     * 更新者
     */
    @TableField(value = "update_id", fill = FieldFill.INSERT_UPDATE)
    protected Long updateId;

    /**
     * 更新日期
      */
    @TableField(value = "update_date", fill = FieldFill.INSERT_UPDATE)
    protected Date updateDate;

    /**
     * 删除标记（Y：正常；N：删除；A：审核；）
     */
    @TableField(value = "del_flag")
    protected String delFlag;

    /**
     * 备注
     */
    protected String remark;


    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public DataEntity() {
        super();
        this.delFlag = Global.DEL_FLAG_NORMAL;

    }

    public DataEntity(Long id) {
        super(id);
    }


    /**
     * 更新之前执行方法，需要手动调用
     */
    @Length(min = 0, max = 500, message = "备注信息长度必须介于 1 和 500 之间")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @JsonIgnore
    @Length(min = 1, max = 1)
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

}
