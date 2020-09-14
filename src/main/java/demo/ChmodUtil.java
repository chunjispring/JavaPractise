package demo;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChmodUtil {
    public static void main(String[] args) {
        String path = "";
        if (args.length != 1) {
            System.out.println("No Args");
            return;
        } else {
            path = args[0];
            System.out.println(path);
        }

        Path p = Paths.get(path);

        File[] a = p.toFile().listFiles();
        assert a != null;
        for (File t : a) {
            Boolean rev = t.setExecutable(true, false);
        }

        System.out.println("SUCCESS");
    }
}
