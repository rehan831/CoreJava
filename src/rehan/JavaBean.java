package rehan;
import java.io.Serializable;

public class JavaBean implements Serializable {
	
	public static void main(String[] args) {
        JavaBean rehan = new JavaBean();
        rehan.setUserId("ANIKET12");
        rehan.setUserName("Rehanansari");
       String user_Id = rehan.getUserName();
        
       System.out.println(user_Id);
        System.out.println(rehan);
        
        
    }
	
	
	   private String userId;
	   private String userName;
	    private String acountNo;
	    //setter method 
	    
	    public void setUserId(String userId){
	        this.userId = userId;
	    }
	    public void setUserName(String userName){
	        this.userName = userName;
	    }
	    //getter name
	    public String getUserId(){
	        return userId;
	        
	    }
	    public String getUserName(){
	        return userName;
	    }
	    
	    
	    @Override
		public String toString() {
			return "JavaBean [userId=" + userId + ", userName=" + userName + "]";
		}
		
	}


