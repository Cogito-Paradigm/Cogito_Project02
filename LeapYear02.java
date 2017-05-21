import java.util.Scanner;

public class LeapYear02 {
	//평년과 윤년을 구하는 main2
	public static void main(String[] args){
		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if(year%400==0){
			print(year, "윤년");
		}else if(year%100!=0&&year%4==0){
			print(year, "윤년");
		}else{
			print(year, "평년");
		}
	}
	
	//중복되는 출력부분을 제외한 인자를 받아 전체 문장을 출력하는 메소드
	public static void print(int a, String b){
		System.out.println(a+"은(는) "+b+"입니다.");
	}
}
