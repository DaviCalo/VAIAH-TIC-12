package com.example.vaiah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkAppetizer1, checkAppetizer2, checkAppetizer3, checkAppetizer4;
    private CheckBox checkPrincipal1, checkPrincipal2, checkPrincipal3, checkPrincipal4;
    private CheckBox checkDrink1, checkDrink2;
    private CheckBox checkDessert1, checkDessert2, checkDessert3, checkDessert4;

    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkAppetizer1 = findViewById(R.id.check_1appetizer);
        checkAppetizer2 = findViewById(R.id.check_2appetizer);
        checkAppetizer3 = findViewById(R.id.check_3appetizer);
        checkAppetizer4 = findViewById(R.id.check_4appetizer);

        checkPrincipal1 = findViewById(R.id.check_1principal);
        checkPrincipal2 = findViewById(R.id.check_2principal);
        checkPrincipal3 = findViewById(R.id.check_3principal);
        checkPrincipal4 = findViewById(R.id.check_4principal);

        checkDrink1 = findViewById(R.id.check_1drink);
        checkDrink2 = findViewById(R.id.check_2drink);

        checkDessert1 = findViewById(R.id.check_1dessert);
        checkDessert2 = findViewById(R.id.check_2dessert);
        checkDessert3 = findViewById(R.id.check_3dessert);
        checkDessert4 = findViewById(R.id.check_4dessert);

    }

    public int CheckAppetizerFun() {
        boolean Appetizer1 = checkAppetizer1.isChecked();
        boolean Appetizer2 = checkAppetizer2.isChecked();
        boolean Appetizer3 = checkAppetizer3.isChecked();
        boolean Appetizer4 = checkAppetizer4.isChecked();
        int AppetizerTotal = 0;

        if (Appetizer1) {
            AppetizerTotal += 10;
        }
        if (Appetizer2) {
            AppetizerTotal += 8;
        }
        if (Appetizer3) {
            AppetizerTotal += 25;
        }
        if (Appetizer4) {
            AppetizerTotal += 10;
        }
        return AppetizerTotal;
    }

    public int CheckPrincipalFun() {
        boolean Principal1 = checkPrincipal1.isChecked();
        boolean Principal2 = checkPrincipal2.isChecked();
        boolean Principal3 = checkPrincipal3.isChecked();
        boolean Principal4 = checkPrincipal4.isChecked();
        int PrincipalTotal = 0;

        if (Principal1) {
            PrincipalTotal += 27;
        }
        if (Principal2) {
            PrincipalTotal += 21;
        }
        if (Principal3) {
            PrincipalTotal += 15;
        }
        if (Principal4) {
            PrincipalTotal += 30;
        }
        return PrincipalTotal;
    }

    public int CheckDrinkFun() {
        boolean Drink1 = checkDrink1.isChecked();
        boolean Drink2 = checkDrink2.isChecked();

        int DrinkTotal = 0;

        if (Drink1) {
            DrinkTotal += 9;
        }
        if (Drink2) {
            DrinkTotal += 2;
        }

        return DrinkTotal;
    }

    public int CheckDessertFun() {
        boolean Dessert1 = checkDessert1.isChecked();
        boolean Dessert2 = checkDessert2.isChecked();
        boolean Dessert3 = checkDessert3.isChecked();
        boolean Dessert4 = checkDessert4.isChecked();
        int DessertTotal = 0;

        if (Dessert1) {
            DessertTotal += 8;
        }
        if (Dessert2) {
            DessertTotal += 12;
        }
        if (Dessert3) {
            DessertTotal += 20;
        }
        if (Dessert4) {
            DessertTotal += 18;
        }
        return DessertTotal;
    }

    public void Order(View view) {
        total = CheckAppetizerFun() + CheckPrincipalFun() + CheckDrinkFun() + CheckDessertFun();
        TextView purchased = findViewById(R.id.text_purchased);

        String pay = "R$ " + total;
        purchased.setText(pay);
    }

    public void MakeOrder(View view) {
        try {
            if (total > 0)
                Toast.makeText(this, R.string.PedidoFeito, Toast.LENGTH_LONG).show();
            else {
                throw new Exception(getString(R.string.text_exception));
            }
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}