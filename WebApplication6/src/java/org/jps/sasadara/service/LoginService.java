/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jps.sasadara.service;

import org.jps.sasadara.model.User;

/**
 *
 * @author sasadara_j
 */
public class LoginService {
    public boolean verifyLogin(User user){
     if(user.getUserId().equals("userId") && user.getPassword().equals("password")){
         return true;
     }
     return false;
    }
    
}
