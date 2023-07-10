import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String gamesFolderPath = "D:\\Курсы программирования";

        File gamesFolder = new File(gamesFolderPath);
        if (!gamesFolder.exists()) {
            if (gamesFolder.mkdir()) {
                System.out.println("Папка Games создана успешно");
            } else {
                System.out.println("Не удалось создать папку Games");
                return;
            }
        }

        File srcFolder = new File(gamesFolder, "src");
        if (srcFolder.mkdir()) {
            System.out.println("Папка src создана успешно");
        } else {
            System.out.println("Не удалось создать папку src");
            return;
        }

        File mainFolder = new File(srcFolder, "main");
        if (mainFolder.mkdir()) {
            System.out.println("Папка main создана успешно");
        } else {
            System.out.println("Не удалось создать папку main");
            return;
        }

        File testFolder = new File(srcFolder, "test");
        if (testFolder.mkdir()) {
            System.out.println("Папка test создана успешно");
        } else {
            System.out.println("Не удалось создать папку test");
            return;
        }

        File mainFile = new File(mainFolder, "Main.java");
        try {
            if (mainFile.createNewFile()) {
                System.out.println("Файл Main.java создан успешно");
            } else {
                System.out.println("Не удалось создать файл Main.java");
                return;
            }
        } catch (IOException e) {
            System.out.println("Не удалось создать файл Main.java: " + e.getMessage());
            return;
        }

        File utilsFile = new File(mainFolder, "Utils.java");
        try {
            if (utilsFile.createNewFile()) {
                System.out.println("Файл Utils.java создан успешно");
            } else {
                System.out.println("Не удалось создать файл Utils.java");
                return;
            }
        } catch (IOException e) {
            System.out.println("Не удалось создать файл Utils.java: " + e.getMessage());
            return;
        }

        File resFolder = new File(gamesFolder, "res");
        if (resFolder.mkdir()) {
            System.out.println("Папка res создана успешно");
        } else {
            System.out.println("Не удалось создать папку res");
            return;
        }

        File drawablesFolder = new File(resFolder, "drawables");
        if (drawablesFolder.mkdir()) {
            System.out.println("Папка drawables создана успешно");
        } else {
            System.out.println("Не удалось создать папку drawables");
            return;
        }

        File vectorsFolder = new File(resFolder, "vectors");
        if (vectorsFolder.mkdir()) {
            System.out.println("Папка vectors создана успешно");
        } else {
            System.out.println("Не удалось создать папку vectors");
            return;
        }

        File iconsFolder = new File(resFolder, "icons");
        if (iconsFolder.mkdir()) {
            System.out.println("Папка icons создана успешно");
        } else {
            System.out.println("Не удалось создать папку icons");
            return;
        }

        File savegamesFolder = new File(gamesFolder, "savegames");
        if (savegamesFolder.mkdir()) {
            System.out.println("Папка savegames создана успешно");
        } else {
            System.out.println("Не удалось создать папку savegames");
            return;
        }

        File tempFolder = new File(gamesFolder, "temp");
        if (tempFolder.mkdir()) {
            System.out.println("Папка temp создана успешно");
        } else {
            System.out.println("Не удалось создать папку temp");
            return;
        }

        File tempFile = new File(tempFolder, "temp.txt");
        try {
            if (tempFile.createNewFile()) {
                System.out.println("Файл temp.txt создан успешно");
            } else {
                System.out.println("Не удалось создать файл temp.txt");
                return;
            }
        } catch (IOException e) {
            System.out.println("Не удалось создать файл temp.txt: " + e.getMessage());
            return;
        }

        StringBuilder logBuilder = new StringBuilder();
        logBuilder.append("Все файлы и папки успешно созданы.");
        String log = logBuilder.toString();

        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(log);
            System.out.println("Файл temp.txt успешно заполнен");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл temp.txt: " + e.getMessage());
        }
    }
}
