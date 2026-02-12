import java.io.*;
import java.util.*;
class UserMainCode{
public int totalHillWeight(int input1,int input2,int input3){
int sum=0;
for(int i=1;i<=input1;i++){
int weight=input2+(i-1)*input3;
sum=sum+(i*weight);
}
return sum;
}
}