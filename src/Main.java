import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        System.out.println(boxer1);
        var boxer2 = 82.7;
        System.out.println(boxer2);
        var weight = boxer1 + boxer2;
        System.out.printf("Общий вес двух боксёров: " + weight + " кг.");
        var weightDifference = boxer2 - boxer1;
        System.out.printf("Разница между весом второго боксёра и первого: " + weightDifference + " кг.");

        // Задача 7
        System.out.println("Задача 7");
        System.out.printf("Разница весов двух боксеров " + weightDifference + ". (1 способ)");

        // Задача 8
        System.out.println("Задача 8");
        var allTime = 640;
        var staffTime = 8;
        System.out.printf("Всего сотрудников в компании - " + allTime / staffTime + " человек.");
        var staffer = allTime / staffTime + 94;
        System.out.printf("Если в компании работает " + staffer + " человек, то всего " + allTime / staffer + " часов работы может быть разделено между сотрудниками.");
    }
}