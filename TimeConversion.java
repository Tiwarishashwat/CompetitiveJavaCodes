static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String getFormat=s.substring(8,10);
         int h=Integer.parseInt(s.substring(0,2));
         if(getFormat.equals("PM"))
         {
             if(h>=1 && h<12) s=String.valueOf(h+12)+s.substring(2,8);
             else if(h==12) s=s.substring(0,8);
             
         }
         else if(getFormat.equals("AM"))
         {
          if(h==12) s="00"+s.substring(2,8);
          else s=s.substring(0,8);
         }
         return s;
    }