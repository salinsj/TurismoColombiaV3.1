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
public class Turistico3Fragment extends Fragment {

    Button bmsitio;

    public Turistico3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_turistico3, container, false);
        bmsitio = (Button) root.findViewById(R.id.bmsitio3);

        bmsitio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sitio = new Intent(getActivity(),MapsActivity.class);
                sitio.putExtra("latitude", 6.19244);
                sitio.putExtra("longitude", -75.592663);
                sitio.putExtra("nombre", "Parque De Las Chimeneas");
                startActivity(sitio);
            }
        });
        return root;
    }
}
