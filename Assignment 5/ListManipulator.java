import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListManipulator {
	ArrayList<Integer> sort(ArrayList<Integer> myList, Boolean ascending) {
		Iterator listIterator = myList.iterator();

		if (ascending) {
			for (int j = 0; j < myList.size() - 1; j++) {
				for (int i = 0; i < myList.size() - j - 1; i++) {

					if (myList.get(i) > myList.get(i + 1)) {
						int temp = myList.get(i);
						myList.set(i, myList.get(i + 1));
						myList.set(i + 1, temp);
					}
				}
			}
		} else {
			for (int j = 0; j < myList.size() - 1; j++) {
				for (int i = 0; i < myList.size() - j - 1; i++) {

					if (myList.get(i) < myList.get(i + 1)) {
						int temp = myList.get(i);
						myList.set(i, myList.get(i + 1));
						myList.set(i + 1, temp);
					}
				}
			}
		}
		return myList;
	}

	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
		int small = myLst.get(0);
		int large = myLst.get(0);
		int smallIndex = 0;
		int largeIndex = 0;
		for (int i = 0; i < myLst.size() - 1; i++) {
			if (myLst.get(i) < small) {
				small = myLst.get(i);
				smallIndex = i;
			}
			if (myLst.get(i) > large) {
				large = myLst.get(i);
				largeIndex = i;
			}
		}
		myLst.set(smallIndex, large);
		myLst.set(largeIndex, small);
		return myLst;
	}

	void table(ArrayList<Integer> myLst) {
		HashSet<Integer> table = new HashSet<Integer>();
		for (int i = 0; i < myLst.size(); i++) {
			table.add(myLst.get(0));
			if(table.hashCode() != 0) {
				sort(myLst, true);
			}
		}
		for(int i = 0; i < myLst.size(); i++) {
			System.out.println(myLst.get(i));
		}
	}
}
