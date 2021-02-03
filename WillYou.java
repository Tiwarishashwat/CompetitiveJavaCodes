boolean willYou(boolean young, boolean beautiful, boolean loved) 
{
    if (young==true && beautiful==true && loved==false)
    {
        return true;
    }
    else if (loved==true && (beautiful==false || young==false))
    {
        return true;
    }
    return false;
}
