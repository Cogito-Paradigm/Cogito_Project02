import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathList {
	/*	n명의 학생 수학점수를 평균을 구해서 출력, 점수는 매번 바뀔 수 있음
		list를 사용해서 데이터를 다룸
		입력:12,62,43,90,93 ->출력:60
	 */
	public static void main(String[] args){
		List<Integer> ls = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("값을 입력하십시오.");		
			ls.add(sc.nextInt());
	
			int a;
			System.out.println("값을 더 입력하시겠습니까? yes=1, no=2");
			a = sc.nextInt();
			if(a==1){
			}else if(a==2){
				break;
			}else{
				System.out.println("값을 잘못입력하셨습니다.");		
			}
		}
		sc.close();
		
		int a = 0;
		for(int i=0; i<ls.size(); i++){
			System.out.println("입력된 값 : "+ls.get(i));
			a = ls.get(i);
			a += a;
		}
		System.out.println("입력된 값들의 평균 : "+a/ls.size());
	}
}
