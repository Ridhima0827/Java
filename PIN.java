import java.io.*;
import java.util.*;
class UserMainCode{
public int createPIN(int input1,int input2,int input3){
int max=-1;
int m1=Math.min(input1%10,Math.min(input2%10,input3%10));
max=Math.max(max,Math.max(input1%10,Math.max(input2%10,input3%10)));
int m2=Math.min(input1/10%10,Math.min(input2/10%10,input3/10%10));
max=Math.max(max,Math.max(input1/10%10,Math.max(input2/10%10,input3/10%10)));
int m3=Math.min(input1/100,Math.min(input2/100,input3/100));
max=Math.max(max,Math.max(input1/100,Math.max(input2/100,input3/100)));
return max*1000+m3*100+m2*10+m1;
}
}