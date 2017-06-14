public class Director {
	
	public static void main(String[] args) {
		Director director = new Director();
		  director.playScenario();
		  }
	
	public void playScenario(){

	System.out.println("맥주바 생성");
	맥주바.생성자();
	
	System.out.println("학생 생성");
	학생.생성자();
	
	System.out.println("사장 생성");
	사장.생성자();
	
	System.out.println("메뉴판 생성합니다.");
	메뉴판.생성자();
	
	System.out.println("학생에게 맥주 주문을 시작하게 합니다.");
	학생.맥주주문();
	
	사장.맥주제공();
	
	맥주바.맥주제공();

}
}
	
