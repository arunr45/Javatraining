package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String x[][]=new String[3][5];
		System.out.println("size is "+x.length);
		System.out.println("size of column" +x[0].length);
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		x[1][0]="A";
		x[1][1]="B";
		x[1][2]="C";
		x[1][3]="D";
		x[1][4]="E";
		
		x[2][0]="A";
		x[2][1]="B";
		x[2][2]="C";
		x[2][3]="D";
		x[2][4]="E";
		System.out.println("The array is ");
		
		for(int i=0;i<x.length;i++)
			{
			for(int j=0;j<x[0].length;j++)
			{
				System.out.println(x[i][j]);
			}
		
		// TODO Auto-generated method stub

	}}}


