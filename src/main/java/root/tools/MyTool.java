package root.tools;

import java.util.Arrays;

public abstract class MyTool {

	private String s;

	public abstract boolean isName(String s);

	public static void Test1() {
		Test2();
	}

	public static void Test2() {
		int num[] = { 1, 2 };
	}

	public abstract void Test3();

	public static void main(String args[]) {

		System.out.println(" ");
		A a = new B();
		System.out.println(" ");
		a = new B();
		System.out.println("");
		int[] arr={7,3,4,5,2,1,9,10,8,6};
		Arrays.sort(arr);
		QuickSort.quickSort(arr);
		for(int t:arr){
			System.out.print(t+" ");
		}
	}

	// 冒泡排序
	public static void bubbleSort(int[] numbers) {
		int temp; // 记录临时中间值
		int size = numbers.length; // 数组大小
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (numbers[i] > numbers[j]) { // 交换两数的位置
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
	//快速排序
	public static void quickSort(int[] numbers, int start, int end) {   
	    if (start < end) {   
	        int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）   
	        int temp; // 记录临时中间值   
	        int i = start, j = end;   
	        do {   
	            while ((numbers[i] < base) && (i < end))   
	                i++;   
	            while ((numbers[j] > base) && (j > start))   
	                j--;   
	            if (i <= j) {   
	                temp = numbers[i];   
	                numbers[i] = numbers[j];   
	                numbers[j] = temp;   
	                i++;   
	                j--;   
	            }   
	        } while (i <= j);   
	        if (start < j)   
	            quickSort(numbers, start, j);   
	        if (end > i)   
	            quickSort(numbers, i, end);   
	    }   
	}
}


class A extends ClassLoader implements IA {
	String $34 = "";
	static {
		System.out.print("1");
	}

	public A() {
		System.out.print("2");
	}
}

class B extends A {
	static {
		System.out.print("a");
	}

	public B() {
		System.out.print("b");
	}
}

interface IA {
	default void out() {
		System.out.println("IA.out()");
	};
}