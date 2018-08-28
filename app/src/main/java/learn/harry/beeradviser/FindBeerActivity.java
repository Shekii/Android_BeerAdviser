package learn.harry.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view)
    {
        TextView brands = (TextView)  findViewById(R.id.txtSelected);
        Spinner color = (Spinner) findViewById(R.id.listBeer);
        String beerColor = String.valueOf(color.getSelectedItem());

        List<String> brandList = expert.getBrands(beerColor);

        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand : brandList)
        {
            brandsFormatted.append(brand).append('\n');
        }

        brands.setText(brandsFormatted);


    }
}
