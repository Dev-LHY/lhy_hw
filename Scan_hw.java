package lhy.homework;

import java.util.Scanner;

public class Scan_hw {
	public static void main(String[] args) {
		int num1=0;
		Scanner sc = new Scanner(System.in);	//sc 스캐너 선언
		
		
		System.out.println("학번을 입력하십시오.");
		int number = sc.nextInt();
		System.out.println("학점을 입력하십시오.");
		float point4 = sc.nextFloat();
		System.out.println("학점을 입력하십시오.");
		double point8 = sc.nextDouble();
		System.out.println("주소를 입력하십시오.");
		String adr = sc.next();
		System.out.println("전공 학과를 입력하십시오.");
		String major = sc.next();
		System.out.println("입력하신 정보를 확인 하시겠습니까?\nYes=1 No=Typing anything(number)");
		int check1 = sc.nextInt();
		
		if(check1 != 1)
		{
			System.out.println("프로그램을 종료합니다.");
		}
		if(check1==1)
		{		//입력 정보 확인 21행에서 저장된 값으로 대조
			System.out.println("입력하신 학번은 "+number+" 입니다.");
			System.out.println("입력하신 학점은 "+point4+" 입니다.");
			System.out.println("입력하신 학잠은 "+point8+" 입니다.");
			System.out.println("입력하신 주소는 "+adr+" 입니다.");
			System.out.println("입력하신 전공 학과는 "+major+" 입니다.\n");
			System.out.println("입력하신 정보를 수정하시겠습니까?\nYes=1 No=Typing Anything(number)");
		}
		int check2 = sc.nextInt();
		
		if(check2 != 1)
		{
			System.out.println("프로그램을 종료합니다.");
		}
		
		if (check2 == 1)
		{	//입력 정보 수정 확인
			for(int check3=1; check3==1; )
			{
				if(check2 == 1)
				{
					System.out.println("어떤 정보를 수정하시겠습니까?\n1.학번        2.학점\n3.학점         4.주소\n5.전공 학과   6. 취소");
					num1=sc.nextInt();
				
					if(num1==1)
					{
						System.out.println("학번을 입력하십시오.");
						number = sc.nextInt();
					}
					else if(num1==2)
					{
						System.out.println("학점을 입력하십시오.");
						point4 = sc.nextFloat();
					}
					else if(num1==3)
					{
						System.out.println("학점을 입력하십시오");
						point8 = sc.nextDouble();
					}
					else if(num1==4)
					{
						System.out.println("주소를 입력하십시오.");
						adr = sc.next();
					}
					else if(num1==5)
					{
						System.out.println("전공 학과를 입력하십시오.");
						major = sc.next();
					}
					else if(num1==6)
					{
						break;
					}
					else
					{
						System.out.println("다시입력하십시오.");
						continue;
					}
				}
			}
		}
		
		if(num1 == 6)
		{
		System.out.println("수정하신 정보를 확인하시겠습니까?\nYes=1 No=Typing Anything(number)");
		}
		int check4=sc.nextInt();
		
		if(check4==1)
		{
			System.out.println("입력하신 학번은 "+number+" 입니다.");
			System.out.println("입력하신 학점은 "+point4+" 입니다.");
			System.out.println("입력하신 학잠은 "+point8+" 입니다.");
			System.out.println("입력하신 주소는 "+adr+" 입니다.");
			System.out.println("입력하신 전공 학과는 "+major+" 입니다.\n");
			System.out.println("프로그램을 종료합니다.");
		}
		else
		{
			System.out.println("프로그램을 종료합니다.");
		}
	}
}