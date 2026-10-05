package my_projects.homework.hw1;

public class Start {
    public static void main(String[] args) {
        Cat aCat = new Cat("Пузырик", "Суетливый");
        CatsConstructor theCat = new CatsConstructor(4, "nice", aCat, true);
        System.out.println(theCat);

        //Сделали copyOf(создание нового Cat с теми же параметрами) в конструкторе CatsConstructor
        // - перекрывавем доступ к исходному объекту в контсрукторе,
        //что бы через сет не изменили исходный объект
        aCat.setName("Лопнул");
        System.out.println(theCat);

        //Сделали copyOf у getPerson типа CatsConstructor
        // - перекрываем доступ к исходному объекту через getPerson,
        // что бы через сет не изменили исходный объект
        Cat mur = theCat.getPerson();
        mur.setName("Лопнул");
        System.out.println(theCat);

        //"Изменяем" объект CatsConstructor - для иммутабельного класса только создать новый
        CatsConstructor theCatNew = new CatsConstructor(4, "nice", new Cat("Булочка","Сладенький"), false);
        System.out.println(theCatNew);

        //CatsConstructor miau = theCat;
        CatsConstructor miau = new CatsConstructor(4, "nice", theCat.getPerson(), true);

        //Пролверка, как отработают переопределенные equals и hashCode
        System.out.println(miau.equals(theCat));
        System.out.println(miau.hashCode() + " " + theCat.hashCode());
    }
}

