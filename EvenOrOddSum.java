import java.io.*;
import java.util.*;
class UserMainCode{
public int EvenOddDigitsSum(int input1,String input2){
int sum1=0;
int sum2=0;
while(input1!=0){
int digit=input1%10;
if(digit%2==0){
sum1+=digit;
}
else{
sum2+=digit;
}
input1=input1/10;
}
if(input2.equals("odd")){
return sum2;
}
else{
return sum1;}
}
}
