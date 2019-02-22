package com.sss.oem.common.base.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/** 
* @ClassName: BaseDao 
* @Description: DAO支持类实现
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月18日
* 
* @param <T> 
*/
public interface BaseDao<T> extends BaseMapper<T> {
	
     void insert(String tableName) ;
     
}
