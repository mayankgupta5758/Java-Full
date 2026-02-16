package com.mayank.syntax;

public class Hello {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int sum = add(a, b); // 👈 yahan breakpoint lagao
		System.out.println(sum);
		System.out.println("Hello World");
	}

	static int add(int x, int y) {
		return x + y;
	}

	/*
	 * public class Test { public static void main(String[] args) { int a = 5; int b
	 * = 10; int sum = add(a, b); // 👈 yahan breakpoint lagao
	 * System.out.println(sum); }
	 * 
	 * static int add(int x, int y) { return x + y; } } 🔍 1️⃣ Step Into (F5 in
	 * Eclipse) 👉 Agar cursor add(a, b) line par hai aur aap Step Into (F5) press
	 * karte ho: Debugger method ke andar chala jayega Direct add() method ki first
	 * line par le jayega Aap dekh sakte ho x = 5, y = 10 ✔ Use kab kare? Jab method
	 * ke andar kya ho raha hai dekhna ho Logic check karna ho
	 * 
	 * 🔍 2️⃣ Step Over (F6 in Eclipse) 👉 Agar cursor add(a, b) line par hai aur
	 * aap Step Over (F6) press karte ho: Method ke andar nahi jayega Puri method
	 * execute karke next line par aa jayega Direct System.out.println(sum); par aa
	 * jayega ✔ Use kab kare? Jab method already tested hai Andar ka code dekhna
	 * nahi hai
	 * 
	 * 🔹 Step Return (F7) → Current method se bahar aa jata hai
	 * 🔹 Resume (F8) → Program next breakpoint tak continue karta hai
	 */
}