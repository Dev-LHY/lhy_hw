package lhy.homework;

import java.util.Scanner;

public class Scan_hw {
	public static void main(String[] args) {
		int num1=0;
		Scanner sc = new Scanner(System.in);	//sc ��ĳ�� ����
		
		
		System.out.println("�й��� �Է��Ͻʽÿ�.");
		int number = sc.nextInt();
		System.out.println("������ �Է��Ͻʽÿ�.");
		float point4 = sc.nextFloat();
		System.out.println("������ �Է��Ͻʽÿ�.");
		double point8 = sc.nextDouble();
		System.out.println("�ּҸ� �Է��Ͻʽÿ�.");
		String adr = sc.next();
		System.out.println("���� �а��� �Է��Ͻʽÿ�.");
		String major = sc.next();
		System.out.println("�Է��Ͻ� ������ Ȯ�� �Ͻðڽ��ϱ�?\nYes=1 No=Typing anything(number)");
		int check1 = sc.nextInt();
		
		if(check1 != 1)
		{
			System.out.println("���α׷��� �����մϴ�.");
		}
		if(check1==1)
		{		//�Է� ���� Ȯ�� 21�࿡�� ����� ������ ����
			System.out.println("�Է��Ͻ� �й��� "+number+" �Դϴ�.");
			System.out.println("�Է��Ͻ� ������ "+point4+" �Դϴ�.");
			System.out.println("�Է��Ͻ� ������ "+point8+" �Դϴ�.");
			System.out.println("�Է��Ͻ� �ּҴ� "+adr+" �Դϴ�.");
			System.out.println("�Է��Ͻ� ���� �а��� "+major+" �Դϴ�.\n");
			System.out.println("�Է��Ͻ� ������ �����Ͻðڽ��ϱ�?\nYes=1 No=Typing Anything(number)");
		}
		int check2 = sc.nextInt();
		
		if(check2 != 1)
		{
			System.out.println("���α׷��� �����մϴ�.");
		}
		
		if (check2 == 1)
		{	//�Է� ���� ���� Ȯ��
			for(int check3=1; check3==1; )
			{
				if(check2 == 1)
				{
					System.out.println("� ������ �����Ͻðڽ��ϱ�?\n1.�й�        2.����\n3.����         4.�ּ�\n5.���� �а�   6. ���");
					num1=sc.nextInt();
				
					if(num1==1)
					{
						System.out.println("�й��� �Է��Ͻʽÿ�.");
						number = sc.nextInt();
					}
					else if(num1==2)
					{
						System.out.println("������ �Է��Ͻʽÿ�.");
						point4 = sc.nextFloat();
					}
					else if(num1==3)
					{
						System.out.println("������ �Է��Ͻʽÿ�");
						point8 = sc.nextDouble();
					}
					else if(num1==4)
					{
						System.out.println("�ּҸ� �Է��Ͻʽÿ�.");
						adr = sc.next();
					}
					else if(num1==5)
					{
						System.out.println("���� �а��� �Է��Ͻʽÿ�.");
						major = sc.next();
					}
					else if(num1==6)
					{
						break;
					}
					else
					{
						System.out.println("�ٽ��Է��Ͻʽÿ�.");
						continue;
					}
				}
			}
		}
		
		if(num1 == 6)
		{
		System.out.println("�����Ͻ� ������ Ȯ���Ͻðڽ��ϱ�?\nYes=1 No=Typing Anything(number)");
		}
		int check4=sc.nextInt();
		
		if(check4==1)
		{
			System.out.println("�Է��Ͻ� �й��� "+number+" �Դϴ�.");
			System.out.println("�Է��Ͻ� ������ "+point4+" �Դϴ�.");
			System.out.println("�Է��Ͻ� ������ "+point8+" �Դϴ�.");
			System.out.println("�Է��Ͻ� �ּҴ� "+adr+" �Դϴ�.");
			System.out.println("�Է��Ͻ� ���� �а��� "+major+" �Դϴ�.\n");
			System.out.println("���α׷��� �����մϴ�.");
		}
		else
		{
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}