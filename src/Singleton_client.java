
public class Singleton_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Singleton s1=Singleton.GetInstance();
			Singleton s2=Singleton.GetInstance();
			if (s1==s2){
				System.out.println("两个对象是相同的实例");
			}
	}

}
