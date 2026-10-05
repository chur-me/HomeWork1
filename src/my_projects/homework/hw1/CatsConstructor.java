package my_projects.homework.hw1;

import java.util.Objects;

public final class CatsConstructor {
    private final int paws;
    private final String snout;
    private final Cat person;
    private final boolean zoomies;
    public CatsConstructor(int paws, String snout, Cat person, boolean zoomies) {
        this.paws = paws;
        this.snout = snout;
        this.person = copyOf(person);
        this.zoomies = zoomies;
    }

    public int getPaws() {
        return paws;
    }
    public String getSnout() {
        return snout;
    }
    public Cat getPerson() {
        return copyOf(person);
    }
    public boolean getZoomies() {
        return zoomies;
    }

    //Создаем копию объекта типа Cat через конструктор Cat, с одним входным параметром
    private Cat copyOf(Cat other) {
        return new Cat(other);
    }

    //Переопределяем toString у CatsConstructor
    @Override
    public String toString() {
        return person.toString() + " " + paws + " " + snout + " " + zoomies;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CatsConstructor catsConstructor = (CatsConstructor) obj;
        return paws == catsConstructor.paws
                && zoomies == catsConstructor.zoomies
                && Objects.equals(snout, catsConstructor.snout)
                && Objects.equals(person, catsConstructor.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paws, zoomies, snout, person);
    }
}
