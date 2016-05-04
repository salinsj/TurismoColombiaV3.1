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
public class Bar3Fragment extends Fragment {

    Button bmbar;

    public Bar3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_bar3, container, false);
        bmbar = (Button) root.findViewById(R.id.bmbar3);

        bmbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bar = new Intent(getActivity(),MapsActivity.class);
                bar.putExtra("latitude",6.165099);
                bar.putExtra("longitude",-75.61063);
                bar.putExtra("nombre","Discoteca Mangos");
                startActivity(bar);
            }
        });
        return root;
    }
}