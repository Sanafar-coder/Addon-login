package day3.com;
import java.util.Date;

public class EncapsulationClass {
  private String username;
  private String password;
  private String email;
  private String address;
  private long phoneNo;
  private Date createdAt;
  private Date updatedAt;
  private boolean isActive;
  
  public String getUsername(){
	  return username;  
  }
  public void setUsername(String username) {
	this.username = username;
   }
   
  
  public String getPassword(){
	  return password;
  }
  public void setPassword(String password) {
	this.password = password;
   }
  
  
  public String getEmail(){
	  return email;  
  }
  public void setEmail(String email) {
	this.email = email;	
   }
  
  
  public long getPhoneno(){
	  return phoneNo;  
  }
  public void setPhoneno(long phoneNo) {
	this.phoneNo = phoneNo; 
   }
  
  
   public String getAddress() {
	   return address;
   }
	public void setAddress(String address) {
	this.address = address;
   }
    
	
	public Date getcreatedAt() {
		return createdAt;
	}
	public void setcreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Date getupdatedAt() {
		return updatedAt;
	}
	public void setupdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
  
	
	public boolean getisActive() {
		return isActive;
	}
	public void setisActive(boolean isActive) {
		this.isActive = isActive;
	}
}
