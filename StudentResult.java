 class Student 
{
    String name;
    int studentclass;
    float result;
    Student(String s, int sClass)
    {
        System.out.println("Added student:"+name+" to the roll of the class"+studentclass);
    }
    public String getname(){
        return name;
    }
    public void publish()
    {
        if(result>=33.33)
        {
            System.out.println(name+"has been promoted to class"+studentclass+1);
        }
        else{
            System.out.println(name+"has been retained in class"+studentclass);
        }
    }    
}
class Result extends Student{
    int subject1;
    int subject2;
    int subject3;
    Result (int a,int b,int c,String s,int sclass){
    super(s,sclass);
    subject1=a;
    subject2=b;
    subject3=c;
    System.out.println(name+"obtained"+subject1+"marks in subject1");
    System.out.println(name+"obtained"+subject2+"marks in subject2");
    System.out.println(name+"obtained"+subject3+"marks in subject3");
        }    public void calculation()
    {
        super.result=((subject1+subject2+subject3)*100)/300;
        publish();
    }
}
class answer{
    public static void main(String args[])
    {
        
        Student s1=new Student("john",1);
        Result r1=new Result(35,34,67,"john",1);
        r1.calculation();
    }
}
