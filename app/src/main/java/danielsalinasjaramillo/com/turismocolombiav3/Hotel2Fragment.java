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
public class Hotel2Fragment extends Fragment {

    Button bmhotel;

    public Hotel2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_hotel2, container, false);
        bmhotel = (Button) root.findViewById(R.id.bmhotel2);

        bmhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent hotel = new Intent(getActivity(),MapsActivity.class);
                hotel.putExtra("latitude",6.171425);
                hotel.putExtra("longitude",-75.608799);
                hotel.putExtra("nombre","Hotel Ruiseñor");
                startActivity(hotel);
            }
        });
        return root;
    }
}