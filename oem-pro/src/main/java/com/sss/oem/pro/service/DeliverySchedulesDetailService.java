package com.sss.oem.pro.service;

import com.sss.oem.domain.entity.DeliverySchedules;
import com.sss.oem.domain.entity.DeliverySchedulesCriteria;
import com.sss.oem.domain.entity.DeliverySchedulesDetail;
import com.sss.oem.domain.entity.DeliverySchedulesDetailCriteria;

import java.util.List;

/**
 * 〈说明〉<br>
 * 〈〉
 *
 * @author mao
 * @Date: 2019/2/21 0021
 * @Description:
 * @since 1.0.0
 */
public interface DeliverySchedulesDetailService {
    List<DeliverySchedulesDetail> selectAll(DeliverySchedulesDetailCriteria deliverySchedulesDetailCriteria);
    DeliverySchedulesDetail selectByPrimaryKey(Integer Id);
}
