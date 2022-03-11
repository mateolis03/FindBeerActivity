package unipiloto.edu.co.findbeeractivity;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import unipiloto.edu.co.findbeeractivity.R;

import org.w3c.dom.Text;

import java.util.List;

public class Beer extends Activity {
    private BeerExpert beerExp = new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

    }

    public void onClickFindBeer(View view) {

        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.spinner);
        String beerType = String.valueOf(color.getSelectedItemId());
        List<String> brandL = beerExp.getBrands(beerType);
        brands.setText(brandL.toString());

    }

}