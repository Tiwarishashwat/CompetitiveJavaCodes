static int[] matchingStrings(String[] strings, String[] queries) {
        int counter[]=new int[queries.length];
        int i=0;
        for(String q:queries)
        {
            int count=0;
            for(String a:strings)
            {
                if(a.equals(q))
                {
                    count++;
                }
            }
            counter[i]=count;
            i++;
        }
        return counter;
    }