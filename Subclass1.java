public class subaccount_1 extends Account {
	private String password;
	
	public subaccount_1(String name, String id, String password) {
		super(name,id);
		this.password=password;
	}

@Override
public String ForgotPass() {
	return "Did you forgot your Passowrd?\nThis is your accout details please remember:\n";
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password=password;
}
} 
