package com.rmhan.itf;
import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.rmhan.itf.R;
import com.rmhan.itf.model.favorite.DataFavAdapter;
import com.rmhan.itf.model.favorite.RcfavAdapter;
import com.rmhan.itf.model.rcmenu.DataMenuAdapter;
import com.rmhan.itf.model.rcmenu.RcMenuAdapter;
import com.rmhan.itf.model.recycleview.ModelMenu;
import com.rmhan.itf.model.recycleview.ModelTrending;
import com.rmhan.itf.model.recycleview.TrendingAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends Fragment {
    Button btn_jajan, btn_minuman, btn_jamu, btn_makanan, btn_sambal, btn_sayur;
    TextView etUsername, etName;
    SessionManager sessionManager;
    List<DataFavAdapter> ListofDataFavAdapter;

    List<DataMenuAdapter> ListofDataMenuAdapter;
    private String URL ="http://172.20.10.4/loginretro/favorite.php";

    String TAG_ID ="id_fav";
    String TAG_NAME ="name";
    String TAG_HARGA ="price";
    String TAG_URL ="gambar_url";

    JsonArrayRequest RequestOfJSonArray;
    RequestQueue requestQueue;
    View view;
    int RecyclearViewItemPosition;
    RecyclerView.LayoutManager layoutManagerOfrecycleView;
    RecyclerView.Adapter recyclerViewadapter;
    ArrayList<String> ImageTitleidArrayListForClick;
    String username, name;
    RecyclerView rvTrending;
    List<ModelTrending> modelTrendingList = new ArrayList<>();
    TrendingAdapter trendingAdapter;
    ModelTrending modelTrending;

    RecyclerView rvMenu;
    RecyclerView.Adapter secondRecyclerAdapter;
    List<ModelMenu> ModelMenuList = new ArrayList<>();

    private String SECOND_URL ="http://172.20.10.4/loginretro/menu.php";
    String MENU_ID ="id_menu";
    String MENU_NAME ="name";
    String MENU_HARGA ="price";
    String MENU_URL ="gambar_url";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_dashboard, container, false);

        sessionManager = new SessionManager(getActivity());
        if(!sessionManager.isLoggedIn()){
            // moveToLogin();
        }


        etName = view.findViewById(R.id.etMainName);
        name = sessionManager.getUserDetail().get(SessionManager.NAME);

        etName.setText(name);
        Button btn_jajan = (Button) view.findViewById(R.id.jajan);
//        btn_minuman = view.findViewById(R.id.minuman);
//        btn_jamu = view.findViewById(R.id.jamu);
//        btn_makanan = view.findViewById(R.id.makanan);
//        btn_sambal = view.findViewById(R.id.sambal);
//        btn_sayur = view.findViewById(R.id.sayur);

        btn_jajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), JajanActivity.class);
                startActivity(intent);
            }
        });
//
//        btn_minuman.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), MinumanActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btn_jamu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), JamuActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btn_makanan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), MakananActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btn_sambal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), SambalActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btn_sayur.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), SayurActivity.class);
//                startActivity(intent);
//            }
       // });

        rvTrending = view.findViewById(R.id.rc_favorite);
        rvTrending.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rvTrending.setHasFixedSize(true);
       // setTrending();

        ImageTitleidArrayListForClick = new ArrayList<>();
        ListofDataFavAdapter = new ArrayList<>();
        ListofDataMenuAdapter = new ArrayList<>();

       // recyclerView = (RecyclerView) view.findViewById(R.id.rc_favorite);
       // recyclerView.setHasFixedSize(true);
        layoutManagerOfrecycleView = new LinearLayoutManager(requireContext());
       // recyclerView.setLayoutManager(layoutManagerOfrecycleView);

        // Inisialisasi RecyclerView kedua
        rvMenu = view.findViewById(R.id.rc_menu);
        rvMenu.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        rvMenu.setHasFixedSize(true);

        JSON_HTTP_SECOND();
        JSON_HTTP();
        return view;
    }

//    private void setTrending() {
//        modelTrending = new ModelTrending(R.drawable.sate,"Sate", "2.200 disukai");
//        modelTrendingList.add(modelTrending);
//        modelTrending = new ModelTrending(R.drawable.rawon,"Rawon", "1.220 disukai");
//        modelTrendingList.add(modelTrending);
//        modelTrending = new ModelTrending(R.drawable.rendang,"Rendang", "345 disukai");
//        modelTrendingList.add(modelTrending);
//        modelTrending = new ModelTrending(R.drawable.nasgor,"Nasi Goreng", "590 disukai");
//        modelTrendingList.add(modelTrending);
//
//        trendingAdapter = new TrendingAdapter(getActivity(), modelTrendingList);
//        rvTrending.setAdapter(trendingAdapter);
//    }
    public void JSON_HTTP() {
        RequestOfJSonArray = new JsonArrayRequest(URL,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        ParseJsonResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        requestQueue = Volley.newRequestQueue(requireContext());
        requestQueue.add(RequestOfJSonArray);
    }
    public void ParseJsonResponse (JSONArray array){
        for (int i=0; i<array.length (); i++){
            DataFavAdapter GetDataAdapter2 = new DataFavAdapter();
            JSONObject json = null;
            try {
                json = array.getJSONObject(i);
                ImageTitleidArrayListForClick.add(json.getString(TAG_ID));
                GetDataAdapter2.setId_fav(json.getString(TAG_ID));
                GetDataAdapter2.setName_fav(json.getString(TAG_NAME));
                GetDataAdapter2.setHarga_fav(json.getString(TAG_HARGA));
                GetDataAdapter2.seturl(json.getString(TAG_URL));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ListofDataFavAdapter.add(GetDataAdapter2);
        }
        recyclerViewadapter = new RcfavAdapter(ListofDataFavAdapter, requireContext());
        rvTrending.setAdapter(recyclerViewadapter);
    }
    public void JSON_HTTP_SECOND() {
        // Buat request untuk JSON kedua
        RequestOfJSonArray = new JsonArrayRequest(SECOND_URL,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        ParseSecondJsonResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle error response
                    }
                });

        requestQueue = Volley.newRequestQueue(requireContext());
        requestQueue.add(RequestOfJSonArray);
    }

    // Metode untuk parsing data dari URL kedua
    public void ParseSecondJsonResponse(JSONArray array) {
        for (int i=0; i<array.length (); i++){
            DataMenuAdapter GetDataAdapter2 = new DataMenuAdapter();
            JSONObject json = null;
            try {
                json = array.getJSONObject(i);
                ImageTitleidArrayListForClick.add(json.getString(MENU_ID));
                GetDataAdapter2.setId_menu(json.getString(MENU_ID));
                GetDataAdapter2.setName_menu(json.getString(MENU_NAME));
                GetDataAdapter2.setHarga_menu(json.getString(MENU_HARGA));
                GetDataAdapter2.seturl(json.getString(MENU_URL));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ListofDataMenuAdapter.add(GetDataAdapter2);
        }
        secondRecyclerAdapter = new RcMenuAdapter(ListofDataMenuAdapter, requireContext());
        rvMenu.setAdapter(secondRecyclerAdapter);
    }
}