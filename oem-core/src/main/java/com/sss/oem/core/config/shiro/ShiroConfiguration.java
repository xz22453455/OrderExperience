package com.sss.oem.core.config.shiro;

import com.sss.oem.core.shiro.AuthRealm;
import com.sss.oem.core.shiro.filter.CustomFormAuthenticationFilter;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.SessionListener;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
* @ClassName: ShiroConfiguration 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月15日
*  
*/
@Configuration
public class ShiroConfiguration {
	
	@Bean
	public FilterRegistrationBean delegatingFilterProxy() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		DelegatingFilterProxy proxy = new DelegatingFilterProxy();
		proxy.setTargetFilterLifecycle(true);
		proxy.setTargetBeanName("shiroFilter");
		filterRegistrationBean.setFilter(proxy);
		return filterRegistrationBean;
	}	
 
    /**
     * ShiroFilterFactoryBean 处理拦截资源文件问题。
     * 注意：单独一个ShiroFilterFactoryBean配置是或报错的
     * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
     */
	@Bean("shiroFilter")
    public ShiroFilterFactoryBean shirFilter(@Qualifier("authRealm") AuthRealm authRealm) {
		SecurityManager manager = securityManager(authRealm);
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
 
        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(manager);
        
        //配置登录的url和登录成功的url
        shiroFilterFactoryBean.setLoginUrl("/");
        shiroFilterFactoryBean.setSuccessUrl("/main/index");
        shiroFilterFactoryBean.setUnauthorizedUrl("/errorPage/unauthorizedPage.html");
        
        //自定义拦截器
        Map<String, Filter> filtersMap = new LinkedHashMap<String, Filter>();
        filtersMap.put("authc", customFormAuthenticationFilter());
        
        shiroFilterFactoryBean.setFilters(filtersMap);
        
        //配置访问权限
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
 
        filterChainDefinitionMap.put("/index", "anon");
        filterChainDefinitionMap.put("/test/**", "anon");
        filterChainDefinitionMap.put("/login_toLogin", "anon");
        filterChainDefinitionMap.put("/login_login", "anon");
        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/config/**", "anon");
        filterChainDefinitionMap.put("/errorPage/**", "anon");
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/uploadFiles/**", "anon");
        filterChainDefinitionMap.put("/home/**", "anon");
        filterChainDefinitionMap.put("/**", "authc");
 
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
 
        return shiroFilterFactoryBean;
    }
	
	public CustomFormAuthenticationFilter customFormAuthenticationFilter() {
		CustomFormAuthenticationFilter customFormAuthenticationFilter = new CustomFormAuthenticationFilter();
		return customFormAuthenticationFilter;
	}
	
	@Bean
    public AuthRealm authRealm() {
        AuthRealm authRealm = new AuthRealm();
        authRealm.setCacheManager(ehCacheManager());
        return authRealm;
    }
	
	/**
     * 保证实现了Shiro内部lifecycle函数的bean执行
     * @return
     */
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }
 
    @Bean
    public SecurityManager securityManager(@Qualifier("authRealm") AuthRealm authRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(authRealm);
        securityManager.setSessionManager(sessionManager());
        securityManager.setCacheManager(ehCacheManager());
        return securityManager;
    }
 
    @Bean
    public SessionManager sessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        Collection<SessionListener> listeners = new ArrayList<SessionListener>();
        listeners.add(new MySessionListener());
        sessionManager.setSessionListeners(listeners);
        return sessionManager;
    }
 
    @Bean
    public EhCacheManager ehCacheManager() {
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManagerConfigFile("classpath:cache/ehcache-shiro.xml");
        return ehCacheManager;
    }
 
}