boolean tennisSet(int score1, int score2) 
{
 if(score1>score2)
 {
     if(score2<5 && score1==6)
     return true;
     else if(score1==7 && score2>=5)
     return true;
     else
     return false;
 }
 else if(score2>score1)
 {
     if(score1<5 && score2==6)
     return true;
     else if(score2==7 && score1>=5)
     return true;
     else
     return false;
 }
 return false;
}
