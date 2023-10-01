package com.cecilia.restaurant;


import android.os.Bundle;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.Toast;

        import androidx.fragment.app.Fragment;

public class FragmentoMenu extends Fragment {

    View view;
    Button botonMenuUno;
    Button botonMenuDos;
    Button botonMenuTres;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_menu, container, false);

        botonMenuUno = (Button) view.findViewById(R.id.btnmenu1);
        botonMenuUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Filete de Salmón Braseado... agregado a Favoritos", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Dos
        botonMenuDos = (Button) view.findViewById(R.id.btnmenu3);
        botonMenuDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Filet Mignon al Romero... agregado a Favoritos", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Tres
        botonMenuTres = (Button) view.findViewById(R.id.btnmenu3);
        botonMenuTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Mousse de Chocolate con Frutas de Verano... agregado a Favoritos", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}