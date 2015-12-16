package com;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

 
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
 
@ManagedBean(name="userMB")
@RequestScoped
public class UserMB {
 
    private User user;
    @SuppressWarnings("rawtypes")
	private Map users;
 
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public UserMB(){
        users = new HashMap();
        users.put("Name 01", new User("Name 01", "Email 01"));
        users.put("Name 02", new User("Name 02", "Email 02"));
        users.put("Name 03", new User("Name 03", "Email 03"));
        users.put("Name 04", new User("Name 04", "Email 04"));
        users.put("Name 05", new User("Name 05", "Email 05"));
    }
 
    public String showName(){
        return "show.xhtml";
    }
 
    public Date getServerTime(){
        return new Date();
    }
 
    public User getUser() {
        return user;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
 
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public List getUsers() {
        return new ArrayList(users.values());
    }
 
    public User getUserByName(String userName){
        return (User) users.get(userName);
    }
}