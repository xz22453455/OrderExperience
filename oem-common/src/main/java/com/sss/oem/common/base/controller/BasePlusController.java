package com.sss.oem.common.base.controller;

import com.sss.oem.common.constant.Setting;
import com.sss.oem.common.utils.FileUtils;
import com.sss.oem.common.utils.LoggerUtils;
import com.sss.oem.common.utils.DateUtils;
import com.sss.oem.common.utils.ExcelUtils;

import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @ClassName: BasePlusController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月18日
*  
*/
public class BasePlusController {
	protected LoggerUtils logger = LoggerUtils.getLogger(this.getClass());


    /**
     * 导出信息
     * @param response   响应的请求
     * @param  excelTitle excel 标题
     * @param  arrayList 内容
     */
    public void ExceptInfo(HttpServletResponse response, String excelTitle, List<String[]> arrayList) throws ParseException {
        String excelFilePath = Setting.BASEFLODER + "/" + Setting.EXCELADDRESS;

        Map<String, List<String[]>> map = new HashMap();//导出excel 内容
        map.put(excelTitle, arrayList);

        String nowDate = DateUtils.formatDate(new Date(), "yyyyMMddHHmmss");
        String fileLocal=  ExcelUtils.exportXlsExcel(map, excelFilePath, String.valueOf(System.currentTimeMillis()));
        FileUtils.downLoadFile(response, fileLocal, nowDate, false); //导出2003 excel
    }
}
