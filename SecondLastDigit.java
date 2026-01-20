import java.io.*;
import java.util.*;
class UserMainCode
{
public int secondLastDigitOf(int input1){
if(Math.abs(input1)>10)
return(-1);
return Math.abs(input1)/10%10;
}
}

