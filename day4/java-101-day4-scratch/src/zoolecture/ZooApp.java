package zoolecture;

import zoolecture.person.Manager;

public class ZooApp {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Manager 1");
        manager1.setName("Jacob");
        manager1.setAge(23);

        System.out.println(manager1.getName());
    }
}
