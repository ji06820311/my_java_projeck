package ch05_package_inheritance.animalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        // 타입[] 배열명 = {}
        Animal01[] anima = {
                new GoldFish01("금붕어", 2, "거실 어항", 10, 2),
                new Lion01("라이언", 15,"세령게티",10,4),
                new Eagle01("독수리",20,"푸른 창공",50,2)
        };

        for (int i = 0; i < anima.length; i++) {
            anima[i].showInfo();

            if(anima[i] instanceof GoldFish01){
                GoldFish01 goldFish = (GoldFish01)anima[i];
                goldFish.swim();
            }

            if(anima[i] instanceof Lion01){
                Lion01 lion = (Lion01)anima[i];
                lion.run();
            }

            if(anima[i] instanceof Eagle01){
                Eagle01 eagle = (Eagle01) anima[i];
                eagle.fly();;
            }
        }

    }

}
