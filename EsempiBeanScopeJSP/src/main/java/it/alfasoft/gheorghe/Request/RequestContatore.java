package it.alfasoft.gheorghe.Request;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="contatore", eager=true)
//@RequestScoped
@SessionScoped
//@ApplicationScoped
//@FlowScoped(value="")
public class RequestContatore {

	private int cnt;
	
	public RequestContatore(){
		this.setCnt(0);
	}
	
	public void incrementa(){
		this.cnt++;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
