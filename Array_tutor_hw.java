package lhy.homework;

import java.util.Scanner;

public class Array_tutor_hw {
	public static void main(String[] args) {
		
		int[] id = new int[5];		//�й� ����. �� 5���� �й��� �������̱� ������ �迭�� ũ��� 5�� ����
		int i = 0, j=0;
		
		double[][] A = new double[5][5];		//�� ������ ������ ����,��� ����
		String [] B =  {"���� ������ �Է� �Ͻʽÿ�.","���� ������ �Է��Ͻʽÿ�.","���� ������ �Է��Ͻʽÿ�."};

		Scanner sc = new Scanner(System.in);
		
		for(i=0 ; i<5 ; i++)		//���� �޴� ���� i=�����ȣ, j=�� �׸��� ���� �ε���
		{
			System.out.println("�й��� �Է��Ͻʽÿ�.");
			id[i] = sc.nextInt();
		
			for(j=0 ; j<3 ; j++)
			{
				System.out.println(B[j]);
				A[i][j] = sc.nextDouble();
			}
		}
		
		for(i=0 ; i<5 ; i++)
		{
		A[i][3] = A[i][0]+A[i][1]+A[i][2];		//��������
		A[i][4] = A[i][3]/3;		//�������
		System.out.printf("%d���� ������ %.2f�� �Դϴ�.\n\n",id[i],A[i][3]);
		System.out.printf("       ������ %.2f�� �Դϴ�.\n\n",A[i][4]);
		
		if(A[i][4]>=95)		//���� ���
			System.out.printf("       ������ A+ �Դϴ�.\n\n");
		else if(A[i][4]>=90)
			System.out.printf("       ������ A �Դϴ�.\n\n");
		else if(A[i][4]>=85)
			System.out.printf("       ������ B+ �Դϴ�.\n\n");
		else if(A[i][4]>=80)
			System.out.printf("       ������ B �Դϴ�.\n\n");
		else if(A[i][4]>=75)
			System.out.printf("       ������ C+ �Դϴ�.\n\n");
		else if(A[i][4]>=70)
			System.out.printf("       ������ C �Դϴ�.\n\n");
		else if(A[i][4]>=65)
			System.out.printf("       ������ D+ �Դϴ�.\n\n");
		else if(A[i][4]>=60)
			System.out.printf("       ������ D �Դϴ�.\n\n");
		else
			System.out.printf("       ������ F �Դϴ�.\n\n");

		}
		
		
		sc.close();
	}
}