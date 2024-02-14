package com.example.vaiah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkEntrada1, checkEntrada2, checkEntrada3, checkEntrada4;
    private CheckBox checkPrincipal1, checkPrincipal2, checkPrincipal3, checkPrincipal4;
    private CheckBox checkBebida1, checkBebida2;
    private CheckBox checkSobremesa1, checkSobremesa2, checkSobremesa3, checkSobremesa4;

    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkEntrada1 = findViewById(R.id.check_1appetizer);
        checkEntrada2 = findViewById(R.id.check_2appetizer);
        checkEntrada3 = findViewById(R.id.check_3appetizer);
        checkEntrada4 = findViewById(R.id.check_4appetizer);

        checkPrincipal1 = findViewById(R.id.check_1principal);
        checkPrincipal2 = findViewById(R.id.check_2principal);
        checkPrincipal3 = findViewById(R.id.check_3principal);
        checkPrincipal4 = findViewById(R.id.check_4principal);

        checkBebida1 = findViewById(R.id.check_1drink);
        checkBebida2 = findViewById(R.id.check_2drink);

        checkSobremesa1 = findViewById(R.id.check_1dessert);
        checkSobremesa2 = findViewById(R.id.check_2dessert);
        checkSobremesa3 = findViewById(R.id.check_3dessert);
        checkSobremesa4 = findViewById(R.id.check_4dessert);


//        Intent in = new Intent(this, TelaInicial.class);
//        startActivity(in);
    }

    public int CheckEntrada() {
        boolean Entrada1 = checkEntrada1.isChecked();
        boolean Entrada2 = checkEntrada2.isChecked();
        boolean Entrada3 = checkEntrada3.isChecked();
        boolean Entrada4 = checkEntrada4.isChecked();
        int Compraentradas = 0;

        if (Entrada1) {
            Compraentradas += 10;
        }
        if (Entrada2) {
            Compraentradas += 8;
        }
        if (Entrada3) {
            Compraentradas += 25;
        }
        if (Entrada4) {
            Compraentradas += 10;
        }
        return Compraentradas;
    }

    public int CheckPrincipal() {
        boolean Principal1 = checkPrincipal1.isChecked();
        boolean Principal2 = checkPrincipal2.isChecked();
        boolean Principal3 = checkPrincipal3.isChecked();
        boolean Principal4 = checkPrincipal4.isChecked();
        int Compraprincipal = 0;

        if (Principal1) {
            Compraprincipal += 27;
        }
        if (Principal2) {
            Compraprincipal += 21;
        }
        if (Principal3) {
            Compraprincipal += 15;
        }
        if (Principal4) {
            Compraprincipal += 30;
        }
        return Compraprincipal;
    }

    public int CheckBebida() {
        boolean Bebida1 = checkBebida1.isChecked();
        boolean Bebida2 = checkBebida2.isChecked();

        int Comprabebida = 0;

        if (Bebida1) {
            Comprabebida += 9;
        }
        if (Bebida2) {
            Comprabebida += 2;
        }

        return Comprabebida;
    }

    public int CheckSobremesa() {
        boolean Sobremeasa1 = checkSobremesa1.isChecked();
        boolean Sobremeasa2 = checkSobremesa2.isChecked();
        boolean Sobremeasa3 = checkSobremesa3.isChecked();
        boolean Sobremeasa4 = checkSobremesa4.isChecked();
        int Comprasobremesa = 0;

        if (Sobremeasa1) {
            Comprasobremesa += 8;
        }
        if (Sobremeasa2) {
            Comprasobremesa += 12;
        }
        if (Sobremeasa3) {
            Comprasobremesa += 20;
        }
        if (Sobremeasa4) {
            Comprasobremesa += 18;
        }
        return Comprasobremesa;
    }

    public void Order(View view) {
        total = CheckEntrada() + CheckPrincipal() + CheckBebida() + CheckSobremesa();
        TextView purchased = findViewById(R.id.text_purchased);

        String meu = String.valueOf(total);
        purchased.setText("R$ " + meu);
    }

    public void MakeOrder(View view) {
        try {
            if (total > 0)
                Toast.makeText(this, R.string.PedidoFeito, Toast.LENGTH_LONG).show();
            else {
                throw new Exception("Selecione pelo menos um produto");
            }
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}