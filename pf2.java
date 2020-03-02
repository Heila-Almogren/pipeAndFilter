Filter2.java: 
package pf;
import java.io.*;
public class Filter2 extends Thread{
PipedWriter myPw;
public Filter2 (PipedWriter pw) { 
myPw-pw; 
}
public void run() {
int j;
try {
for (int j = 1; j<100; j++)
pw.write(j);
pw.write(-1); }
catch (Exception e){
    
}
}
}