/**
 *  www.samouczekprogramisty.pl/exercise 1
 *  @author £ukasz (archyzone)
 */

/*Rozszerz przyk³ad z robotami z akapitu o klasach anonimowych o
robota witaj¹cego siê w innym jêzyku np. niemieckim.*/

public class AnonymousClasses {
    public static class Robot {
        private final GreetingModule greetingModule;
 
        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }
 
        public void saySomething() {
            greetingModule.sayHello();
        }
    }
 

 
    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzien dobry");
            }
        });
        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });
 
        Robot germanRobot = new Robot( new GreetingModule() {

			@Override
			public void sayHello() {
				System.out.println("guten morgen");
			}
        	
        });

        jan.saySomething();
        john.saySomething();
        germanRobot.saySomething();
    }

}