package com;
 
/**
 * 
 * @author tayron
 *
 */
public class User {
	
    /**
     * 
     */
    private String userName;
    
    /**
     * 
     */
    private String email;
    
	/**
	 * 
	 */
    public User(){
 
    }
 
    /**
     * 
     * @param userName
     * @param email
     */
    public User(String userName, String email){
        this.userName = userName;
        this.email = email;
    }
 
    /**
     * 
     * @return
     */
    public String getUserName() {
        return userName;
    }
 
    /**
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    /**
     * 
     * @return
     */
    public String getEmail() {
        return email;
    }
 
    /**
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
 
    /**
     * 
     */
    @Override
    public String toString() {
        return getUserName();
    }
}
