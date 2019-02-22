package com.sss.oem.web; /**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: OemApplication
 * Author:   Administrator
 * Date:     2019/2/18 0018 10:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/2/18 0018
 * @since 1.0.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.sss.oem"})
@MapperScan("com.sss.oem.domain.")
public class OEMApplication {
    public static void main(String[] args) {
        SpringApplication.run(OEMApplication.class, args);
    }
}
