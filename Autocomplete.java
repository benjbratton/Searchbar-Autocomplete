
public class Autocomplete {// implement sorting algorithm in this class
 /* Initializes the data structure from the given array of terms. */
 public Autocomplete(Term[] terms)
 /* Returns all terms that start with the given prefix, in descending
order of weight. */
 public Term[] allMatches(String prefix){
  int first, last;
first = BinarySearchDeluxe.firstIndexOf(terms, prefix, Comparator<prefix>);
last = BinarySearchDeluxe.lirstIndexOf(terms, prefix, Comparator<prefix>)
}
