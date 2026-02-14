import java.io.*;
import java.util.*;
class UserMainCode{
public int MostFrequentDigit(int input1,int input2,int input3,int input4){
int[] freq=new int[10];
int[] arr={input1,input2,input3,input4};
for(int i=0;i<4;i++){
int num=Math.abs(arr[i]);
if(num==0){
freq[0]++;
}
while(num>0){
int digit=num%10;
freq[digit]++;
num=num/10;
}
}
int max=0;
int result=0;
for(int i=0;i<10;i++){
if(freq[i]>max || (freq[i]==max&&i>result)){
max=freq[i];
result=i;
}
}
return result;
}

}