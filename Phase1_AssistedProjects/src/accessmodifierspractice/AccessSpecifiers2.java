package accessmodifierspractice;
//2. using private access specifiers
class Priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
}

public class AccessSpecifiers2 {

	public static void main(String[] args) {
				//private
				System.out.println("Private Access Specifier");
				Priaccessspecifier  obj = new Priaccessspecifier(); 
		        //trying to access private method of another class 
		        //obj.display();

	}

}
