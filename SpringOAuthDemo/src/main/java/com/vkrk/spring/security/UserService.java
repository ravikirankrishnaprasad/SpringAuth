package com.vkrk.spring.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	List<String> userNames=Arrays.asList("Ravikiran","Ravi","Kiran","VKRK");
	
	public boolean getUserName(String userName) {
		for(String usrName:userNames) {
			if(usrName.equals(userName)) {
				return true;
			}
		}
		return false;
	}
}
