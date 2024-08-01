class Solution {
    public int countSeniors(String[] details) {
        List<String> ls=Arrays.asList(details);
        long count = ls.stream()
                .map(detail -> detail.substring(11, 13))
                .map(Integer::parseInt)                 
                .filter(age -> age > 60)                
                .count();    
        return (int)count;
    }
}