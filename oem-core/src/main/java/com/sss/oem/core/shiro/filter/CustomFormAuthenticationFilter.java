package com.sss.oem.core.shiro.filter;

import net.sf.json.JSONObject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
* @ClassName: CustomFormAuthenticationFilter
* @Description: 自定义认证过滤器，继承shiro的认证过滤器，并重写父类的onAccessDenied(req, resp)方法
* @author: WangYiZhi
* @email: yizhi_wang@126.com
* @date: 2017年11月6日 上午10:16:27
* @version V1.0
*/
public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {

	private static final Logger log = LoggerFactory.getLogger(CustomFormAuthenticationFilter.class);

	/**
	 * 验证请求是否允许通过
	 */
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
		log.info("开始执行CustomFormAuthenticationFilter认证");
		Map<String, String> params = getRequestParameters((HttpServletRequest) request);
		if (checkReqFromInterfaceTest((HttpServletRequest) request, params)) {
			log.info("This request is from interface test.");
			return true;
		}

		boolean result = true;
		if (result) {
			result = super.isAccessAllowed(request, response, mappedValue)
					|| (!isLoginRequest(request, response) && isPermissive(mappedValue));
		}
		return result;
	}

	/**
	 * 请求验证未通过时的回调
	 */
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		log.info("请求未通过验证");
		boolean result = super.onAccessDenied(request, response);
		return result;
	}

	/**
	 * 判断请求是否来自于接口测试
	 *
	 * @param request
	 * @return
	 */
	public boolean checkReqFromInterfaceTest(HttpServletRequest request, Map<String, String> params) {

		/*HttpSession session = request.getSession();
		if (session.getAttribute(Const.SESSION_USER) != null) {
			log.info("The user has logged, without authentication.");
			return true;
		}*/

		// 获取请求签名
		String signature = params.get("signature");
		if (signature != null && signature.equals("INTERFACE_TEST")) {
			log.info("The request through signature authentication.");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 获取request的url中的参数
	 *
	 * @param request
	 *            页面请求
	 */
	public Map<String, String> getRequestParameters(HttpServletRequest request) {
		String urlParameter = request.getQueryString(); // 请求URL中的参数
		if (urlParameter != null && !"".equals(urlParameter)) {
			try {
				urlParameter = URLDecoder.decode(urlParameter, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		} else {
			urlParameter = "";
		}
		Map<String, String> map = new HashMap<String, String>();
		String[] arr = urlParameter.split("&");
		try {
			for (int i = 0; i < arr.length; i++) {
				String key = arr[i].substring(0, arr[i].indexOf("="));
				String value = arr[i].substring(arr[i].indexOf("=") + 1);
				map.put(key, value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			map.put("signature", "");
		}
		JSONObject obj = JSONObject.fromObject(map);
		log.info(">>>>>>>>>>>>>>>>>>>>Request map is: " + obj.toString());
		return map;
	}
}
