package org.test.cts;

public class Types {

	public static void main(String[] args) {
		
String s="hello";
String s1="hello";
System.out.println("literal string");
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s1));
  
s= s.concat(s1);
System.out.println(s);
System.out.println(System.identityHashCode(s1));



System.out.println("MUTABLE STRING");

StringBuffer s2=new StringBuffer ("dinesh");
StringBuilder s3=new StringBuilder ("dinesh");
System.out.println("non literal string");
System.out.println(System.identityHashCode(s2));
System.out.println(System.identityHashCode(s3));
s2=s2.append(s3);
System.out.println(s2);
System.out.println(System.identityHashCode(s2));





	}
}
