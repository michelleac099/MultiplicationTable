
public class MultiplicationTable {

	public static void main(String[] args) {

		int tableSize = 10;
		
		System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {

        }//1st for loop. printing out row
        System.out.println();
         
        for(int i = 1 ;i<=tableSize;i++) {

            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
                
            }//3rd for loop. printing out products
            
            System.out.println();
            
        }//2nd for loop. printing out column
		
	} //main

} //class
