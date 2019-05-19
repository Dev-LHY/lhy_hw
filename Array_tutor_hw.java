package lhy.homework;

import java.util.Scanner;

public class Array_tutor_hw {
	public static void main(String[] args) {
		
		int[] id = new int[5];		//학번 변수. 총 5명의 학번을 받을것이기 떄문에 배열의 크기는 5로 지정
		int i = 0, j=0;
		
		double[][] A = new double[5][5];		//각 과목의 점수와 총점,평균 저장
		String [] B =  {"국어 점수를 입력 하십시오.","수학 점수를 입력하십시오.","영어 점수를 입력하십시오."};

		Scanner sc = new Scanner(System.in);
		
		for(i=0 ; i<5 ; i++)		//점수 받는 공간 i=사람번호, j=각 항목의 저장 인덱스
		{
			System.out.println("학번을 입력하십시오.");
			id[i] = sc.nextInt();
		
			for(j=0 ; j<3 ; j++)
			{
				System.out.println(B[j]);
				A[i][j] = sc.nextDouble();
			}
		}
		
		for(i=0 ; i<5 ; i++)
		{
		A[i][3] = A[i][0]+A[i][1]+A[i][2];		//총점저장
		A[i][4] = A[i][3]/3;		//평균저장
		System.out.printf("%d번의 총점은 %.2f점 입니다.\n\n",id[i],A[i][3]);
		System.out.printf("       평점은 %.2f점 입니다.\n\n",A[i][4]);
		
		if(A[i][4]>=95)		//학점 출력
			System.out.printf("       학점은 A+ 입니다.\n\n");
		else if(A[i][4]>=90)
			System.out.printf("       학점은 A 입니다.\n\n");
		else if(A[i][4]>=85)
			System.out.printf("       학점은 B+ 입니다.\n\n");
		else if(A[i][4]>=80)
			System.out.printf("       학점은 B 입니다.\n\n");
		else if(A[i][4]>=75)
			System.out.printf("       학점은 C+ 입니다.\n\n");
		else if(A[i][4]>=70)
			System.out.printf("       학점은 C 입니다.\n\n");
		else if(A[i][4]>=65)
			System.out.printf("       학점은 D+ 입니다.\n\n");
		else if(A[i][4]>=60)
			System.out.printf("       학점은 D 입니다.\n\n");
		else
			System.out.printf("       학점은 F 입니다.\n\n");

		}
		
		
		sc.close();
	}
}