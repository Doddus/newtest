package com.kh.example.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class D_Queue {
	public void method1() {
		/*
		 * Queue(큐)
		 * - First In First Out
			 ㄴ 양쪽 끝에서만 데이터를 넣거나 뺄 수 있는 선형 구조
			 ㄴ 제일 처음에 들어온 데어티가 제일 빨리 나가는 방식
		 
		 * - 인터페이스로 정의
		 	 ㄴ new 연산자를 사용한 객체 생성 불가
		 	 ㄴQueue를 사용하기 위해서는 인터페이스를 직접 구현하거나 구현되어 있는 구현체를 사용
		 * 
		 * - Queue(큐) 메서드
		 	 ㄴ add() : Queue에 추가. 추가 성공 시 true 반환. 저장 공간이 부족할 경우 IllegalStateException 발생
		 	 ㄴ remove() : Queue에서 객체를 꺼내서 반환. 비어 있으면 NoSuchElementException 발생
		 	 ㄴ element() : 삭제 없이 요소를 읽기. 비어 있으면 NoSuchElementException 발생
		 	 
		 	 ㄴ offer() : Queue에 객체 추가. true, false 반환
		 	 ㄴ poll() : Queue에서 객체를 꺼내 반환. 비어 있으면 null 반환 
		 	 ㄴ peek() : 삭제 없이 요소를 읽기. Queue가 비어 있으면 null 반환
		 	 
		 	 ㄴ size() : Queue에 저장된 요소의 개수 확인
		 	 ㄴ isEmpty() : Queue가 비어 있는지 확인. 비어 있으면 true, 비어 있지 않으면 false 반환
		 */
		
		Queue queue = new LinkedList(); // LinkedList를 통해 객체 생성
		
		queue.offer(1); // Queue에 요소 추가
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		System.out.println("1. element 저장(offer) : " + queue + '\n');
		
		queue.poll(); // Queue의 요소 삭제
		System.out.println("2. element 삭제(poll) : " + queue+ '\n'); // 제일 처음 저장했던 "1" 삭제 후 "2, 3, 4" 출력
		
		queue.peek(); // Queue의 요소 읽기
		System.out.println("3. element 읽기(peek) : " + queue+ '\n');
		
		queue.offer(1); // Queue에 요소 추가
		System.out.println("4. element 1 추가(offer) : " + queue+ '\n'); // 2, 3, 4, 1 출력
		
		queue.poll(); // Queue의 요소 삭제
		System.out.println("5. element 삭제(poll) : " + queue+ '\n');
		
		System.out.println("6. 저장된 element의 개수(size) : " + queue.size()+ '\n');
		
		System.out.println("7. Queue의 저장공간이 비어있는지 확인 : " + queue.isEmpty()+ '\n');
		
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println("8. Queue의 저장공간이 비어있는지 확인 : " + queue.isEmpty()+ '\n');
	}
}
