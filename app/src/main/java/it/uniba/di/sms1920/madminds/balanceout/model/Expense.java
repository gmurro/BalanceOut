package it.uniba.di.sms1920.madminds.balanceout.model;

import java.util.ArrayList;
import java.util.Date;

public class Expense {

    public static final int EQUAL_DIVISION=0;
    public static final int PERSON_DIVISION=1;

    private String id;
    private ArrayList<Payer> payersExpense;
    private Date data;
    private double amount;
    private int typeDivision;
    private String descrizione;
    private String receipt;
    private ArrayList<Payer> payersDebt;

    public Expense(String id, ArrayList<Payer> payersExpense, Date data, double amount, int typeDivision, String descrizione, String receipt, ArrayList<Payer> payersDebt) {
        this.id = id;
        this.payersExpense = payersExpense;
        this.data = data;
        this.amount = amount;
        this.typeDivision = typeDivision;
        this.descrizione = descrizione;
        this.receipt = receipt;
        this.payersDebt = payersDebt;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Payer> getPayersExpense() {
        return payersExpense;
    }

    public Date getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public int getTypeDivision() {
        return typeDivision;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getReceipt() {
        return receipt;
    }

    public ArrayList<Payer> getPayersDebt() {
        return payersDebt;
    }
}
