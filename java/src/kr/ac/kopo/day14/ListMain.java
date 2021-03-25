package kr.ac.kopo.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 	List : 순서(O), 중복(O)
 	구현클래스 : ArrayList, LinkedList
 	
 	주요메소드
 	- add()			: 데이터 입력
 	- get()			: 해당 인덱스에 있는 데이터 추출
 	- remove()		: 데이터 삭제
 	- size()		: 리스트의 전체 데이터 개수
 	- clear()		: 리스트의 전체데이터 삭제
 	- isEmpty()		: 리스트가 비어있는지 체크(true/false)
 	- contains()	: 특정데이터의 존재여부 판단(true/false)
 	- iterator()	: Iterator 객체를 반환
 */

public class ListMain {

	public static void main(String[] args) {
		
//		List list = new ArrayList();	// 1.5미만의 방식
//		List<String> list = new ArrayList<String>();	// 1.5버전의 Generic을 사용
//		List<String> list = new ArrayList<>();			// 1.7버전이후의 Generic방식
		List<String> list = new ArrayList<>();			// 1.7버전이후의 Generic방식
		
		System.out.println("리스트의 원소 총개수 : " + list.size());
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println("add 후 리스트의 원소 총개수 : " + list.size());
		
		list.add("one");
		System.out.println("add('one') 후 리스트의 원소 총개수 : " + list.size());
		
		/*
		 * list의 전체데이터 출력
		 * 1. index를 이용한 get() 메소드 이용
		 * 2. 1.5버전의 for문 이용
		 * 3. toArray() 메소드 이용
		 * 4. iterator() 메소드 이용
		 */
		
		System.out.println("< get() 메소드를 이용한 출력 >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("< 1.5버전의 for문 이용 출력 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("< toArray() 메소드 이용 출력 >");
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		/*
		 * Iterator(순환자) 주요 메소드
		 * -hasNext()	: 추출한 다음데이터의 존재여부 판단
		 * -next()		: 데이터추출
		 */
		
		System.out.println("< iterator() 메소드 이용 출력 >");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		String searchStr = "two";
		if(list.contains(searchStr)) {
			System.out.println(searchStr + "은 존재합니다");
		} else {
			System.out.println(searchStr + "은 존재하지 않습니다");
		}
		
		boolean bool = list.remove("two");
		System.out.println("remove : " + bool);
		if(list.contains(searchStr)) {
			System.out.println(searchStr + "은 존재합니다");
		} else {
			System.out.println(searchStr + "은 존재하지 않습니다");
		}
		bool = list.remove("two");
		System.out.println("remove : " + bool);
		
		System.out.println("첫번째 문자열 : " + list.get(0));
		String removeStr = list.remove(0);
		System.out.println("삭제된 문자열 : " + removeStr);
		System.out.println("remove(0) 후 첫번째 문자열 : " + list.get(0));
		
		System.out.println("원소 총개수 : " + list.size());
//		list.clear();
//		System.out.println("clear() 수행 후 원소 총개수 : " + list.size());
		
		List<String> sub = new LinkedList<>();
		sub.add("봄");
		sub.add("여름");
		
		list.addAll(sub);
		System.out.println("addAll() 후 원소의 개수 : " + list.size());
		
	}
	
}










