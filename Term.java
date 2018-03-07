public class Term implements Comparable<Term> {
 /* Initializes a term with the given query string and weight. */
 public Term(String query, long weight){
  if(query.equals(null))
   throw new java.lang.NullPointerException();
  if(weight < 0)
   throw new java.lang.IllegalArgumentException();
 }
 /* Compares the two terms in descending order by weight. */
 public static Comparator<Term> byReverseWeightOrder(){
  
 }
 /* Compares the two terms in lexicographic order but using only the first
r characters of each query. */
 public static Comparator<Term> byPrefixOrder(int r){
  if (r < 0) throw new java.lang.IllegalArgumentException();
 }
 /* Compares the two terms in lexicographic order by query. */
 public int compareTo(Term that){
  
 }
 // Returns a string representation of this term in the following format:
 // weight (i.e., ??.toString()), followed by a tab, followed by query.
 public String toString(){
  return weight.toString() + "    " + query;
 }
}
