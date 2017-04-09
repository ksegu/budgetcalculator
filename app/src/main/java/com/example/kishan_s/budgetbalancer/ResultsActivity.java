package com.example.kishan_s.budgetbalancer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class ResultsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        final TextView totalCost = (TextView) findViewById(R.id.totalCost);
        totalCost.setText(""+money.addCosts());
        final TextView savings = (TextView) findViewById(R.id.savings);
        savings.setText(""+money.getSavings());
        final TextView incomeSpent = (TextView) findViewById(R.id.incomeSpent);
        incomeSpent.setText(""+money.percentOfTotalSpent());
        final TextView budgetSpent = (TextView) findViewById(R.id.budgetSpent);
        budgetSpent.setText(""+money.percentSpentBudget());
        final TextView rent = (TextView) findViewById(R.id.rent);
        rent.setText(""+money.percentSpentRent());
        final TextView clothesSpent = (TextView) findViewById(R.id.clothesSpent);
        clothesSpent.setText(""+money.percentSpentClothes());
        final TextView groceriesSpent = (TextView) findViewById(R.id.groceriesSpent);
        groceriesSpent.setText(""+money.percentSpentGroceries());
        final TextView eduSpent = (TextView) findViewById(R.id.eduSpent);
        eduSpent.setText(""+money.percentSpentEducationalSupplies());



        final Button pieChartButton = (Button) findViewById(R.id.pieChartButton);
        pieChartButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ResultsActivity.this, graphicsActivity.class);
                startActivity(intent);

        }
    });
}
}