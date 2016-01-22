 public class Application2 
 {
	 public static void main (String args[])
	 {
		 String a = "xxy";
		 String b = "xxz"; 
		 String c = "xxyxxxz";
		 System.out.println(isInterleaved (a, b, c, 0, 0, 0));
	 } 
	 private static boolean isInterleaved ( String a, String b, String c, int pos1, int pos2, int pos )
	 {
		 System.out.println(a.substring(pos1) + "," + b.substring(pos2) + "," + c.substring(pos));
		 if (pos >= c.length()) return true; boolean match1 = false; boolean match2 = false;
		 if (pos1 < a.length()) match1 = (c.charAt(pos) == a.charAt(pos1)); 
		 if (pos2 < b.length()) match2 = (c.charAt(pos) == b.charAt(pos2));
		 return ( (match1 && isInterleaved (a, b, c, pos1+1, pos2, pos+1)) || (match2 && isInterleaved (a, b, c, pos1, pos2+1, pos+1)) );
	}
}