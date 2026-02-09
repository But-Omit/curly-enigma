public class VariableTest{
	public static void main(String[]args){
		//一开始没有乘客
		int count=0;
		//上一个
		count=count+1;
		System.out.println(count);
		//上两个，下一个
		count=count+2-1;
		//上两个，下一个
		count=count+2-1;
		//下一个
		count=count-1;
		//上一个
		count=count+1;
		//请问终点站几个乘客
		System.out.println(count);
	}
}