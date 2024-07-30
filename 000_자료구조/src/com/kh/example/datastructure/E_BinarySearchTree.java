package com.kh.example.datastructure;

/*
 *  트리	1) 일반트리 - 노드의 자식 개수에 제한이 없는 트리(직급도 같은 개념)
 *  	2) 이진트리 - 각 노드의 자식이 2개 이하인 트리(전위순회 [ root -> left -> right ],
 *  										  중위순회 [ left -> root -> right ],
 *  										  후위순회 [ left -> right -> root ])
 *  	3) 이진검색트리 - 각 노드의 자식이 2개 이하인 트리
 *  				 - 빠른 검색이 필요할 때 주로 사용
 *  	             - 왼쪽 자식은 루트(부모)보다 작고, 오른쪽 자식은 루트(부모)보다 커야 조건 충족
 *  				 - Inorder(중위순회)로 돌면서(왼쪽 서브트리 -> 루트 -> 오른쪽 서브트리) 정렬된 정보의 원소를 얻는다.
 *  
 *  기본적인 용어설명
 *  	- Root Node : 트리 구조에서 최상위에 존재하는 노드
 *  	- Node : 트리의 구성요소에 해당하는 모든 요소
 *  	- Sub Tree : 큰 트리(전체)에 속하는 작은 트리
 *  
 */


public class E_BinarySearchTree {

	public class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
        
        public TreeNode(int data) {
        	this.data = data;
            this.left = null;
            this.right = null;
        }
 
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public TreeNode getLeft() {
            return left;
        }
        public void setLeft(TreeNode left) {
            this.left = left;
        }
        public TreeNode getRight() {
            return right;
        }
        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
	
	public TreeNode root;
	public E_BinarySearchTree() {
		this.root = null;
	}
	
	  //삽입 연산
    public void insertBST(int x){
        TreeNode newNode = new TreeNode(x);
        if(root==null){			// 루트가 널일 경우 새로 들어온 값 입력
            root = newNode;
            return;
        }
        
        TreeNode current = root;					// 현재 값을 루트로 설정
        TreeNode parent = null;						// 부모 노드는 일단 널로 설정
        while(true){
            parent = current;
            if(x < current.getData()){                // 루트를 기준으로 새로 들어온 값이 작은 경우 왼쪽으로 보내는 코드
                current = current.getLeft();
                if(current==null){
                    parent.setLeft(newNode);
                    return;
                }
            }else{									 // 루트를 기준으로 새로 들어온 값이 큰 경우 오른쪽으로 보내는 코드
                current = current.getRight();
                if(current==null){
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }
    
    public void inorder(TreeNode root){					// 중위순회를 하는 과정
        if(root!=null){
            inorder(root.getLeft());					// left 확인
            System.out.print(" " + root.getData());		// root 확인
            inorder(root.getRight());					// right 확인
        }
    }
	
    public void printBST(){								// 중위순회를 출력하는 메소드
        inorder(root);
        System.out.println();
    }
	
	public void method1() {
		E_BinarySearchTree bst = new E_BinarySearchTree();
		//트리에 노드를 삽입
        bst.insertBST(5);
        bst.insertBST(9);
        bst.insertBST(1);
        bst.insertBST(19);
        bst.insertBST(17);
        bst.insertBST(50);
        bst.insertBST(59);
        bst.insertBST(4);
        bst.insertBST(55);
        bst.insertBST(60);
        bst.insertBST(2);
        
        System.out.print("이진검색트리를 이용한 삽입 결과 : ");
        bst.printBST();
		
	}
}
