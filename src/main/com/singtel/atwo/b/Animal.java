package main.com.singtel.atwo.b;

abstract class   Animal {

    protected enum Gender {M,F};
    protected Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
