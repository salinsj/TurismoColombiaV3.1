package danielsalinasjaramillo.com.turismocolombiav3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemografiaFragment extends Fragment {

    Button bmciudad;

    public DemografiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_demografia, container, false);
        bmciudad = (Button) root.findViewById(R.id.bmitagui);

        bmciudad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ciudad = new Intent(getActivity(),MapsActivity.class);
                ciudad.putExtra("latitude", 6.175336);
                ciudad.putExtra("longitude", -75.6139399);
                ciudad.putExtra("nombre", "ITAGÜI");
                startActivity(ciudad);
            }
        });
        return root;
    }
}
