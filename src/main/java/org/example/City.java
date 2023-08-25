package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class City {
private  List<String> listCity;
    public List<String> searchCity(String search){
        listCity = new ArrayList<>();
        listCity.add("Paris");
        listCity.add("Budapest");
        listCity.add("Skopje");
        listCity.add("Rotterdam");
        listCity.add("Valence");
        listCity.add("Vancouver");
        listCity.add("Amsterdam");
        listCity.add("Vienne");
        listCity.add("Sydney");
        listCity.add("New York");
        listCity.add("Londres");
        listCity.add("Bangkok");
        listCity.add("Hong Kong");
        listCity.add("Dubaï");
        listCity.add("Rome");
        listCity.add("Istanbul");


        int sizeSearch = search.length();
        List<String> city = new ArrayList<>();
        if (sizeSearch >2 || search.equals("*")) {
            if (search == "*"){
                for (String el : listCity){
                    city.add(el);
                }
                return city;
            }
            for (int i = 0; i < listCity.size(); i++) {
                if (listCity.get(i).length() >= sizeSearch && listCity.get(i).toLowerCase().substring(0, sizeSearch).equals(search.toLowerCase())) {
                    city.add(listCity.get(i));
                }
            }
        }
            else{
                throw new RuntimeException();
            }
        System.out.println(city.size());

        return city;


    }

    public void setListCity(List<String> listCity) {
        this.listCity = listCity;
    }
}
