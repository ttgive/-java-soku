package com.youku.soku.manage.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.youku.soku.manage.common.Constants;
import com.youku.soku.manage.torque.AuthPermission;
import com.youku.soku.manage.torque.User;

public class TopWordsAuthenticationInterceptor extends BaseManageAuthenticationInterceptor {


    public void destroy () {}

    public void init() {}

    public String intercept(ActionInvocation actionInvocation) throws Exception {

        Map session = actionInvocation.getInvocationContext().getSession();

        User user = (User) session.get(Constants.USER_KEY);

        boolean isAuthenticated = (null!=user);

        if (!isAuthenticated) {
            return Action.LOGIN;            
        }
        else {
        	Map<String, AuthPermission> permissionMap = (Map<String, AuthPermission>) session
			.get(Constants.PERMISSION_MAP_KEY);
        	
        	boolean isPermit = hasPermission(user, Constants.MANAGE_NEW_TOP, permissionMap);
        	
			if(isPermit) {
				String action = actionInvocation.invoke();
				System.out.println("action:"+action);
            	return action;
            } else {
            	return Constants.DENIED;
            }
        	
        }

    }

}
