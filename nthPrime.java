import java.io.*;
import java.util.*;
class UserMainCode{
public int NthPrime(int input1){
int count=0;
int num=1;
while(count<input1){
num++:
boolean prime=true;
for(int i=2;i<num;i++){
if(num%i==0){
prime=false;
break;
}
}
if(prime)
count++;
}
return num;
}
}