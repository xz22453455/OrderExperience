package com.sss.oem.core.shiro;

import com.sss.oem.common.constant.Setting;
import com.sss.oem.common.utils.LoggerUtils;
import com.sss.oem.domain.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/** 
* @ClassName: AuthRealm 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author WangYiZhi yizhi_wang@126.com 
* @date 2018年1月10日
*  
*/
public class AuthRealm extends AuthorizingRealm {
	
//	@Resource
//	private UserService userService;
//
//	@Resource
//	private MenuService menuService;
//
//	@Resource
//	private ButtonService buttonService;

    private LoggerUtils logger= LoggerUtils.getLogger(this.getClass());

    @Autowired
    public void setCacheManager(EhCacheManager ehCacheManager) {
        super.setCacheManager(ehCacheManager);
    }

    /**
     * 设定密码校验的Hash算法与迭代次数
     */
    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(Setting.HASH_ALGORITHM);
        matcher.setHashIterations(Setting.HASH_INTERATIONS);
        setCredentialsMatcher(matcher);
        logger.info("---------密码校验器  -matcher----------------");
    }

    /**
     * 认证回调函数,登录时调用.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
    	UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		//User user = userService.getUserByAccount(token.getUsername());
		User user = new User();
		if (user == null) {
			return null;
		}
		//盐值
		ByteSource credentialsSalt = ByteSource.Util.bytes(user.getAccount());
		AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getAccount(), user.getPassword(), credentialsSalt,
				this.getName());
//		this.setSession(Const.SESSION_USER, user);
//		this.setSession(Const.SESSION_USERNAME, user.getName());
//		Set<Menu> menuSet = menuService.getMenuPermByUserId(user.getId());
//		List<Button> btnIds = buttonService.getBtnPermByUserId(user.getId());
//		this.setSession(Const.SESSION_menuList, menuSet);
//		this.setSession(Const.SESSION_btnIds, btnIds);
		return authcInfo;
    }

    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("登录授权");
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		return simpleAuthorInfo;
    }
    
    private void setSession(Object key, Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}

}