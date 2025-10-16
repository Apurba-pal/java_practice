public class questions_2 {
    public boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }


    public int array_sum(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }

    public int countVowel(String s){
        int count = 0;
        String str = "aeiouAEIOU";
        for(int i = 0;i<s.length();i++){
            if(str.indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Dog dd = new Dog();
        d.bark();
    }
}


class Dog{
    String name;
    int Age;

    public void bark(){
        System.out.println("woof!");
    }
}
