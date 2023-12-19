package com.example.myrecyclerviewcardview;

public class Animal {
    public String Name;
    public float AverageAge;
    public int ImageResId;

    public Animal(String name, float averageAge, int imageResId) {
        Name = name;
        AverageAge = averageAge;
        ImageResId = imageResId;
    }

    public void setAverageAge(float averageAge) {
        AverageAge = averageAge;
    }

    public int getImageResId() {
        return ImageResId;
    }

    public void setImageResId(int imageResId) {
        ImageResId = imageResId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getAverageAge() {
        return AverageAge;
    }

    public void setAverageAge(int averageAge) {
        AverageAge = averageAge;
    }
}
