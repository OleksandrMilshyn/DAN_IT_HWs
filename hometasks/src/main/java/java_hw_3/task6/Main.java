package java_hw_3.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ideaWindows = "https://www.jetbrains.com/idea/download/?section=windows";
        String ideaMac = "https://www.jetbrains.com/idea/download/?section=mac";
        String ideaLinux = "https://www.jetbrains.com/idea/download/?section=linux";

        String gitWindows = "https://git-scm.com/downloads/win";
        String gitMac = "https://git-scm.com/downloads/mac";
        String gitLinux = "https://git-scm.com/downloads/linux";

        String javaLinux = "https://download.oracle.com/java/24/latest/jdk-24_linux-aarch64_bin.tar.gz";
        String javaWindows = "https://download.oracle.com/java/24/latest/jdk-24_windows-x64_bin.exe";
        String javaMacos = "https://download.oracle.com/java/24/latest/jdk-24_macos-aarch64_bin.dmg";

        String[] arrayPrograms = {"IntelliJ IDEA", "Git", "Java"};

        System.out.println("Which program are you interested in?");
        String program = scanner.nextLine();

        boolean isProgramValid = false;
        for (String i : arrayPrograms) {
            if (i.equals(program)) {
                isProgramValid = true;
                break;
            }
        }
        if (!isProgramValid) {
            System.out.println("There is no such program.");
            return;
        }
        System.out.println("What operating system do you use?");
        String system = scanner.nextLine();

        switch (program) {
            case "IntelliJ IDEA":
                switch (system) {
                    case "Linux":
                        System.out.println(ideaLinux);
                        break;
                    case "MacOS":
                        System.out.println(ideaMac);
                        break;
                    case "Windows":
                        System.out.println(ideaWindows);
                        break;
                    default:
                        System.out.println("There is no such operating system");
                        break;
                }
                break;
            case "Git":
                switch (system) {
                    case "Linux":
                        System.out.println(gitLinux);
                        break;
                    case "MacOS":
                        System.out.println(gitMac);
                        break;
                    case "Windows":
                        System.out.println(gitWindows);
                        break;
                    default:
                        System.out.println("There is no such operating system");
                        break;
                }
                break;
            case "Java":
                switch (system) {
                    case "Linux":
                        System.out.println(javaLinux);
                        break;
                    case "MacOS":
                        System.out.println(javaMacos);
                        break;
                    case "Windows":
                        System.out.println(javaWindows);
                        break;
                    default:
                        System.out.println("There is no such operating system");
                        break;
                }
                break;
            default:
                System.out.println("There is no such program");
                break;
        }
    }
}
