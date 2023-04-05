
package chapter10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		for(int n : numbers ) {
			System.out.println(n);
		}
		System.out.println("--------------------------------------------");
		Iterator<Integer> itr = numbers.iterator();
		
		while(itr.hasNext()) {
//			Integer integer = (Integer) itr.next();
//			System.out.println(itr.next());
			int num = itr.next();
			System.out.println(100 + num);
		}
		
		
		// Collection<E> List<E> ArrayList<E>
		// String 타입의 객체를 저장 >String 타입의 인스턴스를 참저하는 참조값을 저장
		ArrayList<String> list = new ArrayList<String>();

		// 인스턴스 저장 > 요소 저장 ,add()
		list.add("Jennie");
		list.add(new String("Rose"));
		list.add(new String("Jisoo"));

		// 데이터 참조 : get()
		for (int i = 0; i < 3; i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		// 특정 위치의 요소 삽입
		list.add(3, "Lisa");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		// 저장된 요소의 개수 : size()
		System.out.println("저장 된 이름의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size() - 1));

		// 반복문을 이용해서 일괄 처리
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " : " + list.get(i).charAt(0)); // 배열 내 첫글자를 출력

		}
		
		System.out.println("-----------------------------");
		// for each 문 String xx : 집합객체(배열 또는 컬렉션)
		for(String idolName : list) { 
			System.out.println(idolName+" : " + idolName.charAt(2));
			if(list.contains("Jennie")) {
				System.out.println("잘하자 !!!! 화이팅!!!");
			}
//			if(list.contains("Lisa")) {
//				// Lisa 하차 
//				list.remove("Lisa");
//			}
//			
		}System.out.println(list.isEmpty());
		
	}
}