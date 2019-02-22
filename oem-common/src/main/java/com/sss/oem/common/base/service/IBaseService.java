package com.sss.oem.common.base.service;

import com.baomidou.mybatisplus.service.IService;
import com.sss.oem.common.base.vo.DataTable;

/** 
* @ClassName: IBaseService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月18日
* 
* @param <T> 
*/
public interface IBaseService<T> extends IService<T> {

    /**
     * DateTable 分页查询
     *
     * @param dt
     * @return
     */
    DataTable<T> pageSearch(DataTable<T> dt);
}
