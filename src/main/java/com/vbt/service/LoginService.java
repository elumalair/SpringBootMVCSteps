package com.vbt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	private static List<String> todos = new ArrayList<String>();
	
    static {
        todos.add("Next1"); 
        todos.add("Next2"); 
        todos.add("Next5"); 
        todos.add("maha");
        todos.add("Next9"); 
    }
    
	public static boolean validateLoggedinUser(String username, String password) {
		boolean isValid = username!=null && username.equalsIgnoreCase("maha") && 
				password!=null && password.equalsIgnoreCase("kumar");
		System.out.println(" isValid :"+ isValid);
		return isValid;
	}
	  
    public List<String> retrieveData(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        for (String todo : todos) {
            if (todo.equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return todos;//filteredTodos;
    }

}
