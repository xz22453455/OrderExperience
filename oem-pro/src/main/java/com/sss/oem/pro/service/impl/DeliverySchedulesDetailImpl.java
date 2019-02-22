/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DeliverySchedulesDetailImpl
 * Author:   Administrator
 * Date:     2019/2/21 0021 12:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.oem.pro.service.impl;

import com.sss.oem.domain.dao.DeliverySchedulesDetailMapper;
import com.sss.oem.domain.entity.DeliverySchedulesDetail;
import com.sss.oem.domain.entity.DeliverySchedulesDetailCriteria;
import com.sss.oem.pro.service.DeliverySchedulesDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/2/21 0021
 * @since 1.0.0
 */
public class DeliverySchedulesDetailImpl implements DeliverySchedulesDetailService {
    @Autowired
    DeliverySchedulesDetailMapper deliverySchedulesDetailMapper;
    @Override
    public List<DeliverySchedulesDetail> selectAll(DeliverySchedulesDetailCriteria deliverySchedulesDetailCriteria) {
        return deliverySchedulesDetailMapper.selectByExample(deliverySchedulesDetailCriteria);
    }

    @Override
    public DeliverySchedulesDetail selectByPrimaryKey(Integer Id) {
        return deliverySchedulesDetailMapper.selectByPrimaryKey(Id);
    }
}
