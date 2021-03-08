public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        Collections.sort(a);
        Collections.sort(b);
        int counter=0;
        int border1=Math.min(a.get(a.size()-1),b.get(0));
        int border2=Math.max(a.get(a.size()-1),b.get(0));
        while(border1<=border2)
        {
            boolean isFactor=true;
            boolean isMultiple=true;
            for(int i=0;i<a.size();i++)
            {
                if(border1%a.get(i)!=0)
                {
                    isFactor=false;
                    break;
                }
            }
            if(isFactor)
            {
              for(int i=0;i<b.size();i++)
                {
                if(b.get(i)%border1!=0)
                    {
                    isMultiple=false;
                    break;
                    }
                }   
            }
            if(isFactor && isMultiple)
            {
                counter++;
            }
            border1++;
        }
        return counter;
    }