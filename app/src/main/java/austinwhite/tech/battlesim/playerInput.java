package austinwhite.tech.battlesim;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.LinkedList;

public class playerInput extends AppCompatActivity {

    HashMap<String, Double> list = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_input);

        Button add = findViewById(R.id.add);
        final TextView charList = findViewById(R.id.characterList);
        final EditText nameInput = findViewById(R.id.nameInput);
        final EditText healthInput = findViewById(R.id.healthInput);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String charName = nameInput.getText().toString();
                double charHealth = Double.parseDouble(healthInput.getText().toString());

                Character newChar = new Character(charName, charHealth);
                list.put(charName, charHealth);

                charList.setText(list
                        .toString()
                        .replace("{", "")
                        .replace("=", " HP: ")
                        .replace("}","")
                );

            }
        });


    }
}
