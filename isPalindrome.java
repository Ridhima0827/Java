import java.io.*;
import java.util.*;
class UserMainCode{
public int isPaliNum(int input1){
int original=input1;
int rev=0;
while(input1!=0){
int digit=input1%10;
rev=rev*10+digit;
input1=input1/10;
}
if(rev==original)
return 2;
return 1;
}
}

