package com.example.snipeswipe.pitchit2;

public class Users {

    //private variables
    int _id;
    String _name;
    String _age, _gender, _height, _weight, _sport, _education, _leagues, _email, _phoneNumber;

    // Empty constructor
    public Users(){

    }
    // constructor
    public Users(int id, String name, String age, String gender, String height, String weight, String sport, String education
            ,String leagues, String email, String phoneNumber){
        this._id = id;
        this._name = name;
        this._age = age;
        this._gender = gender;
        this._height = height;
        this._weight = weight;
        this._sport = sport;
        this._education = education;
        this._leagues = leagues;
        this._email = email;
        this._phoneNumber = phoneNumber;
    }

    // constructor
    public Users(String name, String age, String gender, String height, String weight,String sport, String education
            ,String leagues, String email, String phoneNumber){
        this._name = name;
        this._age = age;
        this._gender = gender;
        this._height = height;
        this._weight = weight;
        this._sport = sport;
        this._education = education;
        this._leagues = leagues;
        this._email = email;
        this._phoneNumber = phoneNumber;

    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getName(){
        return this._name;
    }

    // setting name
    public void setName(String name){
        this._name = name;
    }

    public String getAge(){
        return this._age;
    }

    // setting name
    public void setAge(String age){
        this._age = age;
    }

    public String getGender(){
        return this._gender;
    }

    // setting name
    public void setGender(String gender){
        this._gender = gender;
    }

    public String getHeight(){
        return this._height;
    }

    // setting name
    public void setHeight(String height){
        this._height = height;
    }

    public String getWeight(){
        return this._weight;
    }

    // setting name
    public void setWeight(String weight){
        this._weight = weight;
    }

    //---------------------------

    public String getSport(){
        return this._sport;
    }

    // setting name
    public void setSport(String sport){
        this._sport = sport;
    }

    public String getEducation(){
        return this._education;
    }

    // setting name
    public void setEducation(String education){
        this._education = education;
    }

    public String getLeagues(){
        return this._leagues;
    }

    // setting name
    public void setLeagues(String leagues){
        this._leagues = leagues;
    }

    public String getEmail(){
        return this._email;
    }

    // setting name
    public void setEmail(String email){
        this._email = email;
    }

    public String getPhoneNumber(){
        return this._phoneNumber;
    }

    // setting name
    public void setPhoneNumber(String phoneNumber){
        this._phoneNumber = phoneNumber;
    }

}
