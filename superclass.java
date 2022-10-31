public abstract class Account {
	protected String name;
	protected String id;
	
	public Account(String name, String id) {
		this.name=name;
		this.id=id;
	}
	
	public abstract String ForgotPass();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
}
