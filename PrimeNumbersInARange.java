import java.io.*;
import java.util.*;
class UserMainCode{
public int countPrimeInRange(int input1,int input2){
int count=0;
for(int i=input1;i<=input2;i++){
boolean prime=true;
for(int j=2;j<i;j++){
if(i%j==0)
prime=false;
}
if(prime)
count++;
}
return count;
}
}