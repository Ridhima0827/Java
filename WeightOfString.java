import java.io.*;
import java.util.*;
class UserMainCode{
public int weightOfString(String input1,int input2){
if(input1==null || input1.length()==0)
return 0;
int sum=0;
for(int i=0;i<input1.length();i++){
char ch=input1.charAt(i);
if(Character.toLowerCase(ch);
if(input2==0 && (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')){
continue;
}
sum+=(ch-'a'+1);

}
}
return sum;
}
}