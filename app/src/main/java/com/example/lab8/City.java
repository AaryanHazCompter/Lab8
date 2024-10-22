package com.example.lab8;

public class City implements Comparable<Object>{

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    /**
     * This overrides the default compareTo function to handle City objects.
     * @param o
     * (City) object provided to the  function
     * @return
     * Returns a comparison between city names
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * This overrides the default equal function to expand on handling City objects.
     * @param o
     * (City) object provided to the function
     * @return
     * Return true or false if the given object is or is not equal to the other object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City object = (City) o;
        return city.equals(object.city) && province.equals(object.province);
    }
}
