public class Main {
    public static void main(String[] args) {

        Circle circles [] = new Circle[10];



        for (int i = 0; i < circles.length; i++) {

            circles[i] = new Circle(Math.random()*(10-1)+1);

        }
        int count =0;
        for(int i = 0; i < circles.length; i++) {

            if(circles[i].getArea() % 3 == 0) {
                count++;
                System.out.println("Количество кругов кратным 3  = " + count+ ": " + circles[i]);

            }

        }
    }
}
