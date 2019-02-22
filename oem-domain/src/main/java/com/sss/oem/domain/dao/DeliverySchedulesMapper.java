package com.sss.oem.domain.dao;

import com.sss.oem.domain.entity.DeliverySchedules;
import com.sss.oem.domain.entity.DeliverySchedulesCriteria;
import com.sss.oem.domain.entity.DeliverySchedulesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DeliverySchedulesMapper {
    long countByExample(DeliverySchedulesCriteria example);

    int deleteByExample(DeliverySchedulesCriteria example);

    int deleteByPrimaryKey(Integer dId);

    int insert(DeliverySchedulesWithBLOBs record);

    int insertSelective(DeliverySchedulesWithBLOBs record);

    List<DeliverySchedulesWithBLOBs> selectByExampleWithBLOBsWithRowbounds(DeliverySchedulesCriteria example, RowBounds rowBounds);

    List<DeliverySchedulesWithBLOBs> selectByExampleWithBLOBs(DeliverySchedulesCriteria example);

    List<DeliverySchedules> selectByExampleWithRowbounds(DeliverySchedulesCriteria example, RowBounds rowBounds);

    List<DeliverySchedules> selectByExample(DeliverySchedulesCriteria example);

    DeliverySchedulesWithBLOBs selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") DeliverySchedulesWithBLOBs record, @Param("example") DeliverySchedulesCriteria example);

    int updateByExampleWithBLOBs(@Param("record") DeliverySchedulesWithBLOBs record, @Param("example") DeliverySchedulesCriteria example);

    int updateByExample(@Param("record") DeliverySchedules record, @Param("example") DeliverySchedulesCriteria example);

    int updateByPrimaryKeySelective(DeliverySchedulesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DeliverySchedulesWithBLOBs record);

    int updateByPrimaryKey(DeliverySchedules record);
    List<DeliverySchedules> findById(String id);

}