import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for(int i=0; i<n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            arr[i] = new Person(age, name);
        }
        Arrays.sort(arr, new Comparator<Person>(){
	    @Override
	    public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	    }
        });
        for(int i=0; i<n; i++) {
            System.out.println(arr[i].age + " " + arr[i].name);
        }
    }
}

class Person{
    int age;
    String name;
	
    public Person() {}
    public Person(int age, String name) {
	this.age = age;
	this.name = name;
    }
}