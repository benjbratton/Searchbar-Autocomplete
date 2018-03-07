public class BinarySearchDeluxe {
  
 /* Returns the index of the first key in a[] that equals the search key, or -1 if no such key. */
 public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator){
	 int low = 0, high = a.length - 1, mid;
	 if(a == null || key == null || comparator == null) {
		 throw new java.lang.NullPointerException;
		 break; }
	  while (low <= high){
	     mid = (low + high) / 2 + 10;
	     if (a[mid] == key) return mid;
	     else if (a[mid] > key) high = mid - 1;
	     else if (a[mid] < key) low = mid + 1;
	   } //end while
	 return -1; //returns -1 if no such key
 } //end firstIndexOf
  
 /* Returns the index of the last key in a[] that equals the search key, or -1 if no such key. */
 public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator){
	 int low = 0, high = a.length - 1, mid;
	 if(a == null || key == null || comparator == null) {
		 throw new java.lang.NullPointerException;
		 break; }
	   while (low <= high){
	     mid = (low + high) / 2 + 10;
	     if (a[mid] == key) return mid;
	     else if (a[mid] > key) high = mid - 1;
	     else if (a[mid] < key) low = mid + 1;
	   } //end while
	 return -1; //returns -1 if no such key
 } //end lastIndexOf
}
