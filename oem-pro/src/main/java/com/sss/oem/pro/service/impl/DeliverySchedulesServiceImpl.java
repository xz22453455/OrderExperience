/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DeliverySchedulesServiceImpl
 * Author:   Administrator
 * Date:     2019/2/20 0020 18:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.oem.pro.service.impl;

import com.sss.oem.domain.dao.DeliverySchedulesMapper;
import com.sss.oem.domain.entity.DeliverySchedules;
import com.sss.oem.domain.entity.DeliverySchedulesCriteria;
import com.sss.oem.pro.service.DeliverySchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/2/20 0020
 * @since 1.0.0
 *
 */
@Service
public class DeliverySchedulesServiceImpl implements DeliverySchedulesService {
    @Autowired
    DeliverySchedulesMapper deliverySchedulesMapper;

    @Override
    public List<DeliverySchedules> selectAll(DeliverySchedulesCriteria deliverySchedulesCriteria) {
        List<DeliverySchedules> deliverySchedules = deliverySchedulesMapper.selectByExample(deliverySchedulesCriteria);
        return deliverySchedules;

    }

    @Override
    public DeliverySchedules selectByPrimaryKey(Integer Id) {
        return deliverySchedulesMapper.selectByPrimaryKey(Id);
    }

    @Override
    public List<DeliverySchedules> findById(String id) {
        List<DeliverySchedules> byId = deliverySchedulesMapper.findById(id);
        return byId;
    }
}
