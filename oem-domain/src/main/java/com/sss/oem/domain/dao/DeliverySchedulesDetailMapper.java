package com.sss.oem.domain.dao;

import com.sss.oem.domain.entity.DeliverySchedulesDetail;
import com.sss.oem.domain.entity.DeliverySchedulesDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DeliverySchedulesDetailMapper {
    long countByExample(DeliverySchedulesDetailCriteria example);

    int deleteByExample(DeliverySchedulesDetailCriteria example);

    int deleteByPrimaryKey(Integer dId);

    int insert(DeliverySchedulesDetail record);

    int insertSelective(DeliverySchedulesDetail record);

    List<DeliverySchedulesDetail> selectByExampleWithRowbounds(DeliverySchedulesDetailCriteria example, RowBounds rowBounds);

    List<DeliverySchedulesDetail> selectByExample(DeliverySchedulesDetailCriteria example);

    DeliverySchedulesDetail selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") DeliverySchedulesDetail record, @Param("example") DeliverySchedulesDetailCriteria example);

    int updateByExample(@Param("record") DeliverySchedulesDetail record, @Param("example") DeliverySchedulesDetailCriteria example);

    int updateByPrimaryKeySelective(DeliverySchedulesDetail record);

    int updateByPrimaryKey(DeliverySchedulesDetail record);
}