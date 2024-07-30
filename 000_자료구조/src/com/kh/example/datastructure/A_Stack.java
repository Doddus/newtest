package com.kh.example.datastructure;

import java.util.Stack;

public class A_Stack {
	
	public void method1() {
		
	/*
	 * stack 자료구조
	 * 
	 * 1. stack 자료구조란 ?
	 *  - 스택은 데이터의 삽입과 추출이 동일한 공간에서 이루어지고 데이터를 추가하면 상자에 물건이 쌓이듯
	 *    하단부터 차례대로 쌓이게 되고 가장 윗단에는 최근에 추가된 데이터가 있다.
	 *  - LIFO (Last in first out) 후입선출의 대표적인 예 (* 선입선출의 대표적인 예는 큐)
	 *  - 우리가 일상에서 사용하고 있는 기능중에는 뒤로가기, 게임을 저장하고 불러올 때 등에 스택을 사용한다고 한다. 
	 *  
	 * 2. 용어와 메소드
	 * 
	 *  - TOP : 스택의 가장 상단 데이터를 의미한다.
	 *  - PUSH : 스택에 데이터를 추가한다. 추가하면 top이 1 증가한다.
	 *  - PEEK : 스택에는 아무런 영향을 끼치지 않고 스택의 top의 값을 읽어온다.
	 *  - POP : 가장 위에 있는 데이터를 읽어오면서 스택에서 값을 삭제한다. top이 1 감소한다.
	 *  - Overflow : 데이터가 스택 크기를 넘어서 더 이상 push 하지 못할 때 발생 
	 *  - Underflow : 스택에 자료가 남아있지 않아서 더 이상 pop하지 못 할 때 발생 
	 *  
	 *  - empty() : 스택이 비어있다면 true를 반환하고 비어있지 않다면 false를 반환한다.
	 *  - peek () : 스택 구조에서 최 상단의 데이터를 그대로 반환한다.
	 *  - pop () : 스택 구조에서 최상단의 데이터를 제거하고 그 데이터를 반환한다.
	 *  - push (item) : 스택 구조에서 최상단의 데이터를 추가하고 그 데이터를 반환한다.
	 *  - search (Object o) : 스택에서 찾고자 하는 데이터가 어디에 존재하는지 반환한다. @ 최상단데이터 위치 1 반환, 찾는 데이터가 없을 경우 -1 반환
	 *  
	 *   @ List 인터페이스 메소드도 사용 가능
	 *  - int size(): 스택의 총 개수 반환 
	 *  - void clear(): 스택 안 모든 요소제거(초기화)
	 *  - contains(Object o) : 스택 내에 찾고자 하는 데이터가 포함이 되어 있는지 true,false로 반환한다.
	 */
	    Stack<String> st = new Stack<>(); 
		
		st.push("안");    // push는 list의 .add()와 동일하게 값을 입력하는 역할이다. 
		System.out.println(st);
		st.push("녕");
		System.out.println(st);
		st.push("하");
		System.out.println(st);
		st.push("세");
		System.out.println(st);
		st.push("요");
		System.out.println(st);
		System.out.println();
		
		System.out.println("총 사이즈는 ? : " + st.size()); // size() 메소드를 통해서 스택의 크기를 알 수 있다.
		System.out.println("\"안\"의 위치는 ? :" + st.search("안"));  // search()메소드를 통해 해당 글자의 위치를 반환해준다. 반환값은 최상단의 값이 1 최하단의 값이 5이다. 
		System.out.println("\"요\"의 위치는 ? :" + st.search("요")); 
		System.out.println("\"hi\"의 위치는 ? :" + st.search("hi")); // "hi"는 스택안에 존재하지 않는 값이기 때문에 -1을 반환한다.  
		System.out.println();
		
		System.out.println("Top의 값은 ? : " + st.peek());  // 스택의 최상단의 값을 반환한다.
		System.out.println("제거할 값은 ? : " + st.pop());  // 스택의 최상단의 값을 제거하고 그 값을 반환한다.
		System.out.println("총 사이즈는 ? : " + st.size());
		System.out.println("현재 Top의 값은 ? : " + st.peek());
		System.out.println();
		
		System.out.println("현재 스택에 값이 존재하는가 ? : " + st.empty()); // 스택이 비어있을 경우에는 true를 반환한다. 현재는 스택안에 값이 존재하기에 fasle를 반환한다. 
		System.out.println("제거할 값은 ? : " + st.pop());
		System.out.println("제거할 값은 ? : " + st.pop());
		System.out.println("제거할 값은 ? : " + st.pop());
		System.out.println("제거할 값은 ? : " + st.pop());
//		System.out.println("제거할 값은 ? : " + st.pop()); Underflow 발생 코드 -> 스택내에 더 이상 삭제할 데이터가 남아있지 않기 때문에 java.util.EmptyStackException 발생 
		System.out.println("현재 사이즈는? : " + st.size());
		System.out.println("현재 스택에 값이 존재하는가 ? : " + st.empty());
		
	   // 스택 자료구조를 응용하여 역순 문자 출력
		
	        String str = "안녕하세요";
	        Stack stack = new Stack();  // 위에 Stack은 제네릭스를 통해 타입 지정을 해두었기 때문에 새로운 스택메소드를 생성해야한다. 

	        //스택에 push
	        for(int i = 0; i < str.length(); i++)
	            stack.push(str.charAt(i));  // 새로운 스택메소드를 생성하지 않으면 문자열을 하나씩 뽑을 수 없어서 역순 문자를 출력 할 수 없다 ! 

	        //역순 문자열 만들기
	        String str_reverse = "";
	        for (int i = 0; i < str.length(); i++)
	            str_reverse += stack.pop();

	        System.out.println(str_reverse);
	        System.out.println();
		
    }
	
}
