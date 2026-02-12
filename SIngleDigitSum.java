import java.io.*;
import java.util.*;
class UserMainCode{
public int digitSum(int input1){
int original=input1;
if(input1<0)
input1=-input1;
while(input1>=10){
int sum=0;
while(input1!=0){
sum=sum+(input1%10);
input1=input1/10;
}
input1=sum;
}
if(orignal<0)
return -input1;
return input1;
}
}