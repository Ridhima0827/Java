import java.io.*;
import java.util.*;
class UserMainCode{
public int isPalinNumPossible(int input1){
int[] fre=new int[10];
int count=0;
while(input1>0){
fre[input1%10]++;
input1/=10;
}
for(int i=0;i<10;i++){
if(fre[i]%2!=0)
count++;
}
if(count<=1)
return 2;
return 1;
}
}