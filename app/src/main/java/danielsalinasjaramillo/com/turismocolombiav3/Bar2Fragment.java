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
public class Bar2Fragment extends Fragment {

    Button bmbar;

    public Bar2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_bar2, container, false);
        bmbar = (Button) root.findViewById(R.id.bmbar2);

        bmbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bar = new Intent(getActivity(),MapsActivity.class);
                bar.putExtra("latitude",6.171196);
                bar.putExtra("longitude",-75.61097);
                bar.putExtra("nombre","SAN ESTEBAN, Parrilla y Bar");
                startActivity(bar);
            }
        });
        return root;
    }
}