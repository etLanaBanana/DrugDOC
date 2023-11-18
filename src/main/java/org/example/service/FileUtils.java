package org.example.service;

import org.example.entity.*;

import java.lang.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FileUtils {

    static String[] getPartsOfLine(String line) {

        return line.split(", ");
    }

    public static List<User> readFileUser(String fileName) {
        List<User> listUser = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] partsOfLine = getPartsOfLine(line);

                User user = new User(UUID.randomUUID(), partsOfLine[0], partsOfLine[1]);

                listUser.add(user);
            }
            System.out.println(listUser);
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Exception er) {
                System.out.println("Произошла ошибка");
            }
            throw new RuntimeException("Такой файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listUser;
    }

    public static void writeDataToFileUser(List<User> listUser, String fileName) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            User[] users = (User[]) listUser.toArray();

            for (int i = 0; i < listUser.size(); i++) {
                bufferedWriter.write(users[i] + "\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<AvailabilityOfDrug> readAvailabilityOfDrug(String fileName) {
        List<AvailabilityOfDrug> availabilityOfDrugs = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] partsOfLine = getPartsOfLine(line);

                AvailabilityOfDrug availabilityOfDrug = new AvailabilityOfDrug(partsOfLine[0], Integer.parseInt(partsOfLine[1]));

                availabilityOfDrugs.add(availabilityOfDrug);
            }
            System.out.println(availabilityOfDrugs);
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Exception er) {
                System.out.println("Произошла ошибка");
            }
            throw new RuntimeException("Такой файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return availabilityOfDrugs;
    }

    public static void writeDataToAvailabilityOfDrug(List<AvailabilityOfDrug> availabilityOfDrugs, String fileName) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            AvailabilityOfDrug[] availabilityOfDrug = (AvailabilityOfDrug[]) availabilityOfDrugs.toArray();

            for (int i = 0; i < availabilityOfDrug.length; i++) {
                bufferedWriter.write(availabilityOfDrug[i] + "\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<GeneraleRecipeKey> readGeneraleRecipeKey(String fileName) {
        List<GeneraleRecipeKey> generaleRecipeKeys = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] partsOfLine = getPartsOfLine(line);

                GeneraleRecipeKey generaleRecipeKey = new GeneraleRecipeKey(partsOfLine[0],
                        partsOfLine[1], partsOfLine[2], partsOfLine[3], Integer.parseInt(partsOfLine[4]), partsOfLine[5]);

                generaleRecipeKeys.add(generaleRecipeKey);
            }
            System.out.println(generaleRecipeKeys);
            ;
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Exception er) {
                System.out.println("Произошла ошибка");
            }
            throw new RuntimeException("Такой файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return generaleRecipeKeys;
    }

    public static void writeDataToFileGeneraleRecipeKey(List<GeneraleRecipeKey> generaleRecipeKeys, String fileName) {
        Recipe recipe;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            GeneraleRecipeKey[] generaleRecipeKey = (GeneraleRecipeKey[]) generaleRecipeKeys.toArray();

            for (int i = 0; i < generaleRecipeKey.length; i++) {
                bufferedWriter.write(generaleRecipeKey[i] + "\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Recipe readRecipe(String fileName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Recipe recipe = new Recipe();
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] partsOfLine = getPartsOfLine(line);

                recipe = new Recipe(partsOfLine[0],
                        partsOfLine[1], partsOfLine[2], partsOfLine[3], Integer.parseInt(partsOfLine[4]), partsOfLine[5]);


            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Exception er) {
                System.out.println("Произошла ошибка");
            }
            throw new RuntimeException("Такой файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return recipe;
    }
    public static List<SignRecipe> readSignRecipe(String fileName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<SignRecipe> signRecipes = new ArrayList<>();
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            bufferedReader.readLine();

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] partsOfLine = getPartsOfLine(line);

              SignRecipe signRecipe = new SignRecipe(partsOfLine[0],
                        partsOfLine[1], partsOfLine[2]);
                signRecipes.add(signRecipe);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Exception er) {
                System.out.println("Произошла ошибка");
            }
            throw new RuntimeException("Такой файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return signRecipes;
    }
    public static void writeDataToSignRecipe(List<SignRecipe> signRecipe , String fileName) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            SignRecipe[] signRecipes = (SignRecipe[]) signRecipe.toArray();

            for (int i = 0; i < signRecipe.size(); i++) {
                bufferedWriter.write(signRecipes[i] + "\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


