package abstraction.interfacedemo;


    public class Cricket implements Sports{
        @Override
        public void play(){
            System.out.println("playing cricket");

        }

        public static void main(String[] args) {
            Cricket obj = new Cricket();
            obj.play();
        }
    }

