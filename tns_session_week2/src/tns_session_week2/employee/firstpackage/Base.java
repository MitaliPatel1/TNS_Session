package tns_session_week2.employee.firstpackage;

public class Base {
	int defaultvar=12 ;
	public String publicvar="public";
	private float privatevar=34.5f;
	protected long protectedvar = 4567L;

	 int getDefaultvar() {
		return defaultvar;
	}

	 void setDefaultvar(int defaultvar) {
		this.defaultvar = defaultvar;
	}

	public String getPublicvar() {
		return publicvar;
	}

	public void setPublicvar(String publicvar) {
		this.publicvar = publicvar;
	}

	private float getPrivatevar() {
		return privatevar;
	}

	private void setPrivatevar(float privatevar) {
		this.privatevar = privatevar;
	}

	protected long getProtectedvar() {
		return protectedvar;
	}

	protected  void setProtectedvar(long protectedvar) {
		this.protectedvar = protectedvar;
	}
	
	
	
	

}
