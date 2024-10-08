package io.codeforall.fanSTATICs_;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        try {
            fileManager.login();
            fileManager.createFile("file 1");
            fileManager.getFile("file 1");
            fileManager.getFile("file 2");

        } catch (NotEnoughPermissionsException E) {
            System.out.println(E.notEnoughPermissionsMessage());

        } catch (NotEnoughSpaceException E) {
            System.out.println(E.notEnoughSpaceMessage());

        } catch (FileNotFoundException E) {
            System.out.println(E.notFoundMessage());
        }
    }
}
