class Solution {
    public int reverse(int x) {
        long answer=0;
        int digit=1;
        
        while(x!=0)
        {
            digit=x%10;
            answer=answer*10+digit;
            x=x/10;
        }
        if(answer<=-(Math.pow(2,31)) || answer>=(Math.pow(2,31)-1))
            return 0;
        return (int)answer;
    }
}