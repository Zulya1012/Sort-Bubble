public class sort{
	public static void main(String[] arg){
		int [] a={-2, 3, 0, 5, 9};
		for (int i=0; i<a.length; i++){
			for (int j=1; j<a.length; j++){
				if (a[j-1]>a[j]){
					int min=a[j];
					a[j]=a[j-1];
					a[j-1]=min;
				 }
			 }
		}
		for (int b:a)
			System.out.println(b);
	}

}