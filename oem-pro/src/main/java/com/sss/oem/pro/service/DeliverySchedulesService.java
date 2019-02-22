/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DeliverySchedulesService
 * Author:   Administrator
 * Date:     2019/2/20 0020 17:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.oem.pro.service;

import com.sss.oem.domain.entity.DeliverySchedules;
import com.sss.oem.domain.entity.DeliverySchedulesCriteria;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/2/20 0020
 * @since 1.0.0
 */
public interface DeliverySchedulesService {
    List<DeliverySchedules> selectAll(DeliverySchedulesCriteria deliverySchedulesCriteria);
    DeliverySchedules selectByPrimaryKey(Integer Id);
    List<DeliverySchedules> findById(String id);

}
