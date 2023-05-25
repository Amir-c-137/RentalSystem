package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//       1- read from json
        Gson gson = new Gson(); // create a new Gson object
        Reader reader = new FileReader("C:\\Users\\trool\\OneDrive\\Desktop\\code stuff\\RentalSystem FinalV\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json"); // open the input file
        AllModules allModulesList = gson.fromJson(reader, new TypeToken<AllModules>() {
        }.getType());
        Customer Joshn = allModulesList.getCustomers().get(0);
        Customer Emily = allModulesList.getCustomers().get(1);
        Customer Brown = allModulesList.getCustomers().get(2);
        for (Item tempItem : allModulesList.getBooks()) {
            if (tempItem.ID == 3) {
                RentalStore.rentItem(tempItem, Joshn);
            } else if (tempItem.ID == 6) {
                RentalStore.rentItem(tempItem, Joshn);
            }
        }
        for (Item tempItem : allModulesList.getBooks()) {
            if (tempItem.ID == 1) {
                RentalStore.rentItem(tempItem, Emily);
            } else if (tempItem.ID == 7) {
                RentalStore.rentItem(tempItem, Emily);
            }
        }
        for (Item tempItem : allModulesList.getBooks()) {
            if (tempItem.ID == 9) {
                RentalStore.rentItem(tempItem, Brown);
            } else if (tempItem.ID == 4) {
                RentalStore.rentItem(tempItem, Brown);
            }
        }
        reader.close();
//      2-write in json
        Gson writing = new Gson();
        String json = writing.toJson(allModulesList);
        String filePath ="C:\\Users\\trool\\OneDrive\\Desktop\\code stuff\\RentalSystem FinalV\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();
            System.out.println("JSON Data has been updated");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}