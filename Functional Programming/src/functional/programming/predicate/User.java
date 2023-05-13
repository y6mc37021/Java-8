package functional.programming.predicate;

public class User {
	
	private String userName;
	private String password;
	private Long userId;
	public User(String userName, String password, Long userId) {
		super();
		this.userName = userName;
		this.password = password;
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", userId=" + userId + "]";
	}
	
	
	
	
}
