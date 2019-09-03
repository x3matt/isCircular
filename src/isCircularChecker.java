public class isCircularChecker {

    public boolean isCircular(String s1,String s2) throws Exception{
        if(s1.length() != s2.length()) throw new InvalidLengthException("Invalid Length Exception");
        String tmp = s1;
        for (int i = 0; i < s1.length(); i++) {
            tmp = tmp.charAt(tmp.length()-1) + tmp.substring(0,tmp.length()-1);
            if(tmp.equals(s2)) {
                return true;
            }
        }
        return false;
    }

}
