package it.uniba.di.sms1920.madminds.balanceout.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Expense {

    public static final int EQUAL_DIVISION=0;
    public static final int PERSON_DIVISION=1;
    public static final int NEVER = 0;
    public static final int DAYLY = 1;
    public static final int WEEKLY = 2;
    public static final int MONTHLY = 3;
    public static final String EXPENSES = "expenses";
    public static final String ID = "id";
    public static final String PAYERS_EXPENSE = "payersExpense";
    public static final String DATA = "data";
    public static final String DESCRIPTION = "description";
    public static final String RECEIPT = "receipt";
    public static final String PAYERS_DEBT = "payersDebt";
    public static final String ID_GROUP = "idGroup";
    public static final String TYPE_DIVISION = "typeDivision";
    public static final String REPETITION = "repetition";
    public static final String ACTIVE = "active";

    private String id;
    private ArrayList<Payer> payersExpense;
    private String data;
    private int typeDivision;
    private String description;
    private String receipt;
    private ArrayList<Payer> payersDebt;
    private String idGroup;
    private int repetition;
    private boolean active;

    public Expense(String id, ArrayList<Payer> payersExpense, String data, int typeDivision, String description, String receipt, ArrayList<Payer> payersDebt, String idGroup, int repetition, boolean active) {
        this.id = id;
        this.payersExpense = payersExpense;
        this.data = data;
        this.typeDivision = typeDivision;
        this.description = description;
        this.receipt = receipt;
        this.payersDebt = payersDebt;
        this.idGroup = idGroup;
        this.repetition = repetition;
        this.active = active;
    }

    public Expense(){
        super();
        payersDebt = new ArrayList<>();
        payersExpense = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id='" + id + '\'' +
                ", payersExpense=" + payersExpense +
                ", data='" + data + '\'' +
                ", typeDivision=" + typeDivision +
                ", description='" + description + '\'' +
                ", receipt='" + receipt + '\'' +
                ", payersDebt=" + payersDebt +
                ", idGroup='" + idGroup + '\'' +
                ", repetition=" + repetition + '\'' +
                ", active=" + active +
                '}';
    }

    public String getId() {
        return id;
    }

    public ArrayList<Payer> getPayersExpense() {
        return payersExpense;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getData() {
        return data;
    }

    public int getTypeDivision() {
        return typeDivision;
    }

    public String getDescription() {
        return description;
    }


    public String getReceipt() {
        return receipt;
    }

    public ArrayList<Payer> getPayersDebt() {
        return payersDebt;
    }

    public int getRepetition() {
        return repetition;
    }

    public void setRepetition(int repetition) {
        this.repetition = repetition;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPayersExpense(ArrayList<Payer> payersExpense) {
        this.payersExpense = payersExpense;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTypeDivision(int typeDivision) {
        this.typeDivision = typeDivision;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public void setPayersDebt(ArrayList<Payer> payersDebt) {
        this.payersDebt = payersDebt;
    }

    public String getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(String idGroup) {
        this.idGroup = idGroup;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        //new SimpleDateFormat("dd/MM/yyyy").format(creationDataGroup)

        result.put(ID, id);
        //result.put(PAYERS_EXPENSE, payersExpense);
        result.put(DATA, data);
        result.put(DESCRIPTION, description);
        result.put(RECEIPT, receipt);
        result.put(PAYERS_DEBT, payersDebt);
        result.put(ID_GROUP, idGroup);
        result.put(TYPE_DIVISION, typeDivision);
        result.put(REPETITION, repetition);
        result.put(ACTIVE, active);

        return result;
    }

    /* funzione che controlla se l'idExpense è presente nell array expenses
       restituisce -1 se non c'e,
       l'indice in cui si trova se c'e
     */
    public static int containsIdExpense(ArrayList<Expense> expenses, String idExpense) {
        int i=0;
        for (Expense e: expenses) {
            if(e.getId().equals(idExpense)) {
                return i;
            }
            i++;
        }
        if(i==expenses.size()) {
            i=-1;
        }
        return -1;
    }
}
