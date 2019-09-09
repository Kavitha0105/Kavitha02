package org.JavaPractise;

public class JDBCBank {
public static void main(String[] args) {
	int n=234;
	int i=0, j=0;
	while (n>0) {
	i=n%10;
	j=(j*10)+i;
	n=n/10;
}
	System.out.println(j);
}
}
