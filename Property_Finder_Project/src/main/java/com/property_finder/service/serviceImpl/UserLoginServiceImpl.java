package com.property_finder.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.UserLoginEntity;
import com.property_finder.service.UserLoginService;
@Service

public class UserLoginServiceImpl  implements UserLoginService {

	@Override
	public UserLoginEntity saveUserLoginEntity(UserLoginEntity userlogin2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validateRole(UserLoginEntity userlogin2) {
		// TODO Auto-generated method stub
		return null;
	}
 








//    @Autowired
//    private UserLoginRepo repo;
//    @Override
//    public UserLoginEntity saveUserLoginEntity(UserLoginEntity userlogin2) {
//        // TODO Auto-generated method stub
//        UserLoginEntity newuser=new UserLoginEntity();
//        newuser.setUserId(userlogin2.getUserId());
//        newuser.setUsername(userlogin2.getUsername());
//        newuser.setPassword(userlogin2.getPassword());
//        newuser.setRole(userlogin2.getRole());
//        newuser.setMobilenumber(userlogin2.getMobilenumber());
//        UserLoginEntity user=this.repo.save(newuser);
//        return user;
//    }
// 
//    @Override
//    public UserLoginEntity validateUserLoginEntity(Login login) {
//        // TODO Auto-generated method stub
//        UserLoginEntity user=this.repo.findById(login.getUserId()).orElse(null);
//        if(user!=null && user.getPassword().equals(login.getPassword()))
//            return user;
//        return null;
//    }
//    public String validateRole(UserLoginEntity userlogin2) {
//        //UserLoginEntity newuser=new UserLoginEntity();
//        String str="";
//        if(userlogin2.getRole()==UserLoginEntity.Role.CUSTOMER)
//            {
//             str="CUSTOMER logged in";
//            }
//        else {
//            str="OWNER logged in";
//        }
//        return str;
//    }
// 
}

