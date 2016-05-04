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
public class Turistico1Fragment extends Fragment {

    Button bmsitio;


    public Turistico1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_turistico1, container, false);
        bmsitio = (Button) root.findViewById(R.id.bmsitio1);

        bmsitio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sitio = new Intent(getActivity(),MapsActivity.class);
                sitio.putExtra("latitude",6.169141);
                sitio.putExtra("longitude",-75.628446);
                sitio.putExtra("nombre","Acuaparque Ditaires");
                startActivity(sitio);
            }
        });
        return root;
    }
}
