public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        //Задача 6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Задача 6");
        System.out.println(totalWeight);
        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println(weightDifference);
        //Задача 7
        System.out.println("Задача 7");
        weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println(weightDifference);
        weightDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println(weightDifference);
        //Задача 8
        var totalHours = 640;
        var numberOfHoursPerEmployee = 8;
        var numberOfEmployees = totalHours / numberOfHoursPerEmployee;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании " + numberOfEmployees + " человек");
        var employeesAdded = 94;
        var totalNumberOfEmployees = numberOfEmployees + employeesAdded;
        System.out.println("Теперь в компании " + totalNumberOfEmployees + " человека");
        var totalNumberOfHours = totalNumberOfEmployees * numberOfHoursPerEmployee;
        System.out.println("Если в компании работает " + totalNumberOfEmployees + " человек, то всего " + totalNumberOfHours + " часов работы может быть поделено между сотрудниками");
    }
}