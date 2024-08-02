package samreen;

public class MissingElements {
		public static int FindMissingNumbers(int[]nums)
		{
			int n=nums.length;
			int actualSum=0;
			int expectedSum=n*(n+1)/2;
			for(int num:nums) {
				actualSum+=num;
			}
			return expectedSum-actualSum;
		}
		public static void main(String args[])
		{
			int nums[]= {0,2,4,6,7,0};
			int Missing=FindMissingNumbers(nums);
			System.out.println(Missing);
		}
	}


