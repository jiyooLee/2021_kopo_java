package kr.ac.kopo.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map: key, value의 쌍으로 구성된 데이터의 집합, 키에대한 중복(X), 순서(X)
 * 구현클래스 : HashMap, TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
		
		// key : ID, value : 비빌번호
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경서비스입니다");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ID [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 다릅니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		
		System.out.println("패스워드가 변경되었습니다");
		
		System.out.println("<< 전체 회원정보 출력 >>");
		/*
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> e : entrySet) {
			System.out.println("ID : " + e.getKey() + ", PASSWORD : " + e.getValue());
		}
		*/
		
		Set<String> keys =  map.keySet();
		for(String key : keys) {
			System.out.println("ID : " + key + ", PASSWORD : " + map.get(key));
		}
	}
}















