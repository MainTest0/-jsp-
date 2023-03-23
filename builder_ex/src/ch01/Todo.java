package ch01;

public class Todo {

	private String content;
	private int complete;		// 1번은 완료 0번은 미완료
	
	// 1. 기본생성자 재정의
	private Todo() {}
	
	// 대부분 내부 클래스 이름을 Builder라고 지음 
	public static class MyBuilder {
		
		// 내부클래스 안에서도 변수를 가질 수 있음
		private String  content;
		private int complete;
		
		// 메서드 만들기
		public MyBuilder setContent(String content) {
			this.content = content;
			return this;
		}
		// 컴플릿을 받을수있도록
		public MyBuilder setComplete(int complete) {
			this.complete = complete;
			return this;
		}
		// *** 빌더 패턴의 핵심 ***
		// new Todo 왜안되는지 물어보기
		public Todo build() {
			Todo todo = new Todo();
			// todo 변수 content = Builder 변수 content
			todo.content = content;
			todo.complete = complete;
			return todo;
		}
	}
	
	public static void main(String[] args) {
		
		// 멤버변수가 10개있으면 생성자안에 많다
		// 이걸 빌더패턴으로 설계해줬으면 필요한것만 쓸 수있음
		// 우리가 만들고싶은 클래스는 Todo
		// 빌더의 리턴타입이 Todo라서 build 까지 해줘야함
		Todo todo1 = new MyBuilder().setComplete(1).build();
		Todo todo2 = new MyBuilder().setContent("잠자기").build();
		Todo todo3 = new MyBuilder().setContent("청소하기").build();
		
		new MyBuilder().setComplete(1);
		new MyBuilder().setContent("잠자기");
		new MyBuilder().setComplete(0).setContent("청소하기");
		
	}
	// 생성자 오버라이딩을 쓰든 생성자를 많이 만들어야하는 경우
	// 실수로 매개변수의 위치를 바뀌게되면 원하는 결과가 안나올수있음(포지셔널)
	// 근데 빌더패턴을 만들면 쓰는사람이 생성할때 부르기때문에 명확하다
	
} //end of class
