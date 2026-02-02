import java.io.*;
import java.util.*;
class UserMainCode{
public int isPrime(int input1){
int N=input1;
int flag=1;
for(int i=2;i<N/2;i++){
if(N%i==0)
flag=0;
}
if(flag==0)
return 1;
else
return 2;
}}