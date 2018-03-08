import java.util.Comparator; 
public class BinarySearchDeluxe {
  
 /* Returns the index of the first key in a[] that equals the search key, or -1 if no such key. */
 public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator){
	 //Throw exception if any of the parameters are null
	 if (a == null || key == null || comparator == null) throw new java.lang.NullPointerException;
	 
	 int low = 0, high = a.length - 1, mid;
	 
	 //Binary search to find the index of the first element of key.
	  while (low <= high){
	     mid = low + (high - low) / 2;	    
	     if (mid == 0 || comparator.compare(a[mid-1], key) < 0 && comparator.compare(a[mid], key) == 0) return mid;
	     else if (comparator.compare(a[mid], key) < 0) low = mid + 1;
	     else high = mid - 1;
	   } //end while
	 return -1; //returns -1 if no such key
 } //end firstIndexOf
  
 /* Returns the index of the last key in a[] that equals the search key, or -1 if no such key. */
 public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator){
	 //Throw exception if any of the parameters are null
	 if (a == null || key == null || comparator == null) throw new java.lang.NullPointerException;
	 
	 int low = 0, high = a.length - 1, mid;
	 
	 //Binary search to find the index of the first element of key.
	  while (high >= low){
	     mid = low + (high - low) / 2;	    
	     if (mid == a.length - 1 || comparator.compare(a[mid+1], key) > 0 && comparator.compare(a[mid], key) == 0) return mid;
	     else if (comparator.compare(a[mid], key) > 0) high = mid - 1;
	     else low = mid + 1;
	   } //end while
	 return -1; //returns -1 if no such key
 } //end lastIndexOf
} //end BinarySearchDeluxe
