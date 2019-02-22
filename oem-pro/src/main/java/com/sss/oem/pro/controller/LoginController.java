//package com.sss.oem.web.controller;
//
//import BaseController;
//import ResponseMsgVO;
//import PageData;
//import net.sf.json.JSONArray;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.session.Session;
//import org.apache.shiro.subject.Subject;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @ClassName: LoginController
// * @Description: TODO
// * @author: WangYiZhi
// * @email: yizhi_wang@126.com
// * @date: 2017年10月26日 上午11:26:56
// * @version V1.0
// */
//@Controller
//public class LoginController extends BaseController {
//
//	@Resource(name = "userService")
//	UserService userService;
//
//	/**
//	 * @Title: login
//	 * @Description: 访问登录页面，并返回页面数据
//	 * @param: @return
//	 * @return: ModelAndView 返回类型
//	 * @throws:
//	 */
//	@RequestMapping(value = "/login_toLogin")
//	public ModelAndView login() {
//		ModelAndView mv = this.getModelAndView();
//		PageData pd = new PageData();
//		pd = this.getPageData();
////		logger.info("+++++++++++++++++++++++++ " + Tools.readTxtFile(Const.SYSNAME));
//		pd.put("SYSNAME", Tools.readTxtFile(Const.SYSNAME)); // 读取系统名称
//		mv.setViewName("admin/login");
//		mv.addObject("pd", pd);
//		return mv;
//	}
//
//	/**
//	 * @Title: login
//	 * @Description: 重定向到登录页面
//	 * @param: @return
//	 * @return: String 返回类型
//	 * @throws:
//	 */
//	@RequestMapping(value = "/redirect_login")
//	public String redirect_login() {
//		return "admin/login";
//	}
//
//	@RequestMapping(value = "/main/index")
//	public ModelAndView main() {
//		ModelAndView mv = this.getModelAndView();
//		PageData pd = new PageData();
//		pd = this.getPageData();
//		Subject currentUser = SecurityUtils.getSubject();
//		Session session = currentUser.getSession();
//		User user = (User) session.getAttribute(Const.SESSION_USER);
//		Set<Menu> menuList = (Set<Menu>) session.getAttribute(Const.SESSION_menuList);
//		JSONArray jsonarr = JSONArray.fromObject(menuList);
//		pd.put("CURRENTUSER", user);
//		pd.put("menuList", jsonarr.toString());
//		mv.setViewName("admin/mains");
//		mv.addObject("pd", pd);
//		return mv;
//	}
//
//	/**
//	 * @Title: login_in
//	 * @Description: 请求登录，验证用户
//	 * @param: @param
//	 *             sysUser
//	 * @param: @param
//	 *             response
//	 * @param: @return
//	 * @return: Msg 返回类型
//	 * @throws:
//	 */
//	@ResponseBody
//	@RequestMapping(value = "/login_login", method = RequestMethod.POST)
//	@SystemLog(moduleName = "系统管理", description = "用户登录")
//	public ResponseMsgVO login_login(@RequestBody User user, HttpServletRequest request, HttpServletResponse response) {
////		logger.info(">>>>>>>>>>>>>>>>用户信息： " + sysUser.getUserName() + " & " + sysUser.getUserPwd());
//
//		String account = user.getAccount();
//		String password = user.getPassword();
//
//		// 获取当前的Subject
//		Subject currentUser = SecurityUtils.getSubject();
//
//		/*
//		 * Session session = currentUser.getSession();
//		 * session.setAttribute(Const.SESSION_USER, sysUser);
//		 * session.setAttribute(Const.SESSION_USERNAME, sysUser.getUserName());
//		 */
//		//登陆成功为true
//		if (!currentUser.isAuthenticated()) {
//			UsernamePasswordToken token = new UsernamePasswordToken(account, password);
//			// token.setRememberMe(true);
//			try {
//				logger.info("对用户[" + account + "]进行登录验证..验证开始");
//
//				currentUser.login(token);
//
//				logger.info("对用户[" + account + "]进行登录验证..验证通过");
//			} catch (UnknownAccountException uae) {
//				logger.error("对用户[" + account + "]进行登录验证..验证未通过,未知账户");
//				return ResponseMsgVO.fail().add("authcMsg", "未知账户");
//			} catch (IncorrectCredentialsException ice) {
//				logger.error("对用户[" + account + "]进行登录验证..验证未通过,错误的凭证");
//				return ResponseMsgVO.fail().add("authcMsg", "对用户[" + account + "]进行登录验证..验证未通过,错误的凭证");
//			} catch (LockedAccountException lae) {
//				logger.error("对用户[" + account + "]进行登录验证..验证未通过,账户已锁定");
//				return ResponseMsgVO.fail().add("authcMsg", "对用户[" + account + "]进行登录验证..验证未通过,账户已锁定");
//			} catch (ExcessiveAttemptsException eae) {
//				logger.error("对用户[" + account + "]进行登录验证..验证未通过,错误次数过多");
//				return ResponseMsgVO.fail().add("authcMsg", "对用户[" + account + "]进行登录验证..验证未通过,错误次数过多");
//			} catch (AuthenticationException ae) {
//				// 通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景
//				logger.error("对用户[" + account + "]进行登录验证..验证未通过,堆栈轨迹如下");
//				ae.printStackTrace();
//				return ResponseMsgVO.fail().add("authcMsg", "对用户[" + account + "]进行登录验证..验证未通过,用户名或密码不正确");
//			}
//		}
//		return ResponseMsgVO.success().add("authcMsg", "用户[" + account + "]登录验证成功");
//
//		/*
//		 * SysUserExample sysUserExample = new SysUserExample(); Criteria
//		 * criteria = sysUserExample.createCriteria();
//		 * criteria.andUserNameEqualTo(sysUser.getUserName());
//		 * criteria.andUserPwdEqualTo(sysUser.getUserPwd()); boolean isExists =
//		 * sysUserService.isExists(sysUserExample); if (isExists) {
//		 * logger.info(">>>>>>>>>>>>>>>>用户存在！"); HttpSession session =
//		 * request.getSession(); session.setAttribute(Const.SESSION_USERNAME,
//		 * sysUser.getUserName()); //放入用户名 //
//		 * response.sendRedirect("admin/index"); //
//		 * request.getRequestDispatcher("admin/index").forward(request,
//		 * response); return Msg.success(); } else {
//		 * logger.info(">>>>>>>>>>>>>>>>用户不存在！"); return Msg.fail(); }
//		 */
//	}
//
//	/**
//	 * 用户注销
//	 *
//	 * @return
//	 */
//	@RequestMapping("/logout")
//	public ModelAndView logout() {
//
//		ModelAndView mv = this.getModelAndView();
//		PageData pd = new PageData();
//
//		// shiro管理的session
//		Subject currentUser = SecurityUtils.getSubject();
//		Session session = currentUser.getSession();
//
//		session.removeAttribute(Const.SESSION_USER);
//		session.removeAttribute(Const.SESSION_USERNAME);
//
//		// shiro销毁登录
//		// Subject subject = SecurityUtils.getSubject();
//		// subject.logout();
//		currentUser.logout();
//
//		pd = this.getPageData();
//
////		System.out.println("------------------------- " + Tools.readTxtFile(Const.SYSNAME));
//
//		pd.put("SYSNAME", Tools.readTxtFile(Const.SYSNAME)); // 读取系统名称
//		mv.setViewName("admin/login");
//		mv.addObject("pd", pd);
//		return mv;
//	}
//}
