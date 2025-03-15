class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandies=0;
        for(int i:candies){
            maxCandies=Math.max(i,maxCandies);
        }
        List<Boolean> candyRes=new ArrayList<>();
        for(int i:candies)
{
   candyRes.add(i+extraCandies>=maxCandies);
}
return candyRes;    
}

}