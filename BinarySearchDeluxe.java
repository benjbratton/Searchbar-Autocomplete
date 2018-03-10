// Course:  CPS 350
// Semester: 2018 Spring
// Name: Benjamin Bratton and Nick Cagle
// Section: 01
// Assignment: 03
// Purpose: This program is designed to guess what the user is trying to type in a search engine.
//			Based on a database of past searches it will suggest the top 10 (or less) likely
//			recomendations for the user to select.
// Date completed: March 9, 2018

import java.util.Comparator; 
public class BinarySearchDeluxe {
  
 /* Returns the index of the first key in a[] that equals the search key, or -1 if no such key. */
 public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator){
	 //Throw exception if any of the parameters are null
	 if (a == null || key == null || comparator == null) throw new java.lang.NullPointerException();
	 if (a.length == 0) return -1;
	 int low = 0, high = a.length - 1, mid;
	 
	 	 
	 //Binary search to find the index of the first element of key.
	  while (low <= high){
	     mid = low + (high - low) / 2;

	     if (comparator.compare(a[mid], key) == 0 && (mid == 0 || comparator.compare(a[mid - 1], key) == -1)) return mid;
	     else if (comparator.compare(a[mid], key) == -1) low = mid + 1;
	     else high = mid - 1;
	   } //end while
	 return -1; //returns -1 if no such key	 
 } //end firstIndexOf
  
 /* Returns the index of the last key in a[] that equals the search key, or -1 if no such key. */
 public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator){
	 //Throw exception if any of the parameters are null
	 if (a == null || key == null || comparator == null) throw new java.lang.NullPointerException();
	 if (a.length == 0) return -1;
	 int low = 0, high = a.length - 1, mid;
	 
	 //Binary search to find the index of the first element of key.
	  while (low <= high){
	     mid = low + (high - low) / 2;
	     if (comparator.compare(a[mid], key) == 0 && (mid == a.length - 1 || comparator.compare(a[mid + 1], key) == -1)  ) return mid;
	     else if (comparator.compare(a[mid], key) == -1) high = mid - 1;
	     else low = mid + 1;
	   } //end while
	 return -1; //returns -1 if no such key
 } //end lastIndexOf
} //end BinarySearchDeluxe
