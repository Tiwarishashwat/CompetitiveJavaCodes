boolean isPower(int n) {
     for (int x = 2; x <= Math.sqrt(n); x++) {
            int y = 2;
 
            double p = Math.pow(x, y);
 
            while (p <= n && p > 0) {
                if (p == n)
                    return true;
                y++;
                p = Math.pow(x, y);
            }
        }
        return false;

}
