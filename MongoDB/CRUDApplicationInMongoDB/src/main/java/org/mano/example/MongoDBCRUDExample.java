package org.mano.example;

import java.util.Arrays;

public class MongoDBCRUDExample {

    public static void main(String[] args) {
        CRUD c = new CRUD();
        c.readAll();
        c.create("Introduction to Software Engineering", "102-304-506",
                Arrays.asList("Jalote", "Ansari"),
                Arrays.asList("software", "software engineering"));
        c.create("Numerical Analysis", "999-888-777",
                Arrays.asList("Moulah", "Kabir"),
                Arrays.asList("math", "numerical"));
        c.readAll();
        c.updateCategory("999-888-777",
                Arrays.asList("mathematics", "numerical", "computation"));
        c.readAll();
        c.delete("102-304-506");
        c.readAll();
    }
}
