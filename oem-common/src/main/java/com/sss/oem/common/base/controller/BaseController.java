package com.sss.oem.common.base.controller;

import com.sss.oem.common.constant.Setting;
import com.sss.oem.common.utils.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @ClassName: BaseController
* @Description: TODO
* @author: WangYiZhi 
* @email: yizhi_wang@126.com
* @date: 2017年10月26日 上午11:26:31 
* @version V1.0  
*/ 
public class BaseController {

	protected LoggerUtils logger = LoggerUtils.getLogger(this.getClass());

	private static final long serialVersionUID = -4927116504609131384L;

	/**
	 * 得到PageData
	 */
	public PageData getPageData() {
		return new PageData(this.getRequest());
	}

	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}

	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();

		return request;
	}

	public static void logBefore(LoggerUtils logger, String interfaceName) {
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}

	public static void logAfter(LoggerUtils logger) {
		logger.info("end");
		logger.info("");
	}
	
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
        String fileLocal =  ExcelUtils.exportXlsExcel(map, excelFilePath, String.valueOf(System.currentTimeMillis()));
        FileUtils.downLoadFile(response, fileLocal, nowDate, false); //导出2003 excel
    }

}
