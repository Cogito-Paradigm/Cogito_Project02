import java.util.Scanner;

public class NumCycle {
	/*	0보다 크거나 같고 99보다 작거나 같은 정수를 이용한 연산
		주어진 수가 10보다 작다면 앞에 0을 붙여 두자리수로 만들고, 각 자리수를 더함
		주어진 수의 가장 오른쪽 자리 숫자와 앞에서 구한 합의 가장 오른쪽 자리 수를 더하여 이으면 새로운 수
		ex)
		26 		2+6=8 68 		6+8=14 84 	8+4=12 42 	4+2=6 26
		4번 걸렸으므로 사이클의 길이는 4
		n의 사이클의 길이를 구하는 프로그램을 작성
	*/
	public static void main(String[] args){
		int num;
		System.out.println("0~99까지의 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num<0||num>99){
			System.out.println("숫자가 범위를 초과하였습니다. 다시입력하세요.");
			num = sc.nextInt();
		}
		sc.close();
		
		int pr[] = new int[2];
		pr[0] = num/10;
		pr[1] = num%10;
				
		int su[] = new int[2];
		su[0] = num/10;
		su[1] = num%10;
		System.out.println("입려된 수의 첫째자리는 "+su[0]+"이고 둘째자리는 "+su[1]+"입니다.");

		int cp[] = new int[2];
		cp[0] = (su[0]+su[1])/10;
		cp[1] = (su[0]+su[1])%10;
		System.out.println("더해진 수의 첫째자리는 "+cp[0]+"이고 둘째자리는 "+cp[1]+"입니다.");
		System.out.println("생성된 수의 첫째자리는 "+su[1]+"이고 둘째자리는 "+cp[1]+"입니다.");
		
		int a = 1;
		while(pr[0]!=su[1]||pr[1]!=cp[1]){
			System.out.println(a+"번째 사이클입니다.");
			
			su[0] = su[1];
			su[1] = cp[1];
			System.out.println("입려된 수의 첫째자리는 "+su[0]+"이고 둘째자리는 "+su[1]+"입니다.");
			
			cp[0] = (su[0]+su[1])/10;
			cp[1] = (su[0]+su[1])%10;
			System.out.println("더해진 수의 첫째자리는 "+cp[0]+"이고 둘째자리는 "+cp[1]+"입니다.");
			System.out.println("생성된 수의 첫째자리는 "+su[1]+"이고 둘째자리는 "+cp[1]+"입니다.");
		
			a++;
		}		
		System.out.println(a+"번째 사이클에서 종료되었습니다.");
	}
}
