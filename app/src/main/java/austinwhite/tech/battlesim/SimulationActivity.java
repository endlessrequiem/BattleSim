package austinwhite.tech.battlesim;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SimulationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simulation_activity);

        ActionBar actionbar = this.getSupportActionBar();
        assert actionbar != null;
        actionbar.setTitle("Simulation");
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);

        //TODO: Simulation Algorithm

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {// app icon in action bar clicked; go home
            Intent intent = new Intent(this, enemyInput.class);
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
