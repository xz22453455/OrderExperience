/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Login
 * Author:   Administrator
 * Date:     2019/2/20 0020 14:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.oem.pro.controller;

import com.sss.oem.common.base.controller.BaseController;
import com.sss.oem.domain.entity.DeliverySchedules;
import com.sss.oem.domain.entity.DeliverySchedulesCriteria;
import com.sss.oem.domain.entity.DeliverySchedulesDetail;
import com.sss.oem.pro.service.DeliverySchedulesDetailService;
import com.sss.oem.pro.service.DeliverySchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/2/20 0020
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "test")
public class Login extends BaseController {
    @Autowired
    DeliverySchedulesService deliverySchedulesService;

    @RequestMapping(value = "sendNum/{id}", method = RequestMethod.GET)
    public List<DeliverySchedules> selectDeliverySchedules(@PathVariable("id") Integer id) {
        DeliverySchedulesCriteria deliverySchedulesCriteria = new DeliverySchedulesCriteria();
        deliverySchedulesCriteria.createCriteria().andDCustomernoEqualTo(String.valueOf(id));
        return deliverySchedulesService.selectAll(deliverySchedulesCriteria);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<DeliverySchedules> selectDeliverySchedules() {
        DeliverySchedulesCriteria deliverySchedulesCriteria = new DeliverySchedulesCriteria();
        return deliverySchedulesService.selectAll(deliverySchedulesCriteria);
    }
    @RequestMapping(value = "findbyid/{id}", method = RequestMethod.GET)
    public List<DeliverySchedules> selectDeliverySchedulesbyid(@PathVariable("id") String id) {
        return deliverySchedulesService.findById(id);
    }

}
