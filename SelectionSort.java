package main;

public class SelectionSort
{
	public static void sort(int[] arr)
	{
		int N = arr.length;
        int i = 0;
        int j = 0;
        int pos = 0;
        int temp = 0;
        for (i = 0; i < N; i++)
        {
            pos = i;
            for (j = i+1; j < N; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }
            /* Swap arr[i] and arr[pos] */
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;
        }
      }
}
