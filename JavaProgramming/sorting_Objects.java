
package hashcode_Equals;
import java.util.Scanner;
public class sorting_Objects {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner sc=new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i < n; i++)
        { 
        	System.out.print("Enter the "+(i+1)+"th Element");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        //bubbleSort(arr);
        //SelectionSort(arr);
        // QuickSort(arr);
        InsertionSort(arr);
        
        System.out.println("Sorted array: ");
        printArray(arr, n);
		
	}
	 static void printArray(int arr[], int size)
	    {
	        int i;
	        for (i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	static void bubbleSort(int arr[])
    {
        int i, j, temp;
        boolean swapped;
        int n=arr.length;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     
                  
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            if (swapped == false)
                break;
        }
       

    }
	static void SelectionSort(int arr[]) 
    { 
        int n = arr.length; 
 
        for (int i = 0; i < n-1; i++) 
        { 

            int min_index = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_index]) 
                    min_index = j; 
            int temp = arr[min_index]; 
            arr[min_index] = arr[i]; 
            arr[i] = temp; 
        } 
    }
	static void InsertionSort(int arr[])
	{
		int n=arr.length;
		for(int i=1; i<n; i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
					
			}
			arr[j+1]=key;
		}
	}
	static void QuickSort(int arr[])
			{
		      sort(arr,0,arr.length-1);
			}
	static void sort(int arr[],int low,int high)
	{
		
		if (low < high)
        {
          
			int pi=partition(arr,low,high);
 
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
	}
	static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=-1;
		for(int j=low; i<high; j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
}
