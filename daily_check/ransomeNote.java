public class ransomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count=new int[26];

        for(char c:magazine.toCharArray())
        {
            count[c-'a']++;
        }

        for(char c:ransomNote.toCharArray())
        {
            if(count[c-'a']==0)
            {
                return false;
            }
            else
            {
                count[c-'a']--;
            }
        }
        return true;

        // Map<Character,Integer> map=new HashMap<>();

        // for(char c:magazine.toCharArray())
        // {
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        // for(char c:ransomNote.toCharArray())
        // {
        //     if(!map.containsKey(c) || map.get(c)==0)
        //     {
        //         return false;
        //     }
        //     else
        //     {
        //         map.put(c,map.get(c)-1);
        //     }
        // }
        // return true;




        
    }
}

