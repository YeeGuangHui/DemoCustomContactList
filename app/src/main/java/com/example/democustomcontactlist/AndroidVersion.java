package com.example.democustomcontactlist;

class AndroidVersion {

    public AndroidVersion(String name, int cc, int contact, char gender) {
        this.name = name;
        this.cc = cc;
        this.contact = contact;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getGender() {
        return contact;
    }

    public void setGender(int contact) {
        this.contact = contact;
    }

    String name;
    int cc;
    int contact;
    char gender;

    @Override
    public String toString() {
        return "AndroidVersion{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                ", contact=" + contact +
                '}';
    }

}
