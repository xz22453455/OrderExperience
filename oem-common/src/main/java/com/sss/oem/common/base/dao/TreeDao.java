package com.sss.oem.common.base.dao;

import com.sss.oem.common.base.entity.TreeEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/** 
* @ClassName: TreeDao 
* @Description: 树型结构的DAO支持类实现
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月18日
* 
* @param <T> 
*/
@Component
public interface TreeDao<T extends TreeEntity<T>> extends CrudDao<T> {

    /**
     * 找到所有子节点
     * @param entity
     * @return
     */
     List<T> findByParentIdsLike(T entity);

    /**
     * 更新所有父节点字段
     * @param entity
     * @return
     */
     int updateParentIds(T entity);

}