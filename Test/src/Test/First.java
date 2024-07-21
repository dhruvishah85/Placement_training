package Test;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime number
		int i=1,j=1,c=0;
		for(i=2;i<=100;i++) {
			c=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					c=1;
					break;
				}
			}
			if(c==0) {
				System.out.println(i+ " ");
			}
		}
	}

}
