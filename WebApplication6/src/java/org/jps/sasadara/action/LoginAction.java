/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jps.sasadara.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.jps.sasadara.model.User;
import org.jps.sasadara.service.LoginService;

/**
 *
 * @author sasadara_j
 */
public class LoginAction extends ActionSupport{
    private String userId;
    private String password;
    private User user;
    
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void validate(){
        if(StringUtils.isEmpty(user.getUserId())){
            addFieldError("user.userId","User ID cannot be blank");
        }
        if(StringUtils.isEmpty(user.getPassword())){
            addFieldError("user.password","Password cannot be blank");
        }
    } 
    public String execute(){
     LoginService loginService = new LoginService();
     if(loginService.verifyLogin(user)){
         return SUCCESS;
     }
     return LOGIN;   
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

   
}
