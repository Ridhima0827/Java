import java.io.*;
import java.util.*;
class UserMainCode{
public int nonRepeatDigitsCount(int input1){
int count=0;
int[] fre=new int[10];
while(input1!=0){
int digit=input1%10;
fre[digit]++;
input1=input1/10;
}
for(int i=0;i<10;i++){
if(fre[i]==1)
count++;
}
return count;
}
}