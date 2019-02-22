package com.sss.oem.common.constant;

/** 
* @ClassName: Setting 
* @Description: 系统的参数设置，后面要放到数据库和缓存中。
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月10日
*  
*/
public class Setting {
    /**
     * 文件根目录
     */
    public static final String BASEFLODER = "attach";

    /**
     * excel 目录
     */
    public static final String EXCELADDRESS = "excel";

    public static final String HASH_ALGORITHM = "SHA-1";	//SHA-1	MD5
    public static final int HASH_INTERATIONS = 1024;
    public static final int SALT_SIZE = 8;

}
