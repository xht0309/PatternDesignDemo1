package xxxhaotian.test7;

public class Adapter implements DataOperation{
	BinarySearch bs = new BinarySearch();
	QuickSort qs = new QuickSort();
	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		qs.quickSort(a);
	}

	@Override
	public void search(int[] a, int b) {
		// TODO Auto-generated method stub
		bs.binarySearch(a, b);
	}

}
