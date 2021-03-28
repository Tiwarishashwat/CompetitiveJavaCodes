 static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(stack.isEmpty())
                {
                    return "NO";
                }
                else if(stack.peek()== '(' && s.charAt(i)==')')
                {
                    stack.pop();
                }
                else if(stack.peek()== '{' && s.charAt(i)=='}')
                {
                    stack.pop();
                }
                else if(stack.peek()== '[' && s.charAt(i)==']')
                {
                    stack.pop();
                }
                else
                {
                    return "NO";
                }
            }
        }
        if(!stack.isEmpty())
        {
            return "NO";
        }
        return "YES";
    }