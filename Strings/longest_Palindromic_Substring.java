class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0) return "";
        int start=0,maxLen=0;
        for(int i=0;i<s.length();i++){
            
            int[] odd=expandAroundCentre(s,i,i);
            if(odd[1]-odd[0]+1>maxLen){
                start=odd[0];
                maxLen=odd[1]-odd[0]+1;
            }

            int[] even=expandAroundCentre(s,i,i+1);
            if(even[1]-even[0]+1>maxLen){
                start=even[0];
                maxLen=even[1]-even[0]+1;
            }
        }
        return s.substring(start,start+maxLen);
    }
int[] expandAroundCentre(String s,int left,int right){
    while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
        left--;
        right++;
    }
    return new int[]{left + 1, right - 1};
}
}
