public class Main {
	public void bubbleSort( int [ ] num ){
		
	  int temp;
	   
	  for(int i = 0; i < num.length; i++) {
	   	for(int n = 0; n < num.length - i; n++) {
	   		if(num[n] > num[n + 1]) {
	   			temp = num[n + 1];
	   			num[n + 1] = num[n];
	   			num[n] = temp;
	   		}
	   	}
	   	System.out.println(num[i] + "\n");
	  }
	 
	} 

    public static void main(String args[]) {
    	Main m = new Main();
    	int[] arr = {5,3,4,7,1,2};
    	m.bubbleSort(arr);
    }
      
}
