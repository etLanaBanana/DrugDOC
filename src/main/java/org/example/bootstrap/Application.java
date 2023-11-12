package org.example.bootstrap;

import org.example.entity.AvailabilityOfDrug;
import org.example.entity.GeneraleRecipeKey;
import org.example.entity.Recipe;
import org.example.entity.User;
import org.apache.commons.codec.digest.HmacUtils;
import org.example.service.FileUtils;
import org.example.service.Menu;

import java.util.List;
import java.util.Scanner;

import static org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_224;

public class Application {
    //   public final List<SalesJournal> salesJournals;
    public final List<User> users;
    public final List<GeneraleRecipeKey> generaleRecipeKeys;
    public final List<AvailabilityOfDrug> availabilityOfDrugs;
    public final Recipe recipe;



    public Application() {
        users = FileUtils.readFileUser("src\\main\\resources\\users");
        generaleRecipeKeys = FileUtils.readGeneraleRecipeKey("src\\main\\resources\\generaleRecipeKey");
        availabilityOfDrugs = FileUtils.readAvailabilityOfDrug("src\\main\\resources\\availabilityOfDrug");
        recipe = FileUtils.readRecipe("src\\main\\resources\\recipe");
    }

    public static void runApplication() {
        Application a = new Application();
        Scanner keyboard = new Scanner(System.in);
//       System.out.println(a.users);
//       System.out.println("Введите ваше ФИО");
//        String login = keyboard.nextLine();
//      System.out.println("Введите ваш пароль");
//        String password = keyboard.nextLine();
//        AuthorisationService authorisationService = new AuthorisationService();
//       while (!authorisationService.tryToAuthoriseUser(login, password, a.users)) {
//           System.out.println("Введите ваш пароль");
//           password = keyboard.nextLine();
//        }
        System.out.println("Выберите один из пунктов");
        Menu menu = new Menu();
        menu.printMenu();
        String input = keyboard.nextLine();
        while (!(input.equals("1")) && !(input.equals("2")) && !(input.equals("3"))) {
            System.out.println("Введите 1, 2 или 3");
            input = keyboard.nextLine();
        }
        if (input.equals("1")) {
            System.out.println("_______________________________________________________________");
            System.out.println("Введите название препарата: ");
            String title = keyboard.nextLine();
            boolean isDrugAvailable = false;
            for (AvailabilityOfDrug availability : a.availabilityOfDrugs) {
                if (availability.getTitleDrug().equals(title)) {
                    System.out.println(title + " есть в наличии");
                    isDrugAvailable = true;
                    break;
                }
            }
            if (!isDrugAvailable) {
                System.out.println(title + " нет в наличии");
            }
            System.out.println("_______________________________________________________________");
            menu.printMenu();
            input = keyboard.nextLine();
        }

        if (input.equals("2")) {
            System.out.println(a.recipe);
            menu.printMenu1();
            String k = keyboard.nextLine();
            while (!k.equals("4")) {
                if (k.equals("1")) {
                    for (GeneraleRecipeKey generale : a.generaleRecipeKeys) {
                        String hashedPassword = new HmacUtils(HMAC_SHA_224, "secret".getBytes()).hmacHex(generale.keyWord);
                        if (hashedPassword.equals(a.recipe.uniqueKey)) {
                            System.out.println("Рецепт прошел проверку на подлинность");
                            k = keyboard.nextLine();
                            break;
                        }
                    }
                }
                if (k.equals("2")) {
                }
                if (k.equals("3")) {

                }
            }
        }
        if (input.equals("3")) {
            System.out.println("Введите название препарата, который хотите принять: ");
            String title = keyboard.next();
            System.out.println(title + " принят");
        }
    }
}

