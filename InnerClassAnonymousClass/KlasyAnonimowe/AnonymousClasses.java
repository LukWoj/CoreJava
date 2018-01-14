
public class AnonymousClasses {
	
    public static class Robot {//statyczna klasa wewnetrzna
    	
        private final GreetingModule greetingModule;
      /*//metoda klasy wewnetrznej.Wewn�trz definicji klasy anonimowej 
    	//mo�emy definiowa� atrybuty czy metody. W praktyce sprowadza 
        si� to przewa�nie do zaimplementowania metod interfejsu dla 
        kt�rego tworzymy klas� anonimow�.*/
        
        
        
        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
        	greetingModule.sayHello();
        }
    }

  

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            public void sayHello() {
                System.out.println("dzien dobry");
            }
        });

        Robot john = new Robot(new GreetingModule() {
            public void sayHello() {
                System.out.println("good morning" );
            }
        });

        jan.saySomething();
        john.saySomething();
    }
}