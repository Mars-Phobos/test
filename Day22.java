class Day22
{	//��ȡ��ֵ�����
	public static void main(String[] args)
	{
		/*		
		Scanner input= new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int x=input.nextInt();
		*/
		int x=9;
		switch(x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"���Ǵ���");break;
			case 6:
			case 7:
			case 8:
				System.out.println(x+"�����ļ�");break;
			case 9:
			case 10:
			case 11:
				System.out.println(x+"�����＾");break;
			case 12:
			case 1:
			case 2:
				System.out.println(x+"���Ƕ���");break;
			default:
				System.out.println("SB");
		}
	}
}
/*
if��switch������
����˵�������Ӧ���ĸ���
����жϵľ�����ֵ���࣬���Ƿ���byte short int char���������ͣ�������switch��
����������������жϣ��Խ��ΪBoolean�����жϣ�ʹ��if��
*/