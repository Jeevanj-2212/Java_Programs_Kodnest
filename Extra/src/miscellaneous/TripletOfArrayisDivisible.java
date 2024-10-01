package miscellaneous;

public class TripletOfArrayisDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int d=5;
		int arr[]= {3,3,4,7,8};
		int ans=findTheTriplet(arr,d);
		System.out.println(ans);

	}
public static int findTheTriplet(int arr[],int d) {
	int count=0;
	for(int i=0;i<arr.length-2;i++) {
		for(int j=i+1;j<arr.length-1;j++) {
			for(int k=j+1;k<arr.length;k++) {
				int sum=arr[i]+arr[j]+arr[k];
				if(sum%d==0) {
					count++;
				}
			}
		}
	}
	return count;
}
}
