public class rmDuplicates {
    public static void main(String[] args) {
        String str = "aabbedfgffhjkjjzxv";

        removeDup(str,0, new StringBuilder(""), new boolean[26]);
            }
        
private static void removeDup(String str, int i, StringBuilder sb, boolean[] bs) {
        
    if(i==str.length()){System.out.println(sb); return;}
    char curChar = str.charAt(i);
    if(bs[curChar-'a']==true){

        removeDup(str, i+1, sb, bs);
    }else{
        bs[curChar-'a'] = true;
        removeDup(str, i+1, sb.append(curChar), bs);
    }
            }
}
