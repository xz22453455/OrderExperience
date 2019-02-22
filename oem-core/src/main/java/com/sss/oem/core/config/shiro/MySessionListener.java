package com.sss.oem.core.config.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/** 
* @ClassName: MySessionListener 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月15日
*  
*/
@Component
public class MySessionListener implements SessionListener {

	private final AtomicInteger sessionCount = new AtomicInteger(0);

	@Override
	public void onStart(Session session) {
		sessionCount.incrementAndGet();
		System.out.println("登录+1==" + sessionCount.get());
	}

	@Override
	public void onStop(Session session) {
		sessionCount.decrementAndGet();
		System.out.println("登录退出-1==" + sessionCount.get());
	}

	@Override
	public void onExpiration(Session session) {
		sessionCount.decrementAndGet();
		System.out.println("登录过期-1==" + sessionCount.get());

	}

	public int getSessionCount() {
		return sessionCount.get();
	}
}