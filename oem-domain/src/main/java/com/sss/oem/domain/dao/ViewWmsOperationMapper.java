package com.sss.oem.domain.dao;

import com.sss.oem.domain.entity.ViewWmsOperation;
import com.sss.oem.domain.entity.ViewWmsOperationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ViewWmsOperationMapper {
    long countByExample(ViewWmsOperationCriteria example);

    int deleteByExample(ViewWmsOperationCriteria example);

    int insert(ViewWmsOperation record);

    int insertSelective(ViewWmsOperation record);

    List<ViewWmsOperation> selectByExampleWithRowbounds(ViewWmsOperationCriteria example, RowBounds rowBounds);

    List<ViewWmsOperation> selectByExample(ViewWmsOperationCriteria example);

    int updateByExampleSelective(@Param("record") ViewWmsOperation record, @Param("example") ViewWmsOperationCriteria example);

    int updateByExample(@Param("record") ViewWmsOperation record, @Param("example") ViewWmsOperationCriteria example);
}