package round10.models;

import java.io.Serializable;

public class MyDTO implements Serializable {
	private String name;
	private int agel;
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAgel() {
		return agel;
	}
	public void setAgel(int agel) {
		this.agel = agel;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
