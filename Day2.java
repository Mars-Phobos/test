class Day2
{
	public static void main(String[] args)
	{
		int n=3,m=8;
		System.out.println("n="+n+" m="+m);
		/*
		//���õ���������
		n=n+m;
		m=n-m;
		n=n-m;//����n��m�ǳ���ͻ������
		*/
		n=n^m;//^���
		m=n^m;//(n^m)^m����m=n
		n=n^m;//(n^m)^n
		System.out.println("n="+n+" m="+m);
		//����ʵ��Ӧ�õ�ʱ������õ������������׿���
	}
}