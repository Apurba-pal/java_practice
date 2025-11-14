package Basic;


class Student{
    int age;
    double height;
    Student(int age, double height){
        this.age=age;
        this.height=height;
    }

    @Override
    public boolean equals(Object obj){
        Student s = (Student)obj;
        return this.age==s.age&&this.height==s.height;
    }
    
    public static void main(String[] args) {
	Student s1 = new Student(25, 5.5);
	Student s2 = new Student(25, 5.5);
	System.out.println("_______");
	System.out.println(new Student(1,5.2).equals(new Student(2,5.2)));
	System.out.println("_______");
	if(s1.equals(s2)) {
		System.out.println("contet are same");
	}else {
		System.out.println("content are different");
	}
	}
}

