package austinwhite.tech.battlesim;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class playerInput extends AppCompatActivity {

    HashMap<String, Double> players = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_input);

        Button add = findViewById(R.id.addPlayer);
        Button next = findViewById(R.id.next);
        final TextView charList = findViewById(R.id.characterList);
        final EditText nameInput = findViewById(R.id.nameInput);
        final EditText healthInput = findViewById(R.id.healthInput);

        ActionBar actionbar = this.getSupportActionBar();
        assert actionbar != null;
        actionbar.setTitle("Player Input");
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String charName = nameInput.getText().toString();
                double charHealth = Double.parseDouble(healthInput.getText().toString());

                players.put(charName, charHealth);

                charList.setText(players
                        .toString()
                        .replace("{", "")
                        .replace("=", " HP: ")
                        .replace("}","")
                );

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start = new Intent(playerInput.this, enemyInput.class);
                startActivity(start);
                finish();
                overridePendingTransition(0, 0);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {// app icon in action bar clicked; go home
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            overridePendingTransition(0, 0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
