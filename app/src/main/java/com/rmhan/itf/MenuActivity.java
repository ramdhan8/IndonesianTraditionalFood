package com.rmhan.itf;

import static androidx.core.content.ContentProviderCompat.requireContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
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

public class MenuActivity extends AppCompatActivity {
//    List<DataMenuAdapter> ListofDataMenuAdapter;
//    private String URL ="http://172.20.10.4/loginretro/menu.php";
//
//    String TAG_ID ="id_menu";
//    String TAG_NAME ="name";
//    String TAG_HARGA ="price";
//    String TAG_URL ="gambar_url";
//
//    JsonArrayRequest RequestOfJSonArray;
//    RequestQueue requestQueue;
//    View view;
//    int RecyclearViewItemPosition;
//    RecyclerView.LayoutManager layoutManagerOfrecycleView;
//    RecyclerView.Adapter recyclerViewadapter;
//    ArrayList<String> ImageTitleidArrayListForClick;
//    String username, name;
//    RecyclerView rvMenu;
//    List<ModelMenu> modelMenuList = new ArrayList<>();
//    TrendingAdapter trendingAdapter;
//    ModelTrending modelTrending;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_menu);
//
//        ImageTitleidArrayListForClick = new ArrayList<>();
//        ListofDataMenuAdapter = new ArrayList<>();
//
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rc_menu);
//        recyclerView.setHasFixedSize(true);
//        layoutManagerOfrecycleView = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManagerOfrecycleView);
//        JSON_HTTP();
//    }
//    public void JSON_HTTP() {
//        RequestOfJSonArray = new JsonArrayRequest(URL,
//                new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        ParseJsonResponse(response);
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                    }
//                });
//
//        requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(RequestOfJSonArray);
//    }
//    public void ParseJsonResponse (JSONArray array){
//        for (int i=0; i<array.length (); i++){
//            DataMenuAdapter GetDataAdapter2 = new DataMenuAdapter();
//            JSONObject json = null;
//            try {
//                json = array.getJSONObject(i);
//                ImageTitleidArrayListForClick.add(json.getString(TAG_ID));
//                GetDataAdapter2.setId_menu(json.getString(TAG_ID));
//                GetDataAdapter2.setName_menu(json.getString(TAG_NAME));
//                GetDataAdapter2.setHarga_menu(json.getString(TAG_HARGA));
//                GetDataAdapter2.seturl(json.getString(TAG_URL));
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            ListofDataMenuAdapter.add(GetDataAdapter2);
//        }
//        recyclerViewadapter = new RcMenuAdapter(ListofDataMenuAdapter, this);
//        rvMenu.setAdapter(recyclerViewadapter);
//    }
}