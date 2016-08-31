import java.util.Stack;
import java.util.Scanner;
import java.lang.String;


class MultilineInputSolution {

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	String	str = new String();
	int i;
	i = sc.nextInt();
	
	while(i>0){
	str = sc.next();
	Stack stk = new Stack();
	String rnp = new String();
	int len = str.length();
	char c;		
	for(int k=0;k<len;k++){
	c = str.charAt(k);
	switch(c){
		case '(': break;

		case '+': stk.push(c);
			  break;
	
		case '-': stk.push(c);		
			  break;
		
		case '*': stk.push(c);		
			  break;
 
		case '/': stk.push(c);		
			  break;
 	
		case '^': stk.push(c);
			  break;

		case ')': rnp = rnp + stk.pop();
			  break;

		default : rnp = rnp + c;	
			   break;
		}	
			}
		System.out.println(rnp);
		i--;
		}
	}
}
