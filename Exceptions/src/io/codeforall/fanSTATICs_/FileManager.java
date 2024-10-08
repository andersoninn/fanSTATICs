package io.codeforall.fanSTATICs_;

public class FileManager {
    private boolean logged;
    private int fileCounter;
    private int newFileCounter;
    public File[] fileArray = new File[5];

    public FileManager() {
        this.logged = false;
        this.fileCounter = 0;
        this.newFileCounter = 0;
    }

    public void login() {
        this.logged = true;
    }

    public void logout() {
        this.logged = false;
    }

    public void createFile(String name) throws NotEnoughSpaceException, NotEnoughPermissionsException {
        if (logged == false) {
            throw new NotEnoughPermissionsException();
        }

        for (int i = 0; i < fileArray.length; i++) {
            if (fileArray[i] == null) {
                fileArray[0] = new File(name);
                System.out.println("File " + name + " created");
            }
            throw new NotEnoughSpaceException();
        }

        /*
        switch (fileCounter) {
            case 0:
                fileArray[0] = new File(name);
                System.out.println("File " + name + " created");
                break;
            case 1:
                fileArray[1] = new File(name);
                System.out.println("File " + name + " created");
                break;
            case 2:
                fileArray[2] = new File(name);
                System.out.println("File " + name + " created");
                break;
            case 3:
                fileArray[3] = new File(name);
                System.out.println("File " + name + " created");
                break;
            case 4:
                fileArray[4] = new File(name);
                System.out.println("File " + name + " created");
                break;
            default:
        }  */
    }

    public void getFile(String name) throws NotEnoughPermissionsException, FileNotFoundException {
        if (logged == false) {
            throw new NotEnoughPermissionsException();
        }

        for (int i = 0; i < fileArray.length; i++) {
            if (fileArray[i] == null) {
                throw new FileNotFoundException();
            }
            System.out.println("File " + name + " found");
        }
    }
}

