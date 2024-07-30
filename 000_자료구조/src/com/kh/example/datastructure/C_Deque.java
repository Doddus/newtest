package com.kh.example.datastructure;

import java.util.Deque;
import java.util.LinkedList;

public class C_Deque {
	public void method1() {
		/*
		 * deque 자료구조
		 * 
		 * 1. deque 자료구조란?
		 *  - Double-Ended Queue의 줄임말로, 두 개의 포인터를 사용해 큐의 양쪽 끝에서 삽입과 삭제가 모두 가능한 자료구조이다.
		 *  - 어떻게 사용하느냐에 따라 큐와 스택이 모두 될 수 있다. (큐와 스택을 합친 형태)
		 *  - 한쪽으로만 입력 가능한 덱을 스크롤(scroll), 한쪽으로만 출력 가능한 덱을 셀프(shelf) 라고 한다.
		 *  - 양방향 연결리스트(Doubly)를 기반으로 구현하는 경우가 많다.
		 * 
		 * 2. 주요 메소드
		 * 
		 *  - addFirst() : 덱의 앞쪽에 데이터 삽입 (용량 제한이 있는 덱의 경우, 용량을 초과하면 예외가 발생)
		 *  - offerFirtst() : 덱의 앞쪽에 데이터 삽입 (정상적으로 데이터가 삽입된 경우 true가 리턴되며, 용량 제한에 걸리는 경우 false를 리턴)
		 *  - addLast() : 덱의 뒤쪽에 데이터 삽입 (용량 제한이 있는 덱의 경우, 용량을 초과하면 예외가 발생)
		 *  - offerLast() : 덱의 뒤쪽에 데이터 삽입 (정상적으로 데이터가 삽입된 경우 true가 리턴되며, 용량 제한에 걸리는 경우 false를 리턴)
		 *  
		 *  - removeFirst() : 덱의 앞쪽의 데이터 삭제, 리턴 (덱이 비어있으면 예외가 발생) // remove()와 동일  
		 *  - pollFirst() : 댁의 앞쪽의 데이터 삭제, 리턴 (덱이 비어있으면 null 이 리턴) // poll()와 동일
		 *  - removeLast() : 덱의 뒤쪽의 데이터 삭제, 리턴 (덱이 비어있으면 예외가 발생)
		 *  - pollLast() : 댁의 뒤쪽의 데이터 삭제, 리턴 (덱이 비어있으면 null 이 리턴)
		 *  
		 *  - getFirst() : 덱의 앞쪽 데이터를 삭제하지 않고 리턴 (덱이 비어있으면 예외가 발생)
		 *  - peekFirst() : 덱의 앞쪽 데이터를 삭제하지 않고 리턴 (덱이 비어있으면 null이 리턴) // peek()와 동일
		 *  - getLast() : 덱의 뒤쪽 데이터를 삭제하지 않고 리턴 (덱이 비어있으면 예외가 발생)
		 *  - peekLast() : 덱의 뒤쪽 데이터를 삭제하지 않고 리턴 (덱이 비어있으면 null이 리턴)
		 *  
		 *  - isEmpty() : 덱이 비어있으면 true, 비어있지 않으면 false 리턴
		 *  - size() : 덱의 크기
		 *  - clear() : 덱에 있는 모든 데이터 삭제
 		 *  
 		 *  ** 스택으로 사용하는 경우
 		 *  - push() : addFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
 		 *  - pop() : removeFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
		 */
		
		Deque<String> deq = new LinkedList<>(); // LinkedList 양방향 연결리스트(Doubly)를 기반으로 구현하는 클래스
		
		// 데이터 삽입
		deq.addFirst("사과");
		System.out.println(deq);
		System.out.println("덱의 앞쪽에 데이터가 정상적으로 삽입이 되었는가? : " + deq.offerFirst("딸기"));
		System.out.println(deq);
		deq.addLast("포도");
		System.out.println(deq);
		System.out.println("덱의 뒤쪽에 데이터가 정상적으로 삽입이 되었는가? : " + deq.offerLast("딸기"));
		System.out.println(deq);
		System.out.println();
				
		// 데이터 삭제 후 리턴
		deq.removeFirst();
		System.out.println(deq);
		System.out.println("덱의 뒤쪽이 비어있는가? : " + deq.pollLast()); // 비어있지 않으므로 값을 리턴
		System.out.println(deq);
		System.out.println();
				
		// 데이터 삭제하지 않고 리턴
		deq.getFirst();
		System.out.println(deq);
		System.out.println("덱의 뒤쪽이 비어있는가? : " + deq.peekLast()); // 비어있지 않으므로 값을 리턴
		System.out.println(deq);
		System.out.println();
				
		System.out.println("덱이 비어있는가? : " + deq.isEmpty());
		System.out.println("덱의 사이즈는? : " + deq.size());
		deq.clear();
		
//		deq.getFirst(); // 덱이 비어있으므로 예외 발생
		System.out.println(deq);
		System.out.println("덱의 뒤쪽이 비어있는가? : " + deq.peekLast()); // 비어으므로 null 리턴
	}
}