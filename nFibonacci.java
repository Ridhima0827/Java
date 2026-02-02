import java.io.*;
import java.util.*;
class UserMainCode{
public long nthFibonacci(int input1){
int N=input1;
if(N==1)
return 0;
if(N==2)
return 1;
long a=0;
long b=1;
long c=0;
for(int i=3;i<=N;i++){
c=a+b;
a=b;
b=c;
}
return c;
}
}