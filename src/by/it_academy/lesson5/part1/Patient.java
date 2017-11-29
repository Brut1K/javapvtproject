package by.it_academy.lesson5.part1;

public class Patient extends People {
    private String cardNumber;
    private String doctorName;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
