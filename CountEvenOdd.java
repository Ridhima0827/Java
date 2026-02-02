import java.io.*;
import java.util.*;
class UserMainCode{
public int countEvenOdds(int input1,int input2,int input3,int input4, int input5,String input6){
int evenCount=0;
int oddCount=0;
int[]= arr={input1,input2,input3,input4,input5);
for(int num: arr){
if(num%2==0)
evenCount++;
else
oddCount++;
}
if(input6.equals("even))
return evenCount;
else
return oddCount;
}}