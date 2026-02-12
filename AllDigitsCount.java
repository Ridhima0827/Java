import java.io.*;
import java.util.*;
class UserMainCode{
public int allDigitsCount(int input1){
int count=0;
while(input1!=0){
int digit=input1%10;
count++;
input1=input1/10;
}
return count;
}
}