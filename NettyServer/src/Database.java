
public class Database {
	
	public void login(String userID, String password) {
		
	}
	
	private OnLoginResult m_OnLoginResult = null;

	public OnLoginResult getOnLoginResult() {
		return m_OnLoginResult;
	}

	public void setOnLoginResult(OnLoginResult m_OnLoginResult) {
		this.m_OnLoginResult = m_OnLoginResult;
	}

}
