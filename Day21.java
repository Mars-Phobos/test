class Day21
{	//60��16����
	public static void main(String[] args)
	{
		int num = 60;
		//��ȡ60�����4λ
		int n1=num & 15;
		System.out.println(n1>9?(char)(n1-10+'A'):n1);
		//��ȡ��һ��4λ���Ƚ�60����4λ
		int temp = 60>>4;
		//��temp��ֵ�������4λ�Ļ�ȡ
		int n2=temp & 15;
		System.out.println(n2>9?(char)(n2-10+'A'):n2);
		
	}
}