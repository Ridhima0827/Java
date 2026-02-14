import java.io.*;
import java.util.*;
class UserMainCode{
public int isPalindrome(String input1){
input1=input1.toLowerCase();
for(int i=0;i<input1.length();i++){
if(input1.charAt(i)!=input.charAt(input1.length()-1-i)){
return 1;
}
}
return 2;
}
}