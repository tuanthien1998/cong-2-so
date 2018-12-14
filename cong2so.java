import java.util.*;
class cong2so{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("please give me first number !!!");
        String num1= sc.nextLine();
		System.out.println("please give me second number !!!");
        String num2= sc.nextLine();
        System.out.println(sum(num1,num2));
	}

	public static String sum(String s1, String s2) {
	String result = "";
	int leind1 = s1.length(); 
	int leind2 = s2.length();
	int max = Math.max(leind1,leind2);
	int flag = 0; 
	for (int i = 0; i < max; i++) {
		int ind1 = leind1 - i - 1;
		int ind2 = leind2 - i - 1;
		char digit1 = '0';
		char digit2 = '0';
	if (ind1 >= 0) {
		digit1 = s1.charAt(ind1); 
					}
	else digit1 = '0';		
		if (ind2 >= 0) {
			digit2 = s2.charAt(ind2);
						}
		else digit2 = '0';
		int temp1 = digit1 - '0'; 
		int temp2 = digit2 - '0';	
		int sum1_2 = temp1 + temp2 + flag; 
	if (i < max) { 
		result += (sum1_2 % 10);
				} 
	else {
		result = sum1_2 + result;
		}
			
		flag = sum1_2 / 10;
		}
		String rev = "";
	for (int i = 0; i < max; i++){
		char digit = result.charAt(result.length() - i - 1);
		rev += (digit - '0');
		}
		return rev;
	}
}