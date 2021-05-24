package kr.ac.kopo.day16;

import java.io.Serializable;

// VO : Value Object
public class UserVO implements Serializable {
	private String name;
	private int age;
	private String phone;
	private String addr;
	
	public UserVO() {
		super();
	}

	public UserVO(String name, int age, String phone, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + ", phone=" + phone + ", addr=" + addr + "]";
	}
	
	
}
