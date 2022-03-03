package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import co.edu.unipiloto.BeerExpert;

import org.w3c.dom.Text;

import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert beerExp = new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    public void onClickFindBeer(View view) {

        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.spinner);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandL = beerExp.getBrands(beerType);
        brands.setText(brandL.toString());

        }

}