package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;


class MemberInfo {
	private Member m;
	private Car c;
	
	MemberInfo(Member m, Car c) {
		this.m = m;
		this.c = c;
	}
}

class Test {
	
	public Object[] returnTest() {
		
		Member m = new Member();
		Car c = new Car();
		
		Object[] arr = new Object[2];
		arr[0] = m;
		arr[1] = c;
		
		return arr;
	}
	
	public Map<String, Object>  returnTest2() {
		
		Member m = new Member();
		Car c = new Car();
		
		Map<String, Object> map = new HashMap<>();
		map.put("member", m);
		map.put("car", c);
		
		return map;
	}
	public MemberInfo returnTest3() {
		
		Member m = new Member("aaa", "111");
		Car c = new Car("bbb", "ccc");
		
		MemberInfo info = new MemberInfo(m, c);
		
		return info;
	}
}

class Member {
	private String name;
	private String phone;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	
	

	/*
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		Member mem = (Member)obj;
		
		if(name.equals(mem.name) && phone.equals(mem.phone)) {
			result = true;
		}
		
		return result;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + phone.hashCode();
	}
	*/
	
	
}

class Car {
	private String name;
	private String id;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
	
		Map<Member, Car> carList = new HashMap<Member, Car>();
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "12소1212"));
		carList.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "34가6354"));
		carList.put(new Member("박길동", "010-5555-6666"), new Car("그랜저", "26도4623"));
		carList.put(new Member("강길동", "010-7777-8888"), new Car("카니발", "81고3456"));
		
		System.out.println("등록대수 : " + carList.size());
		
		carList.put(new Member("홍길동", "010-8888-9999"), new Car("SM3", "25다3434"));
		System.out.println("등록대수 : " + carList.size());
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("제네시스", "42너3524"));
		System.out.println("등록대수 : " + carList.size());
		
	
		
		
		
		/*
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m2)) {
			System.out.println("같은 사람입니다.");
		} else {
			System.out.println("다른 사람입니다");
		}
		*/
	}
	
}













