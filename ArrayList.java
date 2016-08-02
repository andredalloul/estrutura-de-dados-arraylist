package br.com.dalloul.arraylist;

public class ArrayList {

	public static void main(String[] args) {

		java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();

		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("Z");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.add(1, "B");
		System.out.println(arrayList);
		arrayList.remove(5);
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains("A"));

	}

}
