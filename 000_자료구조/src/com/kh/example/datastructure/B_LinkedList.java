package com.kh.example.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * 연결리스트(LinkedList)
 * - List의 구현 클래스로 인접 참조를 링크하여 체인처럼 관리한다.
 * - 각 노드(Node)가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식의 자료구조로써 데이터를 가지는 노드들이 연결되어 있어 노드의 포인터가 이전 노드와 다음 노드와의 연결을 담당한다. 
 * - 중간에 객체를 추가하거나 삭제하게 되더라도 해당 객체의 앞뒤 링크만 변경되고 나머지 링크는 변하지 않아 인덱스가 밀리거나 당겨지는 일이 없다.
 * - ArrayList에 비해 데이터의 추가나 삭제가 용이하지만, 인덱스가 없어 특정 요소에 접근하기 위해서는 순차적인 탐색이 필요해 탐색 속도가 떨어진다.
 * - 객체 Node의 구성 : data(노드의 값), next(다음 노드를 가리키는 참조값), prev(이전 노드를 가리키는 참조값)
 * 
 * 
 * 1. 단일 연결리스트(Singly LinkedList)
 *   - 각 노드가 다음 노드에 대해서만 참조하는 단순한 형태의 연결리스트이다.
 *   - Head 노드를 잃어버려 참조하지 못하는 경우 데이터 전체를 사용하지 못한다. (head : 첫번째 노드를 지정하는 참조값)
 * 
 * 2. 이중 연결리스트(Doubly LinkedList)
 *   - 각 노드가 이전 노드, 다음 노드에 대해 참조하는 형태의 연결리스트이다.
 *   - 삭제가 간편하고 단일 연결 리스트에 비해 데이터 손상에 강하지만 관리할 참조가 두 개이므로 작업량이 많아진다.
 *   
 * 3. 원형 연결리스트(Circular LinkedList)
 *   - 마지막 노드가 첫번째 노드를 참조하여 계속 회전할 수 있도록 만들어진 연결리스트이다.
 */

public class B_LinkedList {
	public void method1() {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Thu"); // 데이터 추가
		System.out.println(list);
		list.addFirst("Mon"); // 가장 앞에 데이터 추가
		System.out.println(list);
		list.addLast("Fri"); // 가장 뒤에 데이터 추가. 순차적으로 접근하여 마지막에 추가하는 것이 아닌, 마지막 노드를 가리키는 참조값을 이용하여 값을 추가한다.
		System.out.println(list);
		list.add(1, "Tue"); // 해당 인덱스의 뒤에 데이터 추가
		System.out.println(list);
		list.add(2, "Wed");
		System.out.println(list);
		System.out.println();
		
		// contains() : 해당 값이 저장되어 있는지 확인. 있으면 true, 없으면 false 반환
		// indexOf() : 값이 있으면 해당하는 인덱스를 반환, 없으면 -1을 반환
		System.out.println("Tue? : " + list.contains("Tue"));
		System.out.println(list.indexOf("Tue"));
		System.out.println("Sat? : " + list.contains("Sat")); 
		System.out.println(list.indexOf("Sat"));
		System.out.println();
		
		// LinkedList의 크기
		System.out.println("LinkedList의 크기 : " + list.size());
		System.out.println();
		
		// Iterator 반복자를 사용하여 문자열 출력
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		// ListIterator 반복자를 사용하여 역순 문자열 출력
		ListIterator<String> listIterator = list.listIterator(list.size());
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();
		
		System.out.println();
		
		// 해당하는 인덱스에 저장된 값을 삭제
		list.remove(2);
		System.out.println(list);
		
		// 해당하는 값을 삭제
		list.remove("Mon");
		System.out.println(list);
		System.out.println();
		
		// clear() : 저장되어있는 모든 값을 삭제
		// isEmpty() : 남아있는 값이 있으면 false, 없으면 true 반환
		list.clear();
		System.out.println("저장된 값을 모두 삭제하였습니다.");
		System.out.println("값이 남아있지 않습니까? : " + list.isEmpty());
		System.out.println();
	}
	
	

}






















