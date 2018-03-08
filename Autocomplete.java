
public class Autocomplete {// implement sorting algorithm in this class
	public Term[] terms;
	/* Initializes the data structure from the given array of terms. */
	public Autocomplete(Term[] terms){
		this.terms = terms;
	}
	/* Returns all terms that start with the given prefix, in descending
	order of weight. */
	public Term[] allMatches(String prefix){
		 int first, last;
		 first = BinarySearchDeluxe.firstIndexOf(terms, prefix, Comparator<prefix> comp);
		 last = BinarySearchDeluxe.lastIndexOf(terms, prefix, Comparator<prefix> comp);
		 Term[] temp = new Term[last-first];
		 for(int i = first; i <= last; i++) {
			 temp[i] = terms[i];
			 System.out.println(temp[i]);
		 }
	}
	public static void sort(Comparable[] a) {
		 int N = a.length;
		 Comparable[] aux = new Comparable[N];
		 for(int sz = 1; sz < N; sz=sz+sz) {
			 for(int lo = 0; lo < N-sz; lo += sz+sz) {
				 merge(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
			 }
		 }
	}
	 private static void merge(Comparable[]a, Comparable[] aux, int lo, int mid, int hi) {
		 Comparator<Term> comparator;
		 for(int k = lo; k<=hi; k++) {
			 aux[k] = a[k];
		 }
		 int i = lo;
		 int j = mid+1;
		 for(int k=lo; k<=hi;k++) {
			 if(i>mid)break;
			 else if(j>hi) {
				 a[k] = aux[i];
				 i++;}
			 else if(comparator.compare(a[i], a[j])==1){
				 a[k]=aux[j];
				 j++;}
			 else {
				 a[k] = aux[i];
				 i++;}
		 }
	 }
}
