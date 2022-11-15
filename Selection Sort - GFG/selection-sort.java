//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
// 	int  select(int arr[], int i)
// 	{
        
// 	}
	
	void selectionSort(int arr[], int n){
	   
	   for(int i = 0 ; i < n; i++ ){
	       int pivot = i;
	       int smallest = arr[i];
	       int point = i;
	       for(int j = i ; j < n ; j++){
	           if(smallest > arr[j]){
	               pivot = j;
	               smallest = arr[j];
	           }
	       }
	       swap(point , pivot, arr);
	   }
	   //System.out.print(Arrays.toString(arr));
	}
	static void swap( int start , int end , int[] arr){
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	    
	}
}