package com.sss.oem.core.config.mybatisplus;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import com.sss.oem.common.utils.LoggerUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/** 
* @ClassName: SysMetaObjectHandler 
* @Description: MyBatis Plus自定义填充公共字段 ,即没有传的字段自动填充
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月18日
*  
*/
@Component
public class SysMetaObjectHandler extends MetaObjectHandler {

    private LoggerUtils logger = LoggerUtils.getLogger(this.getClass());

    //新增填充
    @Override
    public void insertFill(MetaObject metaObject) {
        logger.debug("insert set createTime createBy updateTime updateBy param");
//        Object createDate = metaObject.getValue("createDate");
//        Object createId = metaObject.getValue("createId");
//        Object updateDate = metaObject.getValue("updateDate");
//        Object updateId = metaObject.getValue("updateId");
//
//        if (null == createDate) {
//            metaObject.setValue("createDate", new Date());
//        }
//        if (null == createId) {
//            metaObject.setValue("createId", SlifeSysUser.id());
//        }
//        if (null == updateDate) {
//            metaObject.setValue("updateDate", new Date());
//        }
//        if (null == updateId) {
//            metaObject.setValue("updateId", SlifeSysUser.id());
//        }
    }

    //更新填充
    @Override
    public void updateFill(MetaObject metaObject) {
        logger.debug("update set  updateTime updateBy param");

//        metaObject.setValue("updateDate", new Date());
//        metaObject.setValue("updateId", SlifeSysUser.id());

    }
}
