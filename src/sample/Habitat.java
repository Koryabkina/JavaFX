package sample;

public class Habitat {
    private int N1=2, N2=3;
    private int P1=70, P2=80;
    public void update(int time){
        System.out.println(time);
        if (time%N1==0) {

            // TODO: 22.02.2019 Почитать о рандоме
            int p1 = (int)Math.floor(Math.random()*100);
            if (p1<=P1) {
                int x = (int)Math.floor(Math.random()*900);
                int y = (int)Math.floor(Math.random()*800);
                Cat cat = new Cat(x,y);
            }
        }
        if (time%N2==0) {
            // TODO: 22.02.2019 Почитать о рандоме
            int p2 = (int)Math.floor(Math.random()*100);
            if (p2<=P2) {
                int x = (int)Math.floor(Math.random()*900);
                int y = (int)Math.floor(Math.random()*800);
                Dog dog = new Dog(x,y);
            }
        }


    }
}
