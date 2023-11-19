package com.example.fragmentcodeapp2023;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    protected static final String FRAG2 = "2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);
        Context context = getActivity().getApplicationContext();

        //final String[] fruits={"Apple", "Mango", "Orange", "Grapes", "Banana"};
        final String[] items = {"EUR", "USD", "CHF", "HUF"};
        List<Item> list=new ArrayList<Item>(Arrays.asList(new Item("EUR","Euro","4.46 RON","5.56 RON"),
                new Item("USD","Amerikai dollár","3.91 RON","4.1 RON"),
                new Item("CHF","Svájci frank","4.23 RON","4.33 RON"),
                new Item("HUF","Forint","0.0136 RON","0.0146 RON")));
        ListView listView;
        int flagImages []={R.drawable.eu,R.drawable.usa,R.drawable.svajc,R.drawable.magyar};
        ListView fruitsList = view.findViewById(R.id.item_list);
        ArrayAdapter<String> arrayAdpt= new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, items);
        fruitsList.setAdapter(arrayAdpt);

        FragmentManager fm = getParentFragmentManager();
        fruitsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(fm.findFragmentByTag(FRAG2)!=null){
                    TextView rovidites = getActivity().findViewById(R.id.TextView);
                    ImageView image=getActivity().findViewById(R.id.image);
                    TextView teljes = getActivity().findViewById(R.id.teljes);
                    TextView veteliAr = getActivity().findViewById(R.id.veteliAr);
                    TextView eladasiAr = getActivity().findViewById(R.id.eladasiAr);
                    TextView eladas = getActivity().findViewById(R.id.eladas);
                    TextView vetel = getActivity().findViewById(R.id.vetel);
                    rovidites.setText( ((TextView) view).getText().toString());
                    teljes.setText(list.get(position).getPenznem());
                    veteliAr.setText(list.get(position).getVetelAr());
                    eladasiAr.setText(list.get(position).getEladasAr());
                    eladas.setText(list.get(position).getElad());
                    vetel.setText(list.get(position).getVasarol());
                    image.setImageResource(flagImages[position]);

                } else{
                    Intent intent = new Intent(getActivity().getApplicationContext(),  ShowItemActivity.class);
                    intent.putExtra("rovidites", ((TextView) view).getText().toString());
                    intent.putExtra("teljes",list.get(position).getPenznem() );
                    intent.putExtra("veteliAr",list.get(position).getVetelAr() );
                    intent.putExtra("eladasiAr",list.get(position).getEladasAr() );
                    intent.putExtra("eladas",list.get(position).getElad() );
                    intent.putExtra("vetel",list.get(position).getVasarol() );
                    intent.putExtra("image",flagImages[position]);
                    startActivity(intent);
                }
            }
        });

        return view;
    }
}