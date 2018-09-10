package sqldemo;

public class Shuzu2w {
	public static void main(String[] args){
//		int[][]arr={{1,3,2},{2,4},{9,5,6}};
//		for(int i=0;i<arr.length;i++){
//			for(int j=0;j<arr[i].length;j++){
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		//二维数组的遍历
		int[][]arr={{1,3,2},{42,42},{9,5,6},{77,66,33,44}};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
	}
		
	}

